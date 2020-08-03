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
    //传入不定的id和用户名查询用户
    List<User> searchUser(@Param("id")String id, @Param("name")String name);
    //动态sql
    //传入id,不定的用户名和密码更改用户信息
    int updateUser01(@Param("id")String id, @Param("name")String name, @Param("password")String password);
    //批量插入用户
    int insertUsers(@Param("users")List<User> users);
    //用户名模糊查询
    List<User> findUserBylike(@Param("name")String name);
    //通过id集合批量查询用户
    List<User> selectByIdSet(@Param("idList")List<String> idList);

    //多表联合查询
    User getUserAndAddressByUid(@Param("id")String id);
}
