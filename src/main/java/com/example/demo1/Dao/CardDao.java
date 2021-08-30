package com.example.demo1.Dao;
import com.example.demo1.entity.Card;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CardDao {
    @Select("select * from card where id=#{id}")
    Card selectById(int id);
    @Select("select * from card where username=#{username}")
    List<Card> selectByUsername(String username);
    @Select("select * from card where title=#{title}")
    List<Card> selectByTitle(String title);
    @Update("insert into card(username,time,content,title) values(#{username},#{time},#{content},#{title})")
    int add(Card card);
    @Delete("delete from card where id=#{id}")
    int delete(int id);
    @Update("update card set content=#{content} where id=#{id}")
    int updateContent(int id,String content);
}
