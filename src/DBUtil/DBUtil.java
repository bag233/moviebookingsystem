/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import java.sql.*;
import java.util.logging.*;
public class DBUtil
{		
	
    public static Connection getConnection() {
                String user ="root";
		String password ="";
		String url="jdbc:mysql://localhost:3306/bookingusr?useSSL=false";
                Connection con = null;
		try {
			//-2
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
                       // Statement stmt =con.createStatement();
                        //ResultSet rs=stmt.executeQuery("select * from bookinguser");
                        /*if(con !=null){
                            System.out.println("connected to database bookingusr");
                       
                        }
                        else{
                            System.out.println("failed to connect to database bookingusr");
                            
                        }*/
		}
                catch(SQLException ex){
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE,null,ex);
                }
		catch(ClassNotFoundException ex){
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE,null,ex);
                }
                return con;
    }
}