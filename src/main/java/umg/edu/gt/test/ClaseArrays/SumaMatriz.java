/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

/**
 *
 * @author ROG STRIX
 */
public class SumaMatriz {
    public static int sumarMatriz(int[][] mat) {
        int suma = 0;
        for (int[] fila : mat) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mat2 = {
            {10, 20},
            {30, 40}
        };

        System.out.println(sumarMatriz(mat1)); 
        System.out.println(sumarMatriz(mat2));
    }
}