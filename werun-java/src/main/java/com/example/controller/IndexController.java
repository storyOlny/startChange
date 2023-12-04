package com.example.controller;

import com.example.entity.LifeResult;
import com.example.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @program: project index
 * @author: jyz
 * @create: 2023-11-29 12:43
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String hello() {
        return "index";
    }



}
