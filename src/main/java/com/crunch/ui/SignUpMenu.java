package com.crunch.ui;

import com.crunch.services.UserService;

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

        UserService us = new UserService();
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
        try {
            us.makeUser(username, password, phoneNumber, email);
        } catch (Exception e) {
            System.out.println("User Already Exists, cancelling");
        }
        System.out.println("Successfully registered " + username);
    }
}
