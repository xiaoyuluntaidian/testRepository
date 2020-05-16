package cn.xiaoyuluntaidian.controller;

import cn.xiaoyuluntaidian.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/test111")
    public String test() throws MyException {
           throw new MyException("出现错误");
    }
}
