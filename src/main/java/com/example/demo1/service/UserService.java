package com.example.demo1.service;

import com.example.demo1.Dao.UserDao;
import com.example.demo1.Dao.UserDao2;
import com.example.demo1.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
    @Autowired
    private UserDao2 userDao2;
    private UserDao userDao;
    public Users selectService(int id){
        return userDao2.getUserById(id);
    }
//    public void save(Users user){
//        userDao.insert(user);
//    }
}
