/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucioneseficientes_examenjava.configuracion;

/**
 *
 * @author camper
 */

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexionBaseDatos {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.obtenerConexion()) {
            if (conn != null) {
                System.out.println("¡Conexión exitosa a SolucionesEfectivasDB!");
                var stmt = conn.createStatement();
                var rs = stmt.executeQuery("SELECT DATABASE()");
                if (rs.next()) {
                    System.out.println("Base de datos actual: " + rs.getString(1));
                }
            } else {
                System.out.println("No se pudo obtener la conexión.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
