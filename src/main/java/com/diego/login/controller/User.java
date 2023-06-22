package com.diego.login.controller;

import java.io.Serializable;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //comento lo anterior porque cuando tengo ingresos a BD manuales el GenerationType no sirve para encontrar el id
    private int id;
    private String userName;
    private String password;
    //mapeo indicando foreing key el fk_role utilizando el objeto role (relacion bidireccional)
    @ManyToOne
    @JoinColumn(name="fk_role")
    private Role role;

    public User() {
    }

    public User(int id, String userName, String password, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    
    
}
