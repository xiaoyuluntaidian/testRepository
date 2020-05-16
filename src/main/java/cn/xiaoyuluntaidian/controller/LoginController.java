package cn.xiaoyuluntaidian.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password, Map<String,Object> map){
        if(StringUtils.isEmpty(username)&&StringUtils.isEmpty(password)){
            map.put("meg","用户名或者密码不能为空");
            return "index";
        }
        if("admin".equals(username)&&"123".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/dashboard";
        }else{
            map.put("meg","用户名或者密码错误");
            return "index";
        }
    }

    @RequestMapping("/dashboard")
    public String list(){
        return "dashboard";
    }


}
