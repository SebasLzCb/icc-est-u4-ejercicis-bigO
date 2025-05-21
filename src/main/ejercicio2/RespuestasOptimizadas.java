package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {

    // 1. Versión optimizada de tieneDuplicados (usa HashSet)
    public static String tieneDuplicadosComplejidad = "O(n)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> vistos = new HashSet<>();
        for (int n : arr) {
            if (vistos.contains(n))
                return true;
            vistos.add(n);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (una sola pasada)
    public static String contarMayoresComplejidad = "O(n)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        for (int n : arr) {
            if (n > x)
                count++;
        }
        return count;
    }

    // 3. Versión optimizada de encontrarMaximo (una sola pasada)
    public static String encontrarMaximoComplejidad = "O(n)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max)
                max = n;
        }
        return max;
    }
}