package cn.xiaoyuluntaidian.controller.exceptionController;

import cn.xiaoyuluntaidian.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class exceptionController {

    /*@ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String,Object> catchMyException(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","400");
        map.put("mes","自定义错误");
        return map;
    }*/

    @ExceptionHandler(MyException.class)
    public String catchMyException(Exception e, HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();

        //Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        /*map.put("javax.servlet.error.status_code",400);*/
        request.setAttribute("javax.servlet.error.status_code",400);
        map.put("code","400");
        map.put("mes","自定义错误");
        request.setAttribute("myMap",map);

        return "forward:/error";
    }
}
