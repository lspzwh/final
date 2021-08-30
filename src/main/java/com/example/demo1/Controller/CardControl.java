package com.example.demo1.Controller;

import com.example.demo1.entity.Card;
import com.example.demo1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/card")
public class CardControl {
    @Autowired
    private CardService cardService;
    @RequestMapping("/selectbyid/{id}")
    public Card selectById(@PathVariable(name = "id") int id){
        return cardService.selectById(id);
    }
    @RequestMapping("/add")
    public int add(
            @RequestParam(name="title")String title,
            @RequestParam(name="username") String username,
            @RequestParam(name="time")Timestamp time,
            @RequestParam(name="content")String content){
        return cardService.add(new Card(content, username, time, title));
    }
    @RequestMapping("/selectbyusername/{username}")
    public List<Card> selectByUsername(@PathVariable(name = "username")String username){
        return cardService.selectByUsername(username);
    }
    @RequestMapping("/selectbytitle/{title}")
    public List<Card> selectByTitle(@PathVariable(name = "title")String title){
        return cardService.selectByTitle(title);
    }
    @RequestMapping("delete/{id}")
    public int delete(@PathVariable(name="id") int id){
        return cardService.delete(id);
    }
    @RequestMapping("/updatecontent")
    public int updateContent(@RequestParam(name="id")int id,@RequestParam(name="content")String content){
        return cardService.updateContent(id,content);
    }
}
