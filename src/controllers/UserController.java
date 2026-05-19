package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserController {
	
	ArrayList<String[]> table_users =new ArrayList<>();
    private final String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_IYnU3Epp";
    private final String user = "u_193zl4"; 
    private final String pass = "DOAuRP7kNKsp";
    
    public ArrayList<String[]> usersData() {
        

        String query = "SELECT id, username, password, nombre, correo FROM usuarios";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {

             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
        	    String[] users =new String[5];
        		users[0]=rs.getString(1);
        		users[1]=rs.getString(2);
        		users[2]=rs.getString(3);
        		users[3]=rs.getString(4);
        		users[4]=rs.getString(5);
        		table_users.add(users);
        	}
        	
            

              
        } catch (Exception e) {
            System.out.println("Error de conexión a la BD: " + e.getMessage());
            e.printStackTrace();
        }
        return table_users;
    }
    
    public boolean addUser(String[] user) {
    		boolean userAdded=true;
        String query = "INSERT INTO usuarios (username, password, nombre, correo) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, this.user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
                
        		stmt.setString(1, user[0]);
        		stmt.setString(2, user[1]);
        		stmt.setString(3, user[2]);
        		stmt.setString(4, user[3]);
        		
        		stmt.executeUpdate();
                
                
        }catch (Exception e) {
        		userAdded=false;
            System.out.println("Error de conexión a la BD: " + e.getMessage());
            e.printStackTrace();
        }
    		
    	
    		return userAdded;
    }
	
}