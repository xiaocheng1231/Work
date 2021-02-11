package com.atxiaocheng.demo.user.controller;

import com.atxiaocheng.demo.user.entity.UserEntity;
import com.atxiaocheng.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author cheng
 * @create 2021-02-10-18:22
 */

@Controller //重定向
@RequestMapping("user")
/**
 * @RestController = @ResponseBody + @Controller
 */
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delect")
    public String delById(Integer id){


        userService.deleById(id);

        return "redirect:/index.html";
    }


    //保存用户的接口
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){//转换实体类

        System.out.println("用户注册："+userEntity.toString());
        userService.save(userEntity);
        return "succes";
    }

}
