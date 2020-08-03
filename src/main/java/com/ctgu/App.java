package com.ctgu;

import com.ctgu.dao.BusinessDaoMapper;
import com.ctgu.dao.UserDaoMapper;
import com.ctgu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {
        // System.out.println( "Hello World!" );

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取dao对象
        UserDaoMapper userDao = sqlSession.getMapper(UserDaoMapper.class);
        List<User> userList = userDao.getUserList();
        for(User user :userList){
            System.out.println(user.getId() + user.getUserName());
        }

//        User user = userDao.getUserById("11111111111");
//        System.out.println(user);
//
//        User user01 = userDao.getUserByIdAndPassword("11111111111", "123");
//        System.out.println(user01);

//        User user02 = new User("12121", "1231", "232", 1, 1);
//        userDao.addUser(user02);
//        sqlSession.commit();
//        user01.setPassword("11111");
//        userDao.updateUser(user01);

//        userDao.delUserById("12121");
//        User user03 = userDao.searchUser("11111111111", "");
//        List<User> users = userDao.searchUser("", "");
//        System.out.println(users);
//        userDao.updateUser01("11111111111", "12121", "");
//        User user01 = new User("2121", "12121", "批量01", 1,1);
//        User user02 = new User("2122", "12121", "批量02", 1,1);
//        User user03 = new User("2123", "12121", "批量03", 1,1);
//        User user04 = new User("2124", "12121", "批量04", 1,1);
//        List<User> users = new ArrayList<>();
//        users.add(user01);
//        users.add(user02);
//        users.add(user03);
//        users.add(user04);
//        userDao.insertUsers(users);

//        List<User> users = userDao.findUserBylike("批量");
//        List<String> idList = new ArrayList<>();
//        idList.add("2121");
//        idList.add("2122");
//        idList.add("2127");
//        idList.add("2123");
//        System.out.println(userDao.selectByIdSet(idList));
//        sqlSession.commit();

//        User user = userDao.getUserAndAddressByUid("12345671111");
//        System.out.println(user);

        BusinessDaoMapper businessDao = sqlSession.getMapper(BusinessDaoMapper.class);
        System.out.println(businessDao.getBusinessAndFoodsById(10001));


        //关闭资源
        sqlSession.close();
    }
}
