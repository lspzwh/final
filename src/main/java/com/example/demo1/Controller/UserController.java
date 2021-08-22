package com.example.demo1.Controller;

import com.example.demo1.entity.Users;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/search/{id}")
    public Users search(@PathVariable(name = "id") int id){
        return userService.selectService(id);
    }
//    @RequestMapping("/search/{id}")
//    public String search(@PathVariable(name = "id") int id){
//        Users users =userService.selectService(id);
//        return users.getUsername();
//}
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
