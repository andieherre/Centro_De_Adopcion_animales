/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro_de_adopcion_animales;

/**
 *
 * @author andhe
 */
public class Adoptar extends Persona{
    String asignacion_mascota;

    public Adoptar(String asignacion_mascota) {
        this.asignacion_mascota = asignacion_mascota;
    }

    public Adoptar() {
    }

    public String getAsignacion_mascota() {
        return asignacion_mascota;
    }

    public void setAsignacion_mascota(String asignacion_mascota) {
        this.asignacion_mascota = asignacion_mascota;
    }

    @Override
    public String toString() {
        return "Adoptar{" + "asignacion_mascota=" + asignacion_mascota + '}';
    }
       
}