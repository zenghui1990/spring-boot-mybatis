package com.game.dao;


import org.springframework.stereotype.Repository;

import com.game.entity.ALLUser;

@Repository
public interface ALLUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ALLUser record);

    int insertSelective(ALLUser record);

    ALLUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ALLUser record);

    int updateByPrimaryKey(ALLUser record);
}