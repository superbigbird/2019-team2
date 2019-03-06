/**
 * Project Name:hotel
 * File Name:UserServlet.java
 * Package Name:com.java.servlet
 * Date:下午1:01:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package com.java.servlet;

import com.java.service.UserService;

/**
 * Description: <br/>
 * Date: 下午1:01:09 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class UserServlet {
    private static UserService userService;

    public static void main(String[] args) {
        userService.findAllUsers();
    }
}
