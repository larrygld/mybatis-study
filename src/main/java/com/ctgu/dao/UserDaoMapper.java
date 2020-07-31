package com.ctgu.dao;

import com.ctgu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author larry
 * @date 2020/7/31 11:18
 * @creed: Talk is cheap, show me the code!
 */
public interface UserDaoMapper {

    List<User> getUserList();

    User getUserById(@Param("id")String id);

    User getUserByIdAndPassword(@Param("id")String id, @Param("password")String password);

    int addUser(@Param("user")User user);

    int updateUser(@Param("user")User user);

    int delUserById(@Param("id")String id);

    User searchUser(@Param("user")User user);

    List<User> searchUser(@Param("id")String id, @Param("name")String name);
    //动态sql
    int updateUser01(@Param("id")String id, @Param("name")String name, @Param("password")String password);
}
