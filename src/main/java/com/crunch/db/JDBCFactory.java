package com.crunch.db;

import com.crunch.model.User;

/**
 * Factory design pattern.
 *      If you have common data types (similar inheritance trees),
 *          You can designate the parent as the return type and
 *          take parameters to determine which object should be
 *          returned to the caller.
 */
public class JDBCFactory {

    public static GenericDao daoFactory(Class c){
        switch (c.getName()){
            case "com.crunch.model.User":
                return UserJDBC.getInstance();
            default:
                throw new IllegalArgumentException("The class provided does not have a corresponding dao object");
        }
    }
}
