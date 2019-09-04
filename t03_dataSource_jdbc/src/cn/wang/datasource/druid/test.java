package cn.wang.datasource.druid;

import cn.wang.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "insert into person value(null,'xg',2000)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
