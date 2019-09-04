package cn.wang.jdbc;

import cn.wang.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 事务管理
 */
public class t06_jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //3.定义SQL语句
            String sql = "update person set qian = qian + ? where id = ?";
            //4.获得执行sql的对象
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,-500);
            pstmt.setInt(2,1);
            int count = pstmt.executeUpdate();
            pstmt.setInt(1,500);
            pstmt.setInt(2,2);
            //5.执行SQL
            count = pstmt.executeUpdate();
            //6.处理结果
            System.out.println(count);
//            int a = 1/0;
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            //7.释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }
}
