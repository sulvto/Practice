package me.qinchao.example;

import java.sql.*;

/**
 * Created by sulvto on 08/09/2020.
 *
 * @author sulvto
 * @version $Id: JDBCTest.java, v0.1 08/09/2020 10:43 sulvto Exp$$
 */
public class JDBCTest {
    public static final String URL = "jdbc:mysql://localhost:3316/mydb?useUnicode=true&characterEncoding=utf8";
    public static final String USER = "root";
    public static final String PASSWORD = "a111111";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        prepared();

        simple();
    }

    public static void prepared() throws SQLException, ClassNotFoundException {
        // 加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        // 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        // sql, 每行加空格
        String sql = "select * from  user where id=?";
        // 预编译SQL，减少sql执行
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 传参
        ptmt.setInt(1, 1);
        // 执行
        ResultSet rs = ptmt.executeQuery();
        while(rs.next()){
            System.out.println("id: " + rs.getInt("id") + " username: " + rs.getString("username"));
        }
    }

    public static void simple() throws SQLException, ClassNotFoundException {
        // 加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        // 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        // 操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
        // 如果有数据，rs.next()返回true
        while (rs.next()) {
            System.out.println("id: " + rs.getInt("id") + " username: " + rs.getString("username"));
        }
    }
}
