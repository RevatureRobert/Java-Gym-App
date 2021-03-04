package com.crunch.service;

import com.crunch.db.GenericDao;
import com.crunch.db.UserJDBC;
import com.crunch.model.MembershipType;
import com.crunch.model.User;


/**
 * for the user array, we should not care about the order they are added in,
 * There should not be duplicates, if we reach the max size then it should
 * be expandable, index should always point to the last valid object, and
 * should never have gaps.
 * <p>
 * <p>
 * // TODO: change password
 * // TODO: delete users
 * // TODO: update to members
 * // TODO: update information
 * // TODO: schedule workout times/sessions
 */
public class UserService {

    GenericDao<User, String> uj;

    public UserService(GenericDao<User, String> uj) {
        this.uj = uj;
    }

    private static User[] users = new User[5];
    // TODO: potential risk of overriting users if index is not incremented and decremented carefully
    private static int currentIndex = -1;


    public boolean doesUsernameExist(String username) {
        // O(n) time complexity O(1) space complexity
        return findUserByUsername(username) != null;
    }

    /*
            If given a valid user (one in the array)
                It will find the correct User
            If given a non valid user (one not in the array)
                it will return null
            If there are constraints (below the min char count,
                over the max char count, null, etc.) on the username,
                this method should reflect that and
                throw a Runtime exception if the constraints are
                violated.


     */
    public User findUserByUsername(String username) {
        // O(n) time complexity O(1) space complexity
        if (currentIndex > -1) {
            for (int i = 0; i <= currentIndex; i++) {
                if (users[i].getUsername().equals(username)) {
                    return users[i];
                }
            }
        }
        return null;
    }


    // TODO: Ensure duplicates do not exist, while minimizing calls to doesUsernameExist method.
    public boolean makeUser(String username, String password, String phoneNumber, String email) {


        if (!doesUsernameExist(username)) {
            if ((currentIndex + 1) < users.length) {
                if (users[currentIndex + 1] == null) {
                    users[++currentIndex] = new User(MembershipType.NEVER_MEMBER, username, password, null, phoneNumber, email );
                    uj.save(new User(MembershipType.NEVER_MEMBER, username, password, null, phoneNumber, email));
                    return true;
                }
            }
        } else {
            System.out.println("user already exists");
        }
        return false;
    }

}