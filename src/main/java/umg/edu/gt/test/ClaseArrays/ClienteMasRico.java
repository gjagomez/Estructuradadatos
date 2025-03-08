/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

/**
 *
 * @author ROG STRIX
 */
public class ClienteMasRico {
    public static int clienteMasRico(int[][] cuentas) {
        int maxRiqueza = 0;

        for (int[] cliente : cuentas) {
            int riquezaActual = 0;
            for (int dinero : cliente) {
                riquezaActual += dinero;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaActual);
        }

        return maxRiqueza;
    }

    public static void main(String[] args) {
        int[][] cuentas1 = {{1,2,3},{3,2,1}};
        int[][] cuentas2 = {{1,5},{7,3},{3,5}};
        int[][] cuentas3 = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(clienteMasRico(cuentas1));
        System.out.println(clienteMasRico(cuentas2));
        System.out.println(clienteMasRico(cuentas3)); 
    }
}
