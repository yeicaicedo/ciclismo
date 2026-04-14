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
     public void testCalcularRanking() {

        Competencia comp = new Competencia("Mundial");

        Equipo e1 = new Equipo("Eagles", "Colombia");
        Equipo e2 = new Equipo("Lions", "USA");

        Competidor c1 = new Competidor("Ana", 20, 1.6, 55, "Colombia", 0);
        Competidor c2 = new Competidor("Juan", 22, 1.7, 60, "USA", 0);
        
        
        c1.actualizarRanking(20); 
        c2.actualizarRanking(10); 

        e1.agregarCompetidor(c1);
        e2.agregarCompetidor(c2);

        comp.agregarEquipo(e1);
        comp.agregarEquipo(e2);

        comp.calcularRanking();

        assertEquals(1, c1.getRankingMundial());
        assertEquals(2, c2.getRankingMundial());
    }
}
