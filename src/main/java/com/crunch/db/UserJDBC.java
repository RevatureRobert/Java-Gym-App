package com.crunch.db;

import java.sql.*;

import com.crunch.config.ConnectionUtil;
import com.crunch.model.User;
import com.crunch.util.GymCollection;

/**
 * jdbc
 * Java Database Connectivity
 * <p>
 * DAO
 * Data Access Object
 */
public class UserJDBC implements GenericDao<User, String> {

    private static UserJDBC instance;

    private UserJDBC(){}

    static UserJDBC getInstance(){
        if(instance == null){
            instance = new UserJDBC();
        }
        return instance;
    }

    @Override
    public int save(User u) {
        try {
            String sql = "insert into app_user values ('" +
                    u.getUsername() + "', '" + u.getPassword() + "', '" +
                    u.getPhoneNumber() + "', '" + u.getEmail() + "', '" +
                    u.getMembership().ordinal() + "')";

            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            int i = st.executeUpdate(sql);
            System.out.println("The number of updated rows were " + i);

            return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public GymCollection getAll() {
        return null;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public int updateAll(GymCollection collection) {
        return 0;
    }
}
