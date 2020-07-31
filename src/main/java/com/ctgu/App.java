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
            System.out.println(user.getUserName());
        }
        //关闭资源
        sqlSession.close();
    }
}
