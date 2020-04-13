package com.poli.webapi.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: dengl
 * @author: monkey.G
 * @create: 2020-04-09 22:31
 **/

@RequestMapping("/")
@RestController
public class LoginController {

  @RequestMapping("/")
  public String hello(){
    return "hello world";
  }
}
