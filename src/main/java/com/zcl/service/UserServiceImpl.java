package com.zcl.service;

import com.zcl.bean.User;
import com.zcl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 11:30 上午
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        return userMapper.selectById(id);
    }
}
