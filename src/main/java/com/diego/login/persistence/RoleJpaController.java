/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.login.persistence;

import com.diego.login.controller.Role;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.diego.login.controller.User;
import com.diego.login.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Diego
 */
public class RoleJpaController implements Serializable {

    public RoleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public RoleJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public void create(Role role) {
        if (role.getUserList() == null) {
            role.setUserList(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedUserList = new ArrayList<User>();
            for (User userListUserToAttach : role.getUserList()) {
                userListUserToAttach = em.getReference(userListUserToAttach.getClass(), userListUserToAttach.getId());
                attachedUserList.add(userListUserToAttach);
            }
            role.setUserList(attachedUserList);
            em.persist(role);
            for (User userListUser : role.getUserList()) {
                Role oldRoleOfUserListUser = userListUser.getRole();
                userListUser.setRole(role);
                userListUser = em.merge(userListUser);
                if (oldRoleOfUserListUser != null) {
                    oldRoleOfUserListUser.getUserList().remove(userListUser);
                    oldRoleOfUserListUser = em.merge(oldRoleOfUserListUser);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Role role) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Role persistentRole = em.find(Role.class, role.getId());
            List<User> userListOld = persistentRole.getUserList();
            List<User> userListNew = role.getUserList();
            List<User> attachedUserListNew = new ArrayList<User>();
            for (User userListNewUserToAttach : userListNew) {
                userListNewUserToAttach = em.getReference(userListNewUserToAttach.getClass(), userListNewUserToAttach.getId());
                attachedUserListNew.add(userListNewUserToAttach);
            }
            userListNew = attachedUserListNew;
            role.setUserList(userListNew);
            role = em.merge(role);
            for (User userListOldUser : userListOld) {
                if (!userListNew.contains(userListOldUser)) {
                    userListOldUser.setRole(null);
                    userListOldUser = em.merge(userListOldUser);
                }
            }
            for (User userListNewUser : userListNew) {
                if (!userListOld.contains(userListNewUser)) {
                    Role oldRoleOfUserListNewUser = userListNewUser.getRole();
                    userListNewUser.setRole(role);
                    userListNewUser = em.merge(userListNewUser);
                    if (oldRoleOfUserListNewUser != null && !oldRoleOfUserListNewUser.equals(role)) {
                        oldRoleOfUserListNewUser.getUserList().remove(userListNewUser);
                        oldRoleOfUserListNewUser = em.merge(oldRoleOfUserListNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = role.getId();
                if (findRole(id) == null) {
                    throw new NonexistentEntityException("The role with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Role role;
            try {
                role = em.getReference(Role.class, id);
                role.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The role with id " + id + " no longer exists.", enfe);
            }
            List<User> userList = role.getUserList();
            for (User userListUser : userList) {
                userListUser.setRole(null);
                userListUser = em.merge(userListUser);
            }
            em.remove(role);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Role> findRoleEntities() {
        return findRoleEntities(true, -1, -1);
    }

    public List<Role> findRoleEntities(int maxResults, int firstResult) {
        return findRoleEntities(false, maxResults, firstResult);
    }

    private List<Role> findRoleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Role.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Role findRole(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Role.class, id);
        } finally {
            em.close();
        }
    }

    public int getRoleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Role> rt = cq.from(Role.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
