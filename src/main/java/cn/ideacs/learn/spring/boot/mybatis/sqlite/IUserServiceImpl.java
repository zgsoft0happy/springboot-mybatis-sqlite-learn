package cn.ideacs.learn.spring.boot.mybatis.sqlite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * name:
 * date: 2021/6/13            time:  10:54 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
@Service
public class IUserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<UserEntity> findUserAll() {
        return userMapper.findUserAll();
    }
}
