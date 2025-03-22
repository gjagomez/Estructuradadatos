package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;


import java.util.*;

public class EjercicioLinkedList {
    

    public static void eliminarDuplicados(LinkedList<Integer> lista) {
        Set<Integer> seen = new HashSet<>();
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (!seen.add(num)) {
                iterator.remove();
            }
        }
    }

 
    public static void invertirLista(LinkedList<String> lista) {
        int n = lista.size();
        for (int i = 0; i < n / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(n - i - 1));
            lista.set(n - i - 1, temp);
        }
    }
    
 
    public static LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        Iterator<Integer> it1 = lista1.iterator();
        Iterator<Integer> it2 = lista2.iterator();
        
        Integer num1 = it1.hasNext() ? it1.next() : null;
        Integer num2 = it2.hasNext() ? it2.next() : null;
        
        while (num1 != null || num2 != null) {
            if (num1 == null) {
                resultado.add(num2);
                num2 = it2.hasNext() ? it2.next() : null;
            } else if (num2 == null) {
                resultado.add(num1);
                num1 = it1.hasNext() ? it1.next() : null;
            } else if (num1 <= num2) {
                resultado.add(num1);
                num1 = it1.hasNext() ? it1.next() : null;
            } else {
                resultado.add(num2);
                num2 = it2.hasNext() ? it2.next() : null;
            }
        }
        
        return resultado;
    }


    
}