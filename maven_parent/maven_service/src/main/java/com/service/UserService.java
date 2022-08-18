package com.service;

import com.dao.UserDao;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2022/1/16 - 01 - 16 - 15:27
 * @Description:
 * @version:1.0
 */
public class UserService {
    public static void testService() {
        System.out.println("UserService test...........");

        //调用maven_dao模块的方法
        UserDao.testDao();
    }
}
