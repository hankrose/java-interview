package org.lingfeng.web.service.impl;

import java.util.List;
import org.lingfeng.web.dao.UserDao;
import org.lingfeng.web.pojo.User;
import org.lingfeng.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lingfeng on 2020/5/2.
 */
@Service
public class UserServiceImpl implements UserService{

  @Autowired
  UserDao userDao;

  @Override
  public List<User> queryAll() {
    return userDao.findAll();
  }
}
