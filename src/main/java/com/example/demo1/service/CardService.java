package com.example.demo1.service;

import com.example.demo1.Dao.CardDao;
import com.example.demo1.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CardService")
public class CardService {
    @Autowired
    private CardDao cardDao;
    public Card selectById(int id){
        return cardDao.selectById(id);
    }
    public int add(Card card){
        return cardDao.add(card);
    }
    public List<Card> selectByUsername(String username){
        return cardDao.selectByUsername(username);
    }
    public List<Card> selectByTitle(String title){
        return cardDao.selectByTitle(title);
    }
    public int delete(int id){
        return cardDao.delete(id);
    }
    public int updateContent(int id,String content){
        return cardDao.updateContent(id,content);
    }
}
