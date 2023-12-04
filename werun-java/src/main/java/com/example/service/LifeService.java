package com.example.service;

import com.example.entity.LifeResult;
import org.springframework.stereotype.Service;

/**
 * 选择人生
 */

public interface LifeService {

    LifeResult chooseLife(int number);

}
