package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EjercicioArrays {
 private static final Logger logger = LogManager.getLogger(EjercicioArrays.class);
 public class Ejercicio1 {
        private static final Logger logger = LogManager.getLogger(Ejercicio1.class);
        
        public static int maxWealth(int[][] accounts) {
            logger.info("Iniciando cálculo de riqueza máxima");
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
            
            logger.info("La riqueza máxima calculada es: {}", maxWealth);
            return maxWealth;
        }
    }
    
    public class Ejercicio2 {
        private static final Logger logger = LogManager.getLogger(Ejercicio2.class);
        
        public static int[][] diagonalSort(int[][] mat) {
            logger.info("Iniciando ordenamiento diagonal de matriz");
            int m = mat.length;
            int n = mat[0].length;
            
            for (int col = 0; col < n; col++) {
                sortDiagonal(mat, 0, col, m, n);
            }
            
            for (int row = 1; row < m; row++) {
                sortDiagonal(mat, row, 0, m, n);
            }
            
            logger.info("Ordenamiento diagonal completado");
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
            logger.info("Matriz resultante:");
            for (int[] row : mat) {
                StringBuilder rowStr = new StringBuilder();
                for (int num : row) {
                    rowStr.append(num).append(" ");
                }
                logger.info(rowStr.toString());
            }
        }
    }
    
    public class Ejercicio3 {
        // Logger específico para Ejercicio3
        private static final Logger logger = LogManager.getLogger(Ejercicio3.class);
        
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
            
            int sum1 = matrixSum(mat1);
            logger.info("La suma de la matriz 1 es: {}", sum1);
            
            int sum2 = matrixSum(mat2);
            logger.info("La suma de la matriz 2 es: {}", sum2);
            
            // Ejemplo de log de error
            try {
                // Simulación de error
                int[][] matrizNull = null;
                matrixSum(matrizNull);
            } catch (Exception e) {
                logger.error("Ocurrió un error inesperado", e);
            }
        }
    } 
}
