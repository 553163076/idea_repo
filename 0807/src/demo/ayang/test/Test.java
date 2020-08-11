package demo.ayang.test;

import java.sql.*;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 9:39 2020/8/7
 * @Modified By:
 */

class Test_conn {
    public static final String URL = "jdbc:mysql://175.24.191.242:3306/news_db";
    public static final String USER = "root";
    public static final String PASSWORD = "553163";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        // 获取连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        // 操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM news");
        // 如果有数据，rs.next()返回true
        while (rs.next()) {
            System.out.println(rs.getString("time") + "  " + rs.getString("title"));
        }
    }

}
