/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class CompetenciaTest {
    
    public CompetenciaTest() {
    }
    
    @Test
    public void testFlujoCompleto() {

        // Crear competencia
        Competencia comp = new Competencia("Olimpiadas");

        // Crear equipo
        Equipo e = new Equipo("Eagles", "Colombia");
        comp.agregarEquipo(e);

        // Crear competidor
        Competidor c = new Competidor("Ana", 20, 1.70, 60, "Colombia", 0);
        e.agregarCompetidor(c);

        // Asignar puntos
        c.actualizarRanking(10);

        // Calcular ranking
        comp.calcularRanking();

        // Generar reporte
        String reporte = comp.generarReporte();

        // VALIDACIONES MÁS SEGURAS
        assertNotNull(reporte, "Fallo");
        assertFalse(reporte.isEmpty(), "Fallo");
    }
}