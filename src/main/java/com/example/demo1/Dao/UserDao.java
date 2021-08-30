package com.example.demo1.Dao;

import com.example.demo1.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    Users getUserById(int id);
    @Update("insert into user(username,password) values(#{username},#{password})")
    int add(String username,String password);
    @Select("select * from user where username=#{username}")
    Users verifyUser(String username);
    @Update("update user set password=#{password} where username=#{username}")
    int updateByName(String username,String password);
    @Update("update user set password=#{password} where id=#{id}")
    int updateById(int id,String password);
    @Delete("delete from user where id=#{id}")
    int delete(int id);
}
