/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

/**
 *
 * @author USUARIO
 */
import javax.swing.JOptionPane;
public class Vista {
    public int mostrarMenu() {
        int opcion = 0;
        boolean valido = false;

        String menu = """
                MENU PRINCIPAL
                1. Crear competencia
                2. Agregar equipo
                3. Agregar competidor
                4. Asignar puntos
                5. Actualizar ranking
                6. Mostrar reporte
                7. Salir
                
                Elige una opción:
                """;

        while (!valido) {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                valido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
            }
        }

        return opcion;
    }

    public String pedirTexto(String mensaje) {
        String texto;

        do {
            texto = JOptionPane.showInputDialog(mensaje);

            if (texto == null || texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: no puede estar vacío");
            }

        } while (texto == null || texto.isEmpty());

        return texto;
    }

    public int pedirEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                valido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
            }
        }

        return numero;
    }

    public double pedirDouble(String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                valido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
            }
        }

        return numero;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}