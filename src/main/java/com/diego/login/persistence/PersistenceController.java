package com.diego.login.persistence;

import com.diego.login.controller.Role;
import com.diego.login.controller.User;
import com.diego.login.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    UserJpaController userJpa = new UserJpaController();
    RoleJpaController roleJpa = new RoleJpaController();

    public List<User> loadUsers() {
        return userJpa.findUserEntities();
        //SELECT * FROM USERS
    }  

    public List<Role> loadRoles() {
        return roleJpa.findRoleEntities();
    }

    public void registerUser(User us) {
        userJpa.create(us);
    }

    public void userDelete(int idUser) {
        try {
            userJpa.destroy(idUser);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User loadUser(int idUser) {
        return userJpa.findUser(idUser);
    }

    public void editUser(User us) {
        try {
            userJpa.edit(us);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
