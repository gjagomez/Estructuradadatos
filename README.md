# Implementación de Log4j2

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)]()

## Introducción
Log4j2 es una librería de registro (logging) de Apache que permite generar logs estructurados en aplicaciones Java, mejorando la depuración y monitoreo del sistema.

## Instalación
Para utilizar Log4j2 en un proyecto, es necesario agregar las dependencias en el archivo `pom.xml` Solo para maven:

```xml
<dependencies>
    <!-- Log4j API -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-api</artifactId>
        <version>2.22.1</version>
    </dependency>
    <!-- Log4j Core -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.22.1</version>
    </dependency>
</dependencies>
```

## Configuración
Crea un archivo de configuración `log4j2.xml` en `src/main/resources/` para definir los niveles de log y la salida deseada:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```

## Uso en Java
Importa Log4j2 en la clase donde lo deseas utilizar:

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClaseVectores {
    private static final Logger logger = LogManager.getLogger(ClaseVectores.class);

    public void algunMetodo() {
        logger.info("Información: método ejecutado");
        logger.debug("Mensaje de depuración");
        logger.error("Error en el método", new Exception("Ejemplo de excepción"));
    }
}
```

## Niveles de Log
Log4j2 permite definir diferentes niveles de log para controlar la cantidad de información registrada:

- `TRACE`: Mensajes muy detallados, para depuración profunda.
- `DEBUG`: Información útil para desarrolladores al depurar.
- `INFO`: Información general sobre el flujo del programa.
- `WARN`: Advertencias sobre posibles problemas.
- `ERROR`: Errores en la ejecución que no detienen la aplicación.
- `FATAL`: Errores críticos que pueden hacer fallar el sistema.



---


# Proyecto Ejercicio LinkedList


## Descripción de las Pruebas

La clase `ClaseLinkedListTest` contiene diversas pruebas para verificar el correcto funcionamiento de las operaciones en listas enlazadas:

### 1. Prueba: `testEliminarDuplicados_Correcto`

- **Descripción**: Verifica que la función `eliminarDuplicados` elimine correctamente los elementos duplicados de una lista de números.
- **Entrada**: `[1, 2, 2, 3, 4, 4, 5]`
- **Salida Esperada**: `[1, 2, 3, 4, 5]`
- **Resultado**: Esta prueba debe pasar.

### 2. Prueba: `testEliminarDuplicados_Fallido`

- **Descripción**: Verifica que la función `eliminarDuplicados` falle al comprobar un valor incorrecto.
- **Entrada**: `[1, 2, 2, 3, 4, 4, 5]`
- **Salida Esperada**: `[1, 2, 2, 3, 4, 5]` (incorrecto)
- **Resultado**: Esta prueba debe fallar.

### 3. Prueba: `testInvertirLista_Correcto`

- **Descripción**: Verifica que la función `invertirLista` invierta correctamente una lista de cadenas.
- **Entrada**: `["uno", "dos", "tres", "dos", "uno"]`
- **Salida Esperada**: `["uno", "dos", "tres", "dos", "uno"]`
- **Resultado**: Esta prueba debe pasar.

### 4. Prueba: `testInvertirLista_Fallido`

- **Descripción**: Verifica que la función `invertirLista` falle al comprobar un valor incorrecto.
- **Entrada**: `["uno", "dos", "tres", "dos", "uno"]`
- **Salida Esperada**: `["uno", "dos", "tres", "uno", "dos"]` (incorrecto)
- **Resultado**: Esta prueba debe fallar.

### 5. Prueba: `testIntercalarListas_Correcto`

- **Descripción**: Verifica que la función `intercalarListas` intercale correctamente dos listas de números.
- **Entrada**: `[1, 3, 5]` y `[2, 4, 6]`
- **Salida Esperada**: `[1, 2, 3, 4, 5, 6]`
- **Resultado**: Esta prueba debe pasar.

### 6. Prueba: `testIntercalarListas_Fallido`

- **Descripción**: Verifica que la función `intercalarListas` falle al comprobar un valor incorrecto.
- **Entrada**: `[1, 3, 5]` y `[2, 4, 6]`
- **Salida Esperada**: `[1, 2, 3, 4, 5, 7]` (incorrecto)
- **Resultado**: Esta prueba debe fallar.










📌 **Autor:** Javier Gómez
