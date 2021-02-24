package com.crunch.services;

import com.crunch.model.User;
import com.crunch.util.GymLinkedList;


/**
 * for the user array, we should not care about the order they are added in,
 *      There should not be duplicates, if we reach the max size then it should
 *      be expandable, index should always point to the last valid object, and
 *      should never have gaps.
 *
 *
 // TODO: change password
 // TODO: delete users
 // TODO: update to members
 // TODO: update information
 // TODO: schedule workout times/sessions


 */
public class UserService {

    GymLinkedList userList = new GymLinkedList();


    public boolean doesUsernameExist(String username){
        return userList.get(username)!=null;
    }

    public User findUserByUsername(String username){
        return userList.get(username);
    }


    // TODO: Ensure duplicates do not exist, while minimizing calls to doesUsernameExist method.
    public boolean makeUser(String username, String password, String phoneNumber, String email) throws Exception {
        userList.add(new User(username,password,phoneNumber,email));
        return true;
    }
}
