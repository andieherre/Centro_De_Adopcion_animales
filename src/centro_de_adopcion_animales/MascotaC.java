/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro_de_adopcion_animales;

import java.time.LocalDateTime;

/**
 *
 * @author andhe
 */
public class MascotaC {
    
 int id_mascotas;
 String nombre;
 String raza;
 String especie;
 String color;
 double medidad;
 double peso;
 LocalDateTime fecha_nac;
    
    public MascotaC (int id_mascota, String nombre, String raza, String especie, String color, double medida, double peso, LocalDateTime fecha_nac)
    {
    this.id_mascotas = id_mascota;
    this.nombre = nombre;
    this.raza = raza;
    this.especie = especie;
    this.color = color;
    this.medidad = medida;
    this.peso = peso;
    this.fecha_nac = fecha_nac;
    }

    public int getId_mascotas() {
        return id_mascotas;
    }

    public void setId_mascotas(int id_mascotas) {
        this.id_mascotas = id_mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMedidad() {
        return medidad;
    }

    public void setMedidad(double medidad) {
        this.medidad = medidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDateTime getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDateTime fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    
}


    

