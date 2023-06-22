package com.diego.login.controller;

import com.diego.login.persistence.PersistenceController;
import java.util.List;

public class Controller {

    PersistenceController persControl;

    public Controller() {
        persControl = new PersistenceController();
    }

    public User validateUser(String user, String password) {

        //String message = "";
        User usr = null;
        List<User> userList = persControl.loadUsers();

        for (User us : userList) {
            if (us.getUserName().equals(user)) {
                if (us.getPassword().equals(password)) {
                    //message = "Usuario y contraseña correctos."Bienvenido al sistema";
                    usr = us;
                    return usr;
                } else {
                    //message = "Contraseña incorrecta";
                    usr = null;
                    return usr;
                }
            } else {
                //message = "Usuario incorrecto";
                usr = null;
            }
        }
        return usr;
    }

    public List<User> loadUsers() {
        return persControl.loadUsers();
    }

    public List<Role> loadRoles() {
        return persControl.loadRoles();
    }

    public void registerUser(String user, String pass, String roleReceived) {
        User us = new User();
        us.setUserName(user);
        us.setPassword(pass);

        Role roleFound = new Role();
        roleFound = this.loadRole(roleReceived);
        
        if(roleFound != null){
            us.setRole(roleFound);
        }
        
        int id = this.findLastIdUsers();
        us.setId(id+1);
        
        persControl.registerUser(us);
    }

    private Role loadRole(String roleReceived) {
        List<Role> rolesList = persControl.loadRoles();
        
        for (Role role: rolesList){
            if(role.getRoleName().equals(roleReceived)){
                return role;
            }
        }
        return null;
    }

    private int findLastIdUsers() {
        List<User> userList = this.loadUsers();
        
        User us = userList.get(userList.size()-1);
        return us.getId();
        
    }

    public void userDelete(int idUser) {
        persControl.userDelete(idUser);
    }

    public User loadUser(int idUser) {
        return persControl.loadUser(idUser);
    }

    public void editUser(User us, String user, String pass, String roleReceived) {
        us.setUserName(user);
        us.setPassword(pass);
        
        Role roleFound = new Role();
        roleFound = this.loadRole(roleReceived);
        
        if(roleFound != null){
            us.setRole(roleFound);
        }
        
        persControl.editUser(us);
    }


}
