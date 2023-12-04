package com.example.dao;


import com.example.entity.LifeResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LifeDao {

    LifeResult getLife(@Param("id") int id);

    Integer insertLife(@Param("description") String description);
}
