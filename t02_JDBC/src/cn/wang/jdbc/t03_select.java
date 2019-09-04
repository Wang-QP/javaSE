package cn.wang.jdbc;

import java.sql.*;

public class t03_select {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            conn = DriverManager.getConnection("jdbc:mysql:///java", "root", "root");
            //3.定义SQL语句
            String sql = "select * from person";
            //4.获得执行sql的对象
            statement = conn.createStatement();
            //5.执行SQL
            rs = statement.executeQuery(sql);
            //6.处理结果
            System.out.println(rs);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int qian = rs.getInt("qian");
                System.out.println(id+"-"+name+"-"+qian);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
