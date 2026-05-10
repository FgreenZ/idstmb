package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserController {
	
	ArrayList<String[]> table_users =new ArrayList<>();
    private final String url = "jdbc:mysql://localhost:3306/implementando_mysql";
    private final String user = "root"; 
    private final String pass = "793ghjlqASD";
    
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
	
}
