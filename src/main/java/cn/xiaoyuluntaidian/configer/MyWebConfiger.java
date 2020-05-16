package cn.xiaoyuluntaidian.configer;

import cn.xiaoyuluntaidian.controller.HandlerInterceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration
public class MyWebConfiger implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return  new LocaleResolver() {
            @Override
            public Locale resolveLocale(HttpServletRequest httpServletRequest) {
                String language = httpServletRequest.getParameter("language");
                Locale locale = null;
                if(!StringUtils.isEmpty(language)){
                    String[] strs = language.split("_");
                    locale = new Locale(strs[0],strs[1]);
                }else {
                    locale = Locale.getDefault();

                }

                return locale;
            }
            @Override
            public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

            }
        };
    }


    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).
                addPathPatterns("/**").excludePathPatterns("/","/index","/login");
    }*/
}
