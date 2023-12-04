package com.example.service;

import com.example.dao.LifeDao;
import com.example.entity.LifeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:
 * @author: jyz
 * @create: 2023-12-04 12:05
 */
@Service
public class SuperiorImpl implements LifeService {

    @Autowired
    private LifeDao lifeDao;

    @Override
    public LifeResult chooseLife(int number) {
        return lifeDao.getLife(number);
    }

    @Override
    public Integer insertLife(String description) {
        return lifeDao.insertLife(description);
    }
}
