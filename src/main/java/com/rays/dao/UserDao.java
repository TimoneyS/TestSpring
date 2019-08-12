package com.rays.dao;

import com.rays.entity.User;

public interface UserDao {

    public User selectUser(Integer id);
    public User selectUser(String username);
    public User insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    
}
