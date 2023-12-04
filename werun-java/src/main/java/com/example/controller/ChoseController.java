package com.example.controller;

import com.example.entity.LifeResult;
import com.example.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 13:24
 */
@RestController
public class ChoseController {

    @Autowired
    private LifeService lifeService;

    @RequestMapping("/test")
    public String welcome(int number) {
        LifeResult lifeResult = lifeService.chooseLife(number);

        return null == lifeResult?"你选择的是无效的":lifeResult.getDescription();
    }

}
