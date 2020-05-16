package cn.xiaoyuluntaidian.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/test")
    public String test(){

        return "jquery-3.4.1.min";
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("hello","hello 你好");
        map.put("User", Arrays.asList("test1","test2","test3"));
        return "hello";
    }
}
