/**
 * Project Name:hotel
 * File Name:UserServiceImpl.java
 * Package Name:com.java.dao.impl
 * Date:下午12:55:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package com.java.dao.impl;

import com.java.dao.UserDao;

/**
 * Description: <br/>
 * Date: 下午12:55:26 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class UserDaoImpl implements UserDao {

    // 查询所有用户信息
    @Override
    public void getAllUsers() {
        System.out.println("UserDaoImpl.........getAllUsers()");
    }

    // 添加数据
    @Override
    public void insertUser() {
        System.out.println("UserDaoImpl.........insertUser");
    }
}
