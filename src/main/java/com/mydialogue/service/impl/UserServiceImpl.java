package com.mydialogue.service.impl;

import com.mydialogue.dao.UserDao;
import com.mydialogue.model.User;
import com.mydialogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User save(User user) {
        return userDao.save(user);
    }

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
