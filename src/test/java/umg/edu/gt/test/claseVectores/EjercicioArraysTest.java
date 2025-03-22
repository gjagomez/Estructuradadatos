package umg.edu.gt.test.claseVectores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

/**
 *
 * @author ROG STRIX
 */
public class EjercicioArraysTest {
    
    private static final Logger logger = LogManager.getLogger(EjercicioArraysTest.class);
    

 
    @Test
    public void testMaxWealth() {
        logger.info("Iniciando testMaxWealth...");
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = EjercicioArrays.Ejercicio1.maxWealth(accounts);
        logger.info("Resultado obtenido: {}", result);
        assertEquals(7, result, "La riqueza máxima debería ser 7");
    }
    
    @Test
    public void testMaxWealth_Fail() {
        logger.info("Iniciando testMaxWealth_Fail...");
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = EjercicioArrays.Ejercicio1.maxWealth(accounts);
        logger.error("Resultado esperado incorrecto, obteniendo: {}", result);
        assertEquals(8, result, "Este test debe fallar ya que la riqueza máxima es 7, no 8");
    }
    
    @Test
    public void testMaxWealth_Fail_NegativeValues() {
        logger.info("Iniciando testMaxWealth_Fail_NegativeValues...");
        int[][] accounts = {{-1, -2, -3}, {-3, -2, -1}, {-5, -1, -1}};
        int result = EjercicioArrays.Ejercicio1.maxWealth(accounts);
        logger.error("Test con valores negativos, resultado: {}", result);
        assertEquals(0, result, "Este test debe fallar porque con valores negativos el resultado debería ser menor que 0");
    }
    
    @Test
    public void testMaxWealth_Fail_EmptyArray() {
        logger.info("Iniciando testMaxWealth_Fail_EmptyArray...");
        int[][] accounts = {};
        int result = EjercicioArrays.Ejercicio1.maxWealth(accounts);
        logger.error("Test con array vacío, resultado: {}", result);
        assertTrue(result > 0, "Este test debe fallar porque un array vacío debería devolver 0");
    }
    

    
    @Test
    public void testDiagonalSort() {
        logger.info("Iniciando testDiagonalSort...");
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = EjercicioArrays.Ejercicio2.diagonalSort(mat);
        int[][] expected = {{1, 3, 1}, {2, 2, 2}, {3, 1, 3}};
        logger.info("Matriz esperada: {}", (Object) expected);
        assertArrayEquals(expected, sortedMat, "La matriz debería estar ordenada diagonalmente");
    }
    
    @Test
    public void testDiagonalSort_Fail() {
        logger.info("Iniciando testDiagonalSort_Fail...");
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = EjercicioArrays.Ejercicio2.diagonalSort(mat);
        int[][] expected = {{3, 3, 1}, {2, 2, 2}, {1, 1, 1}};
        logger.error("Matriz ordenada incorrectamente: {}", (Object) sortedMat);
        assertArrayEquals(expected, sortedMat, "Este test debe fallar ya que la matriz ordenada es diferente");
    }
    
    @Test
    public void testDiagonalSort_Fail_MatrixUnchanged() {
        logger.info("Iniciando testDiagonalSort_Fail_MatrixUnchanged...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] original = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                original[i][j] = mat[i][j];
            }
        }
        
        int[][] sortedMat = EjercicioArrays.Ejercicio2.diagonalSort(mat);
        logger.error("La matriz debería cambiar pero no cambia");
        assertFalse(matrixEquals(original, sortedMat), "Este test debe fallar porque la matriz original y la ordenada deberían ser diferentes");
    }
    
    @Test
    public void testDiagonalSort_Fail_NonSquareMatrix() {
        logger.info("Iniciando testDiagonalSort_Fail_NonSquareMatrix...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] sortedMat = EjercicioArrays.Ejercicio2.diagonalSort(mat);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}};
        logger.error("Matriz no cuadrada ordenada incorrectamente");
        assertArrayEquals(expected, sortedMat, "Este test debe fallar ya que la matriz no cuadrada debería ordenarse de manera diferente");
    }
    
 
    
    @Test
    public void testMatrixSum() {
        logger.info("Iniciando testMatrixSum...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = EjercicioArrays.Ejercicio3.matrixSum(mat);
        logger.info("Suma de la matriz: {}", result);
        assertEquals(45, result, "La suma debería ser 45");
    }
    
    @Test
    public void testMatrixSum_Fail() {
        logger.info("Iniciando testMatrixSum_Fail...");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = EjercicioArrays.Ejercicio3.matrixSum(mat);
        logger.error("Resultado incorrecto, obteniendo: {}", result);
        assertEquals(50, result, "Este test debe fallar porque la suma es 45, no 50");
    }
    
    @Test
    public void testMatrixSum_Fail_NegativeSum() {
        logger.info("Iniciando testMatrixSum_Fail_NegativeSum...");
        int[][] mat = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        int result = EjercicioArrays.Ejercicio3.matrixSum(mat);
        logger.error("Suma de matriz con valores negativos: {}", result);
        assertTrue(result > 0, "Este test debe fallar porque la suma de valores negativos debería ser negativa");
    }
    
    @Test
    public void testMatrixSum_Fail_EmptyMatrix() {
        logger.info("Iniciando testMatrixSum_Fail_EmptyMatrix...");
        int[][] mat = {};
        int result = EjercicioArrays.Ejercicio3.matrixSum(mat);
        logger.error("Suma de matriz vacía: {}", result);
        assertEquals(1, result, "Este test debe fallar porque la suma de una matriz vacía debería ser 0");
    }
    
  
    private boolean matrixEquals(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) return false;
        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) return false;
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
}