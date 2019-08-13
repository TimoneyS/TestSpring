package com.rays.dao.springdao;

import org.springframework.stereotype.Component;

import com.rays.dao.UserDao;
import com.rays.entity.User;

@Component
public class UserDaoImpl implements UserDao {

    @Override
    public User selectUser(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User selectUser(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteUser(User user) {
        // TODO Auto-generated method stub

    }

}
