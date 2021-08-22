package com.example.demo1.Dao;

import com.example.demo1.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public Users getUserById(@Param("id") int id);
    public void insert(@Param("user") Users user);
}
