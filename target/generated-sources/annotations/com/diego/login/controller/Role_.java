package com.diego.login.controller;

import com.diego.login.controller.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-22T10:53:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile ListAttribute<Role, User> userList;
    public static volatile SingularAttribute<Role, String> roleName;
    public static volatile SingularAttribute<Role, String> description;
    public static volatile SingularAttribute<Role, Integer> id;

}