package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("/demo")
    public String demo(Model model){
        System.out.println("ok...");
        model.addAttribute("hello","SpringBoot...");

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"123","北京"));
        users.add(new User(1,"123","上海"));
        users.add(new User(1,"123","深圳"));
        users.add(new User(1,"123","张三"));
        model.addAttribute("users",users);

        model.addAttribute("now",new Date());
        return "demo1";//视图解析


    }
}
