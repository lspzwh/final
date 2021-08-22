package com.example.demo1.Dao;

import com.example.demo1.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao2 {
    @Select("select * from user where id=#{id}")
    public Users getUserById(int id);
}
