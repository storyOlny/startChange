package com.example.controller;

import com.example.entity.LifeResult;
import com.example.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 15:02
 */
@RestController
public class InsertController {
    @Autowired
    private LifeService lifeService;

    @RequestMapping("/insert")
    public String welcome(String description) {
        Integer result = lifeService.insertLife(description);

        return result == 1 ? "插入成功！" : "插入失败！";
    }
}
