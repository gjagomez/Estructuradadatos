package EjercicioArraysTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio1;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio2;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio3;

public class JavaTest {
    private static final Logger logger = LogManager.getLogger(JavaTest.class);

    @Test
    public void testMaxWealth() {
        logger.info("Iniciando testMaxWealth...");
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = Ejercicio1.maxWealth(accounts);
        logger.info("Resultado obtenido: {}", result);
        assertEquals(7, result, "La riqueza máxima debería ser 7");
    }

    @Test
    public void testDiagonalSort() {
        logger.info("Iniciando testDiagonalSort...");
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = Ejercicio2.diagonalSort(mat);
        int[][] expected = {{1, 3, 1}, {2, 2, 2}, {3, 1, 3}};
        logger.debug("Matriz esperada: {}", (Object) expected);
        assertArrayEquals(expected, sortedMat, "La matriz debería estar ordenada");
    }

    @Test
    public void testMatrixSum() {
        logger.info("Iniciando testMatrixSum...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = Ejercicio3.matrixSum(mat);
        logger.info("Suma de la matriz: {}", result);
        assertEquals(45, result, "La suma debería ser 45");
    }

    @Test
    public void testMaxWealth_Fail() {
        logger.info("Iniciando testMaxWealth_Fail...");
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = Ejercicio1.maxWealth(accounts);
        logger.error("Resultado esperado incorrecto, obteniendo: {}", result);
        assertEquals(8, result, "Este test debe fallar  NO es 8");
    }

    @Test
    public void testDiagonalSort_Fail() {
        logger.info("Iniciando testDiagonalSort_Fail...");
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = Ejercicio2.diagonalSort(mat);
        int[][] expected = {{3, 3, 1}, {2, 2, 2}, {1, 1, 1}};
        logger.error("Matriz ordenada incorrectamente: {}", (Object) sortedMat);
        assertArrayEquals(expected, sortedMat, "Este test debe fallar ");
    }

    @Test
    public void testMatrixSum_Fail() {
        logger.info("Iniciando testMatrixSum_Fail...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = Ejercicio3.matrixSum(mat);
        logger.error("Resultado incorrecto, obteniendo: {}", result);
        assertEquals(50, result, "Este test debe fallar porque no es 50");
    }
}