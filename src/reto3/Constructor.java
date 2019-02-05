/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author AlumnoUTM
 */
public class Constructor {
    private int puntaje;
    private String nombre_personaje = "Constructor";
    
    public Constructor(int puntaje) {
        this.puntaje = puntaje;
    }

    public Constructor() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre_personaje() {
        return nombre_personaje;
    }

    public void setNombre_personaje(String nombre_personaje) {
        this.nombre_personaje = nombre_personaje;
    }
}
