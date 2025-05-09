/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucioneseficientes_examenjava.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class ConexionBaseDatos {
    // Conexión a base de datos en el localhost
    private static final String URL = "jdbc:mysql://localhost:3306/SolucionesEfectivasDB?useSSL=false&serverTimezone=UTC";
    private static final String USER = "campus2023";
    private static final String PASSWORD = "campus2023";
    
    
    // Función para conectarse a la base de datos
    public static Connection obtenerConexion() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver de MySQL", e);
        }
    } 
    
    // Función para cerrar la conexión a la base de datos
    public static void cerrarConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
