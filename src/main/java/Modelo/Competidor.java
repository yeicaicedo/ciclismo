/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Competidor extends Persona {
    private String paisR;
    private int puntos;
    private int rankingMundial;

    public Competidor(String nom, int edad, double estatura, double peso, String paisR, int rankingMundial) {
        super(nom, edad, estatura, peso);
        this.puntos = 0;
        this.rankingMundial = rankingMundial;
        this.paisR = paisR;
    }

    public void actualizarRanking(int puntosObtenidos) {
        this.puntos += puntosObtenidos;
    }

    public String obtenerDatos() {
        return rankingMundial + "° |" + super.toString() + "Pais: " + paisR + "\n" + "Puntos: " + puntos;
    }

    public String getPaisR() {
        return paisR;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

}
