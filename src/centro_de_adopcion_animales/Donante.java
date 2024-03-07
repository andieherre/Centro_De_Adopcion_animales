/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro_de_adopcion_animales;

/**
 *
 * @author andhe
 */
public class Donante extends Persona {
    int id_donante;
    String tipo_animal;
    String vacunado;
    int años_animal;
    String enfermedad;

    public Donante(int id_donate, String tipo_animal, String vacunado, int años_animal, String enfermedad) {
        this.id_donante = id_donante;
        this.tipo_animal = tipo_animal;
        this.vacunado = vacunado;
        this.años_animal = años_animal;
        this.enfermedad = enfermedad;
    }

    public Donante() {
    }

    public int getid_donante (){
        return id_donante;
    }
    
    public void setid_donante(int id_donante) {
        this.id_donante = id_donante;
    }
    
    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getVacunado() {
        return vacunado;
    }

    public void setVacunado(String vacunado) {
        this.vacunado = vacunado;
    }

    public int getAños_animal() {
        return años_animal;
    }

    public void setAños_animal(int años_animal) {
        this.años_animal = años_animal;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public String toString() {
        return "Donante{" + "tipo_animal=" + tipo_animal + ", vacunado=" + vacunado + ", a\u00f1os_animal=" + años_animal + ", enfermedad=" + enfermedad + '}';
    }
    
}
