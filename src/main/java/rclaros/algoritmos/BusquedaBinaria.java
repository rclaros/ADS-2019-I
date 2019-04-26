package rclaros.algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rclaros
 */
public class BusquedaBinaria {

    private static int count = 0;

    public static void main(String[] args) {
        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i <= 5000000; i++) {
            valueList.add(i);
        }
        int NEEDLE = 5000000;
        System.out.println("Tamaño de lista : " + (valueList.size() - 1));
        System.out.println("Encontrar el Nro. " + NEEDLE);
        try {
            System.out.println("=========================================================");
            Integer position = busqueda_binaria(valueList, NEEDLE, 0, valueList.size() - 1);
            System.out.println("=========================================================");
            System.out.println(position == null ? "No encontrado" : "Encontrado en la posición : " + position);
            System.out.println("Iteraciones : " + (count - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer busqueda_binaria(List<Integer> valueList, int needle, int min, int max) throws Exception {
        System.out.println("Iteracción : " + count);
        System.out.println("      => Nro. Mínimo : (" + valueList.get(min) + ") < Nro. Objetivo : " + needle + " > Nro. Máximo: (" + valueList.get(max) + ")");
        count++;
        int midpoint = (max + min) / 2;
        if (valueList.size() > 0 && valueList.get(midpoint) == needle) {
            return midpoint;
        }
        if (min >= max) {
            return null;
        }
        if (valueList.get(midpoint) > needle) {
            return busqueda_binaria(valueList, needle, min, midpoint - 1);
        }
        return busqueda_binaria(valueList, needle, midpoint + 1, max);
    }
}
