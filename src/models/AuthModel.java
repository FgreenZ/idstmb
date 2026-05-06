package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    private final String url = "jdbc:mysql://localhost:3306/implementando_mysql";
    private final String user = "root"; 
    private final String pass = "793ghjlqASD";

    public AuthModel() {
    }
    
    // 1. Método auxiliar para comprobar si el correo ya existe
    public boolean existeCorreo(String correo) {
        boolean existe = false;
        String query = "SELECT * FROM usuarios WHERE correo = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            
            // Si rs.next() es true, significa que encontró al menos un registro con ese correo
            if (rs.next()) {
                existe = true; 
            }
              
        } catch (Exception e) {
            System.out.println("Error al verificar correo: " + e.getMessage());
            e.printStackTrace();
        }
        
        return existe;
    }
    
    // 2. Método principal para registrar al usuario
    public boolean registro(String nombre, String correo, String password) {
        
        // Primero, verificamos si el correo ya está registrado
        if (existeCorreo(correo)) {
            System.out.println("Registro fallido: El correo " + correo + " ya está en uso.");
            return false; // Retornamos false para indicar que no se pudo registrar
        }
        
        // Si el correo no existe, preparamos el INSERT
        String query = "INSERT INTO usuarios (nombre, correo, password) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            stmt.setString(3, password);
            
            // Usamos executeUpdate() para INSERT, UPDATE o DELETE
            int filasAfectadas = stmt.executeUpdate();
            
            // Si filasAfectadas es mayor a 0, la inserción fue exitosa
            if (filasAfectadas > 0) {
                System.out.println("Usuario registrado exitosamente.");
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("Error al registrar en la BD: " + e.getMessage());
            e.printStackTrace();
        }
        
        return false;
    }
    
    // Tu método de acceso original (intacto, asumiendo que login es con username)
    public boolean acces(String username, String password) {
        boolean isValid = false;
        
        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();
            
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