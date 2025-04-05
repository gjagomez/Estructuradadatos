/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioTreeMap;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioTreeSetAndMap;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioTreeSetAndMap.VersionTracker;

import org.junit.jupiter.api.Test;



/**
 *
 * @author ROG STRIX
 */
public class testTreeMap {
    
   @Test
    void testTremap() {
        try {
            //Crear archivo temporal para la prueba
            Path archivoTemporal = Files.createTempFile("prueba", ".txt");
            FileWriter writer = new FileWriter(archivoTemporal.toFile());
            writer.write("Hola mundo. Este es un archivo de prueba. Hola de nuevo.");
            writer.close();
            //Ejecutar el método
            EjercicioTreeSetAndMap.analizarFrecuenciaPalabras(archivoTemporal.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    @Test
    void testVersiones() {
        VersionTracker tracker = new VersionTracker();
        tracker.agregarVersion("System.out.println(\"Hola Mundo\");");
        tracker.agregarVersion("System.out.println(\"Hola Java\");");

        assertEquals("System.out.println(\"Hola Mundo\");", tracker.obtenerVersion(1));
        assertEquals("System.out.println(\"Hola Java\");", tracker.obtenerUltimaVersion());

        tracker.eliminarVersion(1);
        assertNull(tracker.obtenerVersion(1));
    }
    
    
}
