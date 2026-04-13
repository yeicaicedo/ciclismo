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

public class Competencia {

    private String nombreEvento;
    private ArrayList<Equipo> equipos;

    public Competencia(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    public String generarReporte() {

    String reporte = "=== COMPETENCIA: " + nombreEvento + " ===\n\n";
    reporte += "=== CLASIFICACIÓN GENERAL ===\n\n";

    ArrayList<Competidor> todos = new ArrayList<>();

    // 1. juntar todos los competidores
    for (Equipo e : equipos) {
        todos.addAll(e.getCompetidores());
    }

    // 2. ordenar por ranking (menor = mejor)
    for (int i = 0; i < todos.size() - 1; i++) {
        for (int j = i + 1; j < todos.size(); j++) {

            if (todos.get(i).getRankingMundial() > todos.get(j).getRankingMundial()) {

                Competidor temp = todos.get(i);
                todos.set(i, todos.get(j));
                todos.set(j, temp);
            }
        }
    }

    // 3. mostrar en orden
    for (Competidor c : todos) {
        reporte += "----------------------\n";
        reporte += c.obtenerDatos();
    }

    return reporte;
}

    
    public void calcularRanking() {

    ArrayList<Competidor> todos = new ArrayList<>();

    for (Equipo e : equipos) {
        todos.addAll(e.getCompetidores());
    }
    
    for (int i = 0; i < todos.size() - 1; i++) {
        for (int j = i + 1; j < todos.size(); j++) {

            if (todos.get(i).getPuntos() < todos.get(j).getPuntos()) {

                Competidor temp = todos.get(i);
                todos.set(i, todos.get(j));
                todos.set(j, temp);
            }
        }
    }
    int posicion = 1;
    for (Competidor c : todos) {
        c.setRankingMundial(posicion);
        posicion++;
    }
}

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

}
