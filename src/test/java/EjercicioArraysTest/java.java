/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArraysTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio1;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio2;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays.Ejercicio3;

/**
 *
 * @author ROG STRIX
 */
public class java {
     @Test
    public void testMaxWealth() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = Ejercicio1.maxWealth(accounts);
        assertEquals(7, result, "La riqueza máxima debería ser 7");
    }

    @Test
    public void testDiagonalSort() {
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = Ejercicio2.diagonalSort(mat);
        int[][] expected = {{1, 3, 1}, {2, 2, 2}, {3, 1, 3}};
        assertArrayEquals(expected, sortedMat, "La matriz  debería estar ordenada");
    }

    @Test
    public void testMatrixSum() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = Ejercicio3.matrixSum(mat);
        assertEquals(45, result, "La suma debería ser 45");
    }
    
        @Test
    public void testMaxWealth_Fail() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {5, 1, 1}};
        int result = Ejercicio1.maxWealth(accounts);
        
     
        assertEquals(8, result, "Este test debe fallar  NO es 8");
    }

    @Test
    public void testDiagonalSort_Fail() {
        int[][] mat = {{3, 3, 1}, {2, 2, 2}, {1, 1, 3}};
        int[][] sortedMat = Ejercicio2.diagonalSort(mat);

     
        int[][] expected = {{3, 3, 1}, {2, 2, 2}, {1, 1, 1}};
        
        assertArrayEquals(expected, sortedMat, "Este test debe fallar ");
    }

    @Test
    public void testMatrixSum_Fail() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = Ejercicio3.matrixSum(mat);

        
        assertEquals(50, result, "Este test debe fallar porque no es 50");
    }
}
