package com.example.demo1.Controller;
import com.example.demo1.entity.Users;
import com.example.demo1.service.UserService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //根据id查询用户
    @RequestMapping("/search/{id}")
    public Users search(@PathVariable(name = "id") int id){
        return userService.selectService(id);
    }
//    //根据用户名查询用户
//    @RequestMapping("/search/{name}")
//    public Users searchByName(@PathVariable(name = "name") String name){
//        return userService.verifyUser(name);
//    }
    //添加用户
    @RequestMapping("/add")
    public int add(@RequestParam(name = "username") String name ,@RequestParam(name = "password") String password){
        //用户名重复返回-1
        if(userService.verifyUser(name)!=null){
            return -1;
        }

        return userService.add(name, password);
    }
    //根据用户名修改密码
    @RequestMapping("/updateByName")
    public int updateByName(@RequestParam(name = "username")String username,@RequestParam(name = "password")String password){
        return userService.updateByName(username,password);
    }
    //根据id改密码
    @RequestMapping("/updateById")
    public int updateById(@RequestParam(name = "id")int id,@RequestParam(name = "password")String password){
        return userService.updateById(id,password);
    }
    //根据id删除
    @RequestMapping("/delete/{id}")
    public int delete(@PathVariable(name = "id") int id){
        return userService.delete(id);
    }
    //登录
    @RequestMapping("/login")
    public int login(@RequestParam(name = "username") String name ,@RequestParam(name = "password") String password){
        Users user= userService.verifyUser(name);
        if(user==null){
            return -1;
        }
        if(!Objects.equals(user.getPassword(), password)){
            return 0;
        }
        return 1;
    }

}
