package com.crunch.ui;

import com.crunch.db.JDBCFactory;
import com.crunch.db.UserJDBC;
import com.crunch.model.User;
import com.crunch.service.UserService;

import java.util.Scanner;

/**
 * Scopes
 *  static (class)
 *  instance (object)
 *  method
 *  local (block)
 *
 *
 *
 */

public class SignUpMenu extends AbstractMenu{

    public void showMenu(Scanner scan){

        UserService us = new UserService(JDBCFactory.daoFactory(User.class));
        System.out.println("====Welcome to Crunch====");
        String username = "";
        // hey something is wrong
        do{
            System.out.println("provide username");
            username = scan.nextLine();
        } while(us.doesUsernameExist(username));
        System.out.println("provide password");
        // TODO: check phone number
        String password = scan.nextLine();
        System.out.println("provide phone number");
        // TODO: check email
        String phoneNumber = scan.nextLine();
        System.out.println("provide email");
        String email = scan.nextLine();
        System.out.println(us.makeUser(username, password, phoneNumber, email) ?
                        "successfully made "+username :
                        "cancelled registration");
    }
}
