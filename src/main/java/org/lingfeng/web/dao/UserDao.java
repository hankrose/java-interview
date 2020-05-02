package org.lingfeng.web.dao;

import org.lingfeng.web.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lingfeng on 2020/5/2.
 */
public interface UserDao extends JpaRepository<User,Integer> {

}
