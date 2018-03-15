package com.game.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.game.dao.ALLUserMapper;
import com.game.entity.ALLUser;
import com.game.service.GameService;


@Service
public class GameServiceImpl implements GameService {
    
    
    @Autowired
    private ALLUserMapper aLLUserMapper;
     
    @Override
    public ALLUser getAllUserInfo(Integer id) {
        return aLLUserMapper.selectByPrimaryKey(id);
    }

}
