package cn.wang.test;

import cn.wang.dao.UserDao;
import cn.wang.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testlogin(){
        UserDao dao = new UserDao();
        User user = new User(1,"xm","1213");
        User login = dao.login(user);
        System.out.println(login);
    }
}
