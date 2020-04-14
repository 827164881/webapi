package com.poli.webapi.common.controller;

import com.poli.webapi.common.service.ImUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户管理
 * @author: monkey.G
 * @create: 2020-04-09 18:51
 **/
@RestController
@RequestMapping("/user")
public class ImUserController {

  @Autowired
  private ImUserService userService;

  @RequestMapping("/userList")
  public Object UserList(){
    return userService.getUserList();
  }

  @RequestMapping("/insertUser")
  public Object insertUser(){
    return userService.insertUser();
  }

  @RequestMapping("/updateUser")
  public Object updateUser(){
    return userService.updateUser();
  }

  @RequestMapping("/deleteUser")
  public Object deleteUser(){
    return userService.deleteUser();
  }
}
