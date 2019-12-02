/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jempol
 */
public class SQL_SI {
    private static Connection connection = null;
    
    public static Connection getConnection() throws Exception{
        if (connection==null){
            try {
                String url , timezone, user, pass;
                url = "jdbc:mysql://localhost/si_sekolah";
                timezone = "?usetimezone=true&serverTimezone=UTC";
                user = "root";
                pass = "";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url+timezone, user, pass);
            } catch (Exception e) {
                System.out.println("error di sini juga");
                e.printStackTrace();
                return null;
            }
        }
        return connection;
    }
    
    public static boolean isConnect(){
        try {
            if (getConnection()==null){
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(SQL_SI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public ResultSet getConnection(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
