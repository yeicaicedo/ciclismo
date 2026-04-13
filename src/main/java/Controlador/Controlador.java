/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author USUARIO
 */
import Modelo.Equipo;
import Modelo.Competencia;
import Modelo.Competidor;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {

    private Competencia competencia;
    private Vista vista;
    private ArrayList<Equipo> equipos;

    public Controlador() {
        vista = new Vista();
        equipos = new ArrayList<>();
    }

    public void iniciar() {

        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    crearCompetencia();
                    break;
                case 2:
                    agregarEquipo();
                    break;
                case 3:
                    agregarCompetidor();
                    break;
                case 4:
                    asignarPuntos();
                    break;
                case 5:
                    calcularRanking();
                    break;
                case 6:
                    mostrarReporte();
                    break;
                case 7:
                    vista.mostrarMensaje("Saliendo...");
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida");
            }

        } while (opcion != 7);
    }

    // Crear competencia
    private void crearCompetencia() {
        String nombre = vista.pedirTexto("Nombre de la competencia:");
        competencia = new Competencia(nombre);
        vista.mostrarMensaje("Competencia creada");
    }

    // Agregar equipo
    private void agregarEquipo() {
        if (competencia == null) {
            vista.mostrarMensaje("Primero cree la competencia");
            return;
        }

        String nombre = vista.pedirTexto("Nombre del equipo:");
        String pais = vista.pedirTexto("País:");

        Equipo e = new Equipo(nombre, pais);
        equipos.add(e);
        competencia.agregarEquipo(e);

        vista.mostrarMensaje("Equipo agregado");
    }

    //mostrar equipos
    private void listarEquipos() {
        if (equipos == null) {
            vista.mostrarMensaje("No hay equipos inscritos.");
            return;
        }

        String lista = "EQUIPOS REGISTRADOS:\n\n";

        for (int i = 0; i < equipos.size(); i++) {
            lista += i + ". "
                    + equipos.get(i).getNombre()
                    + " (" + equipos.get(i).getPais() + ")\n";
        }
        vista.mostrarMensaje(lista);
    }

    // Agregar Competidor
    private void agregarCompetidor() {

        if (equipos.isEmpty()) {
            vista.mostrarMensaje("Primero agregue equipos");
            return;
        }

        vista.mostrarMensaje("Se mostrará la lista de Equipos.\n\nObserve la POSICIÓN del equipo al que desea agregarle un competidor. \nLuego presione OK para continuar.");
        listarEquipos();

        int opc = vista.pedirEntero("Seleccione equipo (0 a " + (equipos.size() - 1) + "):");
        Equipo e = equipos.get(opc);

        String nom = vista.pedirTexto("Nombre:");
        int edad = vista.pedirEntero("Edad:");
        double est = vista.pedirDouble("Estatura:");
        double peso = vista.pedirDouble("Peso (Kg):");
        String paisR = vista.pedirTexto("País que representa:");

        Competidor c = new Competidor(nom, edad, est, peso, paisR, 0);

        e.agregarCompetidor(c);

        vista.mostrarMensaje("Competidor agregado");
    }
    
   // Agregar puntos
private void asignarPuntos() {
    if (equipos.isEmpty()) {
        vista.mostrarMensaje("No hay equipos");
        return;
    }
    
    vista.mostrarMensaje("Se mostrará la lista de Equipos.\n\nObserve la POSICIÓN del equipo.");
    listarEquipos();

    int eq = vista.pedirEntero("Equipo (0 a " + (equipos.size() - 1) + "):");
    Equipo equipo = equipos.get(eq);

    if (equipo.getCompetidores().isEmpty()) {
        vista.mostrarMensaje("No hay competidores en este equipo");
        return;
    }

    String lista = "COMPETIDORES:\n\n";

    for (int i = 0; i < equipo.getCompetidores().size(); i++) {
        lista += i + ". " + equipo.getCompetidores().get(i).getNom() + "\n";
    }

    vista.mostrarMensaje(lista);

    // elegir competidor
    int comp = vista.pedirEntero("Competidor (0 a " + (equipo.getCompetidores().size() - 1) + "):");

    Competidor c = equipo.getCompetidores().get(comp);

    int puntos = vista.pedirEntero("Puntos a agregar:");

    c.actualizarRanking(puntos);

    vista.mostrarMensaje("Puntos asignados");
}


    // Ranking
    private void calcularRanking() {
        if (competencia == null) {
            vista.mostrarMensaje("No hay competencia");
            return;
        }

        competencia.calcularRanking();
        vista.mostrarMensaje("Ranking actualizado");
    }

    // Mostrar reporte
    private void mostrarReporte() {
        if (competencia == null) {
            vista.mostrarMensaje("No hay competencia");
            return;
        }

        vista.mostrarMensaje(competencia.generarReporte());
    }
}
