package cn.wang.jdbc;

import cn.wang.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class t05_Login_test {
    public static boolean login(String name,String password){
        if (name != null && password != null){
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            PreparedStatement pstmt = null;
            try {
                conn = JDBCUtils.getConnection();
                String sql = "select * from user where username = ? and password = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,name);
                pstmt.setString(2,password);
                System.out.println(sql);
//                rs = stmt.executeQuery(sql);
                rs = pstmt.executeQuery();
                if(rs.next()){
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(rs,pstmt,conn);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("username:");
        String name = input.nextLine();
        System.out.print("password:");
        String password = input.nextLine();
        if (login(name,password)){
            System.out.println("login...");
        } else {
            System.out.println("fail...");
        }
    }
}
