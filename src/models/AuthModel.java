package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    // Cambia "tu_base_de_datos" por el nombre real de tu base en HeidiSQL
    private final String url = "jdbc:mysql://localhost:3306/implementando_mysql";
    // Cambia esto por tu usuario y contraseña de MariaDB (por defecto suele ser root y contraseña vacía)
    private final String user = "root"; 
    private final String pass = "793ghjlqASD";

    public AuthModel() {
    }
    
    public void registro(String nombre, String biografia) {
        System.out.println("Nombre: "+nombre);
        System.out.println("Biografia: "+biografia);
    }
    
    // Método actualizado para conectar a la base de datos
    public boolean acces(String username, String password) {
        boolean isValid = false;
        // Consulta SQL basada en tu tabla
        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Sustituimos los signos de interrogación (?) por los datos del usuario
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery();
            
            // Si rs.next() es true, significa que encontró al usuario en la base de datos
            if (rs.next()) {
                isValid = true; 
            }
            
        } catch (Exception e) {
            System.out.println("Error de conexión a la BD: " + e.getMessage());
            e.printStackTrace();
        }
        
        return isValid;
    }
}