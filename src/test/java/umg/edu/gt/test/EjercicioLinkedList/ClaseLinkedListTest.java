package umg.edu.gt.test.EjercicioLinkedList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.LinkedList;
import java.util.List; // Importar la clase List
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;

public class ClaseLinkedListTest {
    private static final Logger logger = Logger.getLogger(ClaseLinkedListTest.class.getName());
    private LinkedList<Integer> listaNumeros;
    private LinkedList<String> listaStrings;

    @BeforeEach
    public void setUp() {
        listaNumeros = new LinkedList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        listaStrings = new LinkedList<>(List.of("uno", "dos", "tres", "dos", "uno"));
    }

    @Test
    public void testEliminarDuplicados_Correcto() {
        EjercicioLinkedList.eliminarDuplicados(listaNumeros);
        logger.info("Lista después de eliminar duplicados (correcto): " + listaNumeros);
        assertEquals(List.of(1, 2, 3, 4, 5), listaNumeros); 
    }

    @Test
    public void testEliminarDuplicados_Fallido() {
        EjercicioLinkedList.eliminarDuplicados(listaNumeros);
        logger.info("Lista después de eliminar duplicados (fallido): " + listaNumeros);
        assertEquals(List.of(1, 2, 2, 3, 4, 5), listaNumeros);
    }

    @Test
    public void testInvertirLista_Correcto() {
        EjercicioLinkedList.invertirLista(listaStrings);
        logger.info("Lista después de invertir (correcto): " + listaStrings);
        assertEquals(List.of("uno", "dos", "tres", "dos", "uno"), listaStrings);
    }

    @Test
    public void testInvertirLista_Fallido() {
        EjercicioLinkedList.invertirLista(listaStrings);
        logger.info("Lista después de invertir (fallido): " + listaStrings);
        assertEquals(List.of("uno", "dos", "tres", "uno", "dos"), listaStrings); 
    }

    @Test
    public void testIntercalarListas_Correcto() {
        LinkedList<Integer> lista1 = new LinkedList<>(List.of(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(List.of(2, 4, 6));
        LinkedList<Integer> resultado = EjercicioLinkedList.intercalarListas(lista1, lista2);
        logger.info("Lista intercalada (correcto): " + resultado);
        assertEquals(List.of(1, 2, 3, 4, 5, 6), resultado); 
    }

    @Test
    public void testIntercalarListas_Fallido() {
        LinkedList<Integer> lista1 = new LinkedList<>(List.of(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(List.of(2, 4, 6));
        LinkedList<Integer> resultado = EjercicioLinkedList.intercalarListas(lista1, lista2);
        logger.info("Lista intercalada (fallido): " + resultado);
        assertEquals(List.of(1, 2, 3, 4, 5, 7), resultado); 
    }
}
