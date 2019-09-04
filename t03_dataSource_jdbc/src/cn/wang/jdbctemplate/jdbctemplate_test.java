package cn.wang.jdbctemplate;

import cn.wang.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbctemplate_test {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update person set qian = 8000 where id = ?";
        int count = template.update(sql, 1);
        System.out.println(count);
    }
}
