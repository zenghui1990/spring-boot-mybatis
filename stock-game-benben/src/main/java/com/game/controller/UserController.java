package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.game.base.exception.MyException;
import com.game.entity.ALLUser;
import com.game.service.GameService;

@RestController
public class UserController {
    
    @Autowired
    private GameService gameService;
    
    @RequestMapping("/test/{id}")
    public Object getInfo(@PathVariable("id") Integer id) throws MyException{
       ALLUser  info=gameService.getAllUserInfo(id);
        if(info==null){
            throw new MyException("没有找到相应的信息!");
        }
        return info;
    }
}
