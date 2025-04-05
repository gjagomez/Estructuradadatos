/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class EjercicioTreeSetAndMap {

    //Ejercicio 1
    public static void analizarFrecuenciaPalabras(String rutaArchivo) {
        TreeMap<String, Integer> frecuenciaPalabras = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Eliminar puntuaciones y convertir a minúsculas
                linea = linea.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ]", "").toLowerCase();
                String[] palabras = linea.split("\\s+"); // dividir por espacios

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

    }
    //Ejercicio 2

    public static class VersionTracker {

        private TreeMap<Integer, String> versiones = new TreeMap<>();
        private int siguienteVersion = 1;

        public void agregarVersion(String contenidoCodigo) {
            versiones.put(siguienteVersion, contenidoCodigo);
            System.out.println("Agregar versión " + siguienteVersion + ": \"" + contenidoCodigo + "\"");
            siguienteVersion++;
        }

        public String obtenerVersion(int version) {
            return versiones.get(version);
        }

        public String obtenerUltimaVersion() {
            if (versiones.isEmpty()) {
                return null;
            }
            return versiones.get(versiones.lastKey());
        }

        public void eliminarVersion(int version) {
            if (versiones.containsKey(version)) {
                versiones.remove(version);
                System.out.println("Versión " + version + " eliminada.");
            } else {
                System.out.println("La versión " + version + " no existe.");
            }
        }

        public void mostrarTodasLasVersiones() {
            for (Integer version : versiones.keySet()) {
                System.out.println("Versión " + version + ": \"" + versiones.get(version) + "\"");
            }
        }
    }

    
   public class Evento implements Comparable<Evento> {
    private LocalDateTime fecha;
    private String nombre;
    private String ubicacion;

    // Constructor con parámetros
    public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int compareTo(Evento otro) {
        return this.fecha.compareTo(otro.fecha);
    }

    @Override
    public String toString() {
        return "\"" + nombre + "\", " + fecha + ", " + ubicacion;
    }
}

     public static  class SistemaEventos {

        private TreeSet<Evento> eventos = new TreeSet<>();

        public void agregarEvento(Evento evento) {
            eventos.add(evento);
        }

        public void mostrarEventos() {
            System.out.println("Lista de eventos:");
            int i = 1;
            for (Evento e : eventos) {
                System.out.println(i++ + ". " + e);
            }
        }

        public Evento obtenerProximoEvento() {
            limpiarEventosPasados();
            return eventos.isEmpty() ? null : eventos.first();
        }

        // Eliminar eventos cuya fecha ya pasó
        private void limpiarEventosPasados() {
            LocalDateTime ahora = LocalDateTime.now();
            Iterator<Evento> it = eventos.iterator();
            while (it.hasNext()) {
                Evento e = it.next();
                if (e.getFecha().isBefore(ahora)) {
                    it.remove();
                } else {
                    break; // porque están ordenados cronológicamente
                }
            }
        }
    }
}
