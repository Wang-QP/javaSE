package cn.wang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class t01_jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
        //4.定义SQL语句
        String sql = "UPDATE person SET qian = qian - 500 WHERE id = 1";
        //5.获得可以执行SQL的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行SQL
        int conut = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(conut);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
