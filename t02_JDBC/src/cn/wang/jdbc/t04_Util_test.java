package cn.wang.jdbc;

import cn.wang.utils.JDBCUtils;

import java.sql.*;

public class t04_Util_test {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            //3.定义SQL语句
            String sql = "select * from person";
            //4.获得执行sql的对象
            statement = conn.createStatement();
            //5.执行SQL
            rs = statement.executeQuery(sql);
            //6.处理结果
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int qian = rs.getInt("qian");
                System.out.println(id+"-"+name+"-"+qian);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            JDBCUtils.close(rs,statement,conn);
        }
    }
}
