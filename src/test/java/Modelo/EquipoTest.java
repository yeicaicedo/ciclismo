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
public class EquipoTest {
    
    public EquipoTest() {
    }
    
    @Test
    public void testAgregarCompetidor() {

        Equipo e = new Equipo("Eagles", "Colombia");
        Competidor c = new Competidor("Ana", 20, 1.65, 55, "Colombia", 0);

        e.agregarCompetidor(c);

        assertEquals(1, e.getCompetidores().size(),"Fallo en el test1");
    }
}
