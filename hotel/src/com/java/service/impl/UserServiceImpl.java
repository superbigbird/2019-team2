/**
 * Project Name:hotel
 * File Name:UserServiceImpl.java
 * Package Name:com.java.service.impl
 * Date:下午12:59:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package com.java.service.impl;

import com.java.dao.UserDao;
import com.java.dao.impl.UserDaoImpl;
import com.java.service.UserService;

/**
 * Description: <br/>
 * Date: 下午12:59:02 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void findAllUsers() {
        userDao.getAllUsers();
    }

    @Override
    public void saveUser() {
        userDao.insertUser();
    }

}
