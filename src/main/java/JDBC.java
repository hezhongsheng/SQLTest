import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String user="root";
        String password="123456";
        String url = "jdbc:mysql://127.0.0.1:3306/world?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String sql="SELECT * FROM city";
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(url,user,password);
            Statement statement = conn.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("Name"));
            }
            System.out.println("今天复习IDEA连接GitHub");
            //System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
