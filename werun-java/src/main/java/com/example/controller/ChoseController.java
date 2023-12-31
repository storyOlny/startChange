package com.example.controller;

import com.example.entity.LifeResult;
import com.example.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 13:24
 */
@RestController()

public class ChoseController {

    @Autowired
    private LifeService lifeService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String welcome(@RequestParam(name="number") Integer number) {
        LifeResult lifeResult = lifeService.chooseLife(number);

        return null == lifeResult ? "你选择的是无效的" : lifeResult.getDescription();
    }

}
