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
@RequestMapping("/userList")
public class ImUserController {

  @Autowired
  private ImUserService userService;

  @RequestMapping("/userList")
  public Object UserList(){
    return userService.getUserList();
  }
}
