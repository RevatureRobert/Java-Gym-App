package com.crunch.service;

import com.crunch.model.User;

public class UserServiceTest {

    UserService us = new UserService();

    // TODO: replace with custom data structure
    //      to eliminate dependency on other methods from the same class
    public void setup() {
        us.makeUser("bob", "bob", "ksgh", "osiug");
        us.makeUser("william", "william", "kslauhg", "ksajdh");
        us.makeUser("billy", "billy", "uigh", "uihg");
    }

    public boolean findUserByUsernameValidUserTest1() {
        User bob = new User("bob", "bob", "ksgh", "osiug");
        User checkBob = us.findUserByUsername(bob.getUsername());
        if (!bob.getUsername().equals(checkBob.getUsername())) {
            return false;
        }
        if (!bob.getPassword().equals(checkBob.getPassword())) {
            return false;
        }
        if (!bob.getEmail().equals(checkBob.getEmail())) {
            return false;
        }
        if (!bob.getPhoneNumber().equals(checkBob.getPhoneNumber())) {
            return false;
        }
        return true;
    }

    public boolean findUserByUsernameValidUserTest2() {
        User will = new User("william", "william", "kslauhg", "ksajdh");
        User checkWill = us.findUserByUsername(will.getUsername());
        if (!will.getUsername().equals(checkWill.getUsername())) {
            return false;
        }
        if (!will.getPassword().equals(checkWill.getPassword())) {
            return false;
        }
        if (!will.getEmail().equals(checkWill.getEmail())) {
            return false;
        }
        if (!will.getPhoneNumber().equals(checkWill.getPhoneNumber())) {
            return false;
        }
        return true;
    }

    public boolean findUserByUsernameValidUserTest3() {
        User billy = new User("billy", "billy", "uigh", "uihg");
        User checkBilly = us.findUserByUsername(billy.getUsername());
        if (!billy.getUsername().equals(checkBilly.getUsername())) {
            return false;
        }
        if (!billy.getPassword().equals(checkBilly.getPassword())) {
            return false;
        }
        if (!billy.getEmail().equals(checkBilly.getEmail())) {
            return false;
        }
        if (!billy.getPhoneNumber().equals(checkBilly.getPhoneNumber())) {
            return false;
        }
        return true;
    }


    public boolean findUserByUsernameNonValidUserTest1() {
        String badUsername = "jkfh";
        User firstCheck = us.findUserByUsername(badUsername);
        return firstCheck == null;
    }

    public boolean findUserByUsernameNonValidUserTest2() {
        String badUsername = "vorhees";
        User firstCheck = us.findUserByUsername(badUsername);
        return firstCheck == null;
    }

    // TODO: Left unimplemented, need constraints on the username
    public boolean findUserByUsernameConstraintTest() {

        return false;
    }

}