# Ejercicios de Estructuras de Datos: Implementación de TreeSet y TreeMap

Este repositorio contiene implementaciones en Java que demuestran el uso de las colecciones TreeSet y TreeMap a través de tres ejercicios prácticos:

1. Análisis de Frecuencia de Palabras
2. Sistema de Control de Versiones
3. Sistema de Gestión de Eventos

## Descripción General

Estos ejercicios muestran diversas aplicaciones de las estructuras de datos TreeMap y TreeSet de Java, que proporcionan funcionalidad de colecciones ordenadas. Las implementaciones demuestran casos de uso del mundo real para estas estructuras con un enfoque en la organización y recuperación de datos.

## Detalles de los Ejercicios

### 1. Análisis de Frecuencia de Palabras

El método `analizarFrecuenciaPalabras` lee un archivo de texto y analiza la frecuencia de cada palabra, almacenando los resultados en un TreeMap.

**Características:**
- Lee texto de un archivo línea por línea
- Limpia el texto eliminando puntuación y convirtiendo a minúsculas
- Cuenta las ocurrencias de palabras utilizando un TreeMap donde:
  - Las claves son palabras únicas
  - Los valores son conteos de ocurrencias

**Ejemplo de uso:**
```java
// Analizar palabras en un archivo de texto
EjercicioTreeSetAndMap.analizarFrecuenciaPalabras("prueba.txt");
```

### 2. Sistema de Seguimiento de Versiones

La clase `VersionTracker` implementa un sistema simple de control de versiones utilizando TreeMap para rastrear diferentes versiones de código o contenido.

**Características:**
- Agrega nuevas versiones con numeración automática
- Recupera versiones específicas por número
- Obtiene la versión más reciente
- Elimina versiones específicas
- Lista todas las versiones existentes

**Ejemplo de uso:**
```java
// Crear un nuevo rastreador de versiones
VersionTracker tracker = new EjercicioTreeSetAndMap.VersionTracker();

// Agregar diferentes versiones de código
tracker.agregarVersion("public class HolaMundo { /* código inicial */ }");
tracker.agregarVersion("public class HolaMundo { /* código actualizado */ }");

// Recuperar una versión específica
String version1 = tracker.obtenerVersion(1);

// Obtener la última versión
String ultimaVersion = tracker.obtenerUltimaVersion();

// Mostrar todas las versiones
tracker.mostrarTodasLasVersiones();

// Eliminar una versión
tracker.eliminarVersion(1);
```

### 3. Sistema de Gestión de Eventos

La clase `SistemaEventos` utiliza TreeSet para gestionar y organizar eventos cronológicamente.

**Características:**
- Almacena eventos en orden cronológico utilizando TreeSet
- Ordena automáticamente los eventos por fecha/hora
- Recupera el próximo evento programado
- Limpia automáticamente eventos pasados
- Muestra todos los eventos programados

**La clase `Evento`:**
- Implementa Comparable para permitir la ordenación en TreeSet
- Almacena detalles del evento (fecha, nombre, ubicación)
- Proporciona métodos para acceder a la información del evento

**Ejemplo de uso:**
```java
// Crear el sistema de eventos
SistemaEventos sistema = new EjercicioTreeSetAndMap.SistemaEventos();

// Crear eventos
LocalDateTime manana = LocalDateTime.now().plusDays(1);
Evento evento1 = new EjercicioTreeSetAndMap().new Evento(
    manana, "Reunión de Equipo", "Sala de Conferencias A");

LocalDateTime proxSemana = LocalDateTime.now().plusDays(7);
Evento evento2 = new EjercicioTreeSetAndMap().new Evento(
    proxSemana, "Fecha Límite del Proyecto", "Oficina Principal");

// Agregar eventos al sistema
sistema.agregarEvento(evento1);
sistema.agregarEvento(evento2);

// Mostrar todos los eventos
sistema.mostrarEventos();

// Obtener el próximo evento programado
Evento proximoEvento = sistema.obtenerProximoEvento();
```

## Conceptos Clave Demostrados

- **TreeMap**: Una implementación de la interfaz Map que mantiene sus entradas ordenadas según el orden natural de sus claves o utilizando un Comparator proporcionado.
- **TreeSet**: Una implementación de Set basada en TreeMap que mantiene sus elementos ordenados según su orden natural o un Comparator personalizado.
- **Comparable**: Interfaz utilizada para definir el orden natural de objetos personalizados.
- **Iteradores**: Utilizados para recorrer y manipular colecciones de manera eficiente.
- **Manejo de archivos**: Lectura y procesamiento de datos desde archivos de texto.


## Cómo Utilizar

1. Clone este repositorio
2. Utilice las clases según se muestra en los ejemplos de uso anteriores

## Contribuciones

