package com.example.interceptot;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 16:58
 */
public class TestInterceptor implements HandlerInterceptor {

        public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            Map<String, String[]> map =  request.getParameterMap();
            System.out.println(map);
            return true;
    }
}
