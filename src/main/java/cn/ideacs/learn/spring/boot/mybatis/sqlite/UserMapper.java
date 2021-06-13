package cn.ideacs.learn.spring.boot.mybatis.sqlite;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * name:
 * date: 2021/6/13            time:  10:44 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
@Mapper
public interface UserMapper {

    UserEntity findUserById(int id);
    List<UserEntity> findUserAll();

}
