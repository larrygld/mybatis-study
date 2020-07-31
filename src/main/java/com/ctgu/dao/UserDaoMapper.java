package com.ctgu.dao;

import com.ctgu.pojo.User;

import java.util.List;

/**
 * @author larry
 * @date 2020/7/31 11:18
 * @creed: Talk is cheap, show me the code!
 */
public interface UserDaoMapper {

    List<User> getUserList();
}
