# Proyecto Ejercicio LinkedList


Este proyecto contiene una implementación de operaciones sobre listas enlazadas en Java. La clase `EjercicioLinkedList` proporciona métodos para eliminar duplicados, invertir listas y intercalar dos listas.

## Contenido

- [Descripción de la Clase](#descripción-de-la-clase)
- [Métodos](#métodos)
  - [eliminarDuplicados](#eliminarduplicados)
  - [invertirLista](#invertirlista)
  - [intercalarListas](#intercalarlistas)
- [Ejemplos de Uso](#ejemplos-de-uso)

## Descripción de la Clase

La clase `EjercicioLinkedList` incluye métodos estáticos que permiten realizar operaciones comunes en listas enlazadas, específicamente `LinkedList` de Java.

## Métodos

### `eliminarDuplicados`

```java
public static void eliminarDuplicados(LinkedList<Integer> lista)


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
