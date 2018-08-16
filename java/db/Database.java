/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;

/**
 *
 * @author safev
 */
public class Database {
    protected Connection con;
    public Database(){
        try {
            Class.forName(DatabaseInfo.driver);
            con = DriverManager.getConnection(DatabaseInfo.url, DatabaseInfo.user, DatabaseInfo.pass);
            
            System.out.println("Database Already Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close(){
        try {
            if (con!=null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
