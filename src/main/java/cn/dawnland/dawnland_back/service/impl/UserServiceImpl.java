package cn.dawnland.dawnland_back.service.impl;

import cn.dawnland.dawnland_back.mapper.UserMapper;
import cn.dawnland.dawnland_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long fingScore(String name) {
        return userMapper.fingScore(name);
    }

    @Override
    public Integer updateScore(String name, String symal, Long amount) {
        return userMapper.updateScore(name, symal, amount);
    }
}
