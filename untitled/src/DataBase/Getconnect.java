package DataBase;

import java.sql.*;

/**
 * @author 胡博宇 2020/12/3
 */
public class Getconnect {
    public  static java.sql.Connection getConnectiont(){
        Connection connection=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@//localhost:1521/orcl";
            String username="baotou";
            String password="baotou";
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("连接成功");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("连接失败");
        }
        return connection;

    }
/*    public static void main(String[] args){
        //String sql="select sno,sname from student";
        String sql="select sno,sum(grade) sg from sc group by sno";
        Connection connection=getConnectiont();

        try {
            Statement statement= connection.createStatement();
            //ResultSet resultSet=statement.executeQuery(sql);
            System.out.println("链接成功");


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("链接失败");
        }
    }*/

}