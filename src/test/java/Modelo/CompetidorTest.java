/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class CompetidorTest {
    
    public CompetidorTest() {
    }
    
    @Test
    public void testActualizarRanking() {

        Competidor c = new Competidor("Ana", 20, 1.65, 55, "Colombia", 0);

        c.actualizarRanking(10);
        c.actualizarRanking(5);

        assertEquals(15, c.getPuntos(), "Fallo en el test1");
    }

    @Test
    public void testObtenerDatos() {

        Competidor c = new Competidor("Juan", 22, 1.70, 60, "USA", 1);

        String esperado = "1° |Nombre: Juan\nEdad: 22\nEstatura: 1.7\nPeso: 60.0Kg\nPais: USA\nPuntos: 0";

        assertEquals(esperado, c.obtenerDatos(),"Fallo en el test2");
    }
}
