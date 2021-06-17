/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kahfi
 */
public class koneksi {
//    static Connection MySQLConfig;
//    public static Connection configDB() throws SQLException{
//        try{
//            String url="jdbc:mysql://localhost:3306/tugasakhir";
//            String user = "root";
//            String pass = "";
//            
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            MySQLConfig = DriverManager.getConnection(url,user,pass);
//        }catch (SQLException e){
//            System.out.println("Koneksi Ke DataBase GAGAL "+e.getMessage()); 
//        }
//        return MySQLConfig;
//    }
    static com.mysql.jdbc.Connection con;
    
    public static com.mysql.jdbc.Connection connection(){
        if (con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("tugasakhir");
            data.setUser("root");
            data.setPassword("");
            
            try {
                con = (com.mysql.jdbc.Connection) data.getConnection();
            } catch (SQLException ex){
                ex.printStackTrace();
            }    
        } 
        return con;
    }

    public static Object configDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
