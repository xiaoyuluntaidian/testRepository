package cn.xiaoyuluntaidian.configer;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorControllerAttribute extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String,Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        Map<String,Object> myMap= (Map<String,Object>)webRequest.getAttribute("myMap",0);
        System.out.println(myMap);
        map.put("mes",myMap);
        return map ;
    }
}
