/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solucioneseficientes_examenjava.servicio.modelo;

/**
 *
 * @author camper
 */

import java.util.list;


public class ServicioDAO {
    private int id;
    private String nombre;
    private String descripcion;
    private String precioPorHora;
    private String categoria;
    
    public ClienteDAO(int id, String nombre, String descripcion, String precioPorHora, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.categoria = categoria;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public void getDescripcion() {return descripcion; }
    public void setDescripcion(String descripcion) {return this.descripcion = descripcion; }
    
     
    public String getprecioPorHora() {return precioPorHora}
    
}
