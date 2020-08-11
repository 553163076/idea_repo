package com.lmonkey.dao;

import java.sql.*;

public class Basedao {
    static {
        // 加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getconn() {
//        创建一个连接对象
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://175.24.191.242:3306/lmonkeyshop?useSSL=false&serverTimezone=UTC", "root", "553163");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static int exectuIUD(String sql, Object[] params) {
        int count = 0;
        Connection conn = Basedao.getconn();
//        准备sql
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            count = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Basedao.closeall(null, ps, conn);
        }
        return count;
    }

    public static void closeall(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (conn != null)
                conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
