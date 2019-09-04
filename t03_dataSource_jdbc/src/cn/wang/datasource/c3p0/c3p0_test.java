package cn.wang.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0_test {
    public static void main(String[] args) throws SQLException {
        //获取DataSource 默认配置
        DataSource ds = new ComboPooledDataSource();
        //获取DataSource 指定连接
//        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
        //归还连接到连接池
        conn.close();
    }
}
