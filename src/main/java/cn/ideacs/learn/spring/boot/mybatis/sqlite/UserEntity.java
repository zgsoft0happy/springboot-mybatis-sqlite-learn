package cn.ideacs.learn.spring.boot.mybatis.sqlite;

import lombok.Data;

/**
 * name:
 * date: 2021/6/13            time:  10:37 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
@Data
public class UserEntity {

    private int id;
    private String userName;
    private String password;
    private int start;
    private String foundTime;

}
