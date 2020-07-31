package com.ctgu;

import com.ctgu.dao.UserDaoMapper;
import com.ctgu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
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

        User user = userDao.getUserById("11111111111");
        System.out.println(user);

        User user01 = userDao.getUserByIdAndPassword("11111111111", "123");
        System.out.println(user01);

//        User user02 = new User("12121", "1231", "232", 1, 1);
//        userDao.addUser(user02);
//        sqlSession.commit();
//        user01.setPassword("11111");
//        userDao.updateUser(user01);

        userDao.delUserById("12121");

        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
