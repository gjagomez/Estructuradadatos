package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioArrays {
    
    
public class Ejercicio1 {
    public static int maxWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        
        return maxWealth;
    }
}


public class Ejercicio2 {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        for (int col = 0; col < n; col++) {
            sortDiagonal(mat, 0, col, m, n);
        }
        
        for (int row = 1; row < m; row++) {
            sortDiagonal(mat, row, 0, m, n);
        }
        
        return mat;
    }
    
    private static void sortDiagonal(int[][] mat, int row, int col, int m, int n) {
        ArrayList<Integer> diagonal = new ArrayList<>();
       
        int r = row, c = col;
        while (r < m && c < n) {
            diagonal.add(mat[r][c]);
            r++;
            c++;
        }
        
        Collections.sort(diagonal);
        
   
        r = row;
        c = col;
        int index = 0;
        while (r < m && c < n) {
            mat[r][c] = diagonal.get(index++);
            r++;
            c++;
        }
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

public class Ejercicio3 {
    public static int matrixSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{10, 20}, {30, 40}};
        
        System.out.println(matrixSum(mat1)); 
        System.out.println(matrixSum(mat2)); 
    }
} 
}
