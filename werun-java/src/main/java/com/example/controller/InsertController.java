package com.example.controller;

import com.example.entity.LifeResult;
import com.example.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 15:02
 */
@RestController
public class InsertController {
    @Autowired
    private LifeService lifeService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public String welcome(@RequestBody LifeResult LifeRequest) {
        Integer result = lifeService.insertLife(LifeRequest.getDescription());
        return result == 1 ? "插入成功！" : "插入失败！";
    }
}
