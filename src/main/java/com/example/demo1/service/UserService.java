package com.example.demo1.service;

import com.example.demo1.Dao.UserDao;
import com.example.demo1.entity.Users;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
    @Autowired
    private UserDao userDao;
    public Users selectService(int id){
        return userDao.getUserById(id);
    }
    public int add(String name,String password){
        return userDao.add(name,password);
    }
    public Users verifyUser(String username){
        return userDao.verifyUser(username);
    }
    public int updateByName(String username,String password){
        return userDao.updateByName(username,password);
    }

    public int updateById(int id,String password){
        return userDao.updateById(id,password);
    }
    public int delete(int id){
        return userDao.delete(id);
    }

}
