/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author ROG STRIX
 */
public class OrdenarDiagonales {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> diagonales = new HashMap<>();

 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonales
                    .computeIfAbsent(i - j, k -> new PriorityQueue<>())
                    .add(mat[i][j]);
            }
        }

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = diagonales.get(i - j).poll();
            }
        }

        return mat;
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int[] fila : mat) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] mat2 = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };

        System.out.println("Matriz 1 ordenada:");
        imprimirMatriz(diagonalSort(mat1));

        System.out.println("Matriz 2 ordenada:");
        imprimirMatriz(diagonalSort(mat2));
    }
}