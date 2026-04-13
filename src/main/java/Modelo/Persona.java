/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Persona {
    
    protected String nom;
    protected int edad;
    protected double estatura;
    protected double peso;

    public Persona(String nom, int edad, double estatura, double peso) {
        this.nom = nom;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nom + "\n" + "Edad: " + edad + "\n"
                + "Estatura: " + estatura + "\n" + "Peso: " + peso+ "Kg" + "\n";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
}
