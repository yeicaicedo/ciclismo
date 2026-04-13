/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;

public class Equipo {

    //Atributos
    private String nombre;
    private String pais;
    private ArrayList<Competidor> competidores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new ArrayList<>();
    }

    public void agregarCompetidor(Competidor c) {
        competidores.add(c);
    }

    public String obtenerDatosEquipo() {
        String datos = "Equipo: " + nombre + " | País: " + pais + "\n";
        for (Competidor c : competidores) {
            datos += c.toString() + "\n";
        }
        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Competidor> getCompetidores() {
        return competidores;
    }
    
}
