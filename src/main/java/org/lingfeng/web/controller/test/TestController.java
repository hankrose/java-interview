package org.lingfeng.web.controller.test;

import java.util.List;
import org.lingfeng.web.pojo.User;
import org.lingfeng.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lingfeng on 2020/5/2.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

  @Autowired
  UserService service;

  @GetMapping(value = "/test")
  @ResponseBody
  public List<User> test(){
    return  service.queryAll();
  }

}
