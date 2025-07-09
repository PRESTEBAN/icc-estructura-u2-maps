package controllers;

import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> 9f7fea1 (ejercicios)

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not implemented yet");

=======
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> caracterContador = new HashMap<>();

        for (char c : str1.toCharArray()) {
              if (caracterContador.containsKey(c)) {
                caracterContador.put(c, caracterContador.get(c) + 1);
            } else {
                caracterContador.put(c, 1);
            }
        }

         for (char c : str2.toCharArray()) {
            if (!caracterContador.containsKey(c)) {
                return false;
            }
            caracterContador.put(c, caracterContador.get(c) - 1);
            if (caracterContador.get(c) < 0) {
                return false;
            }
        }

          for (int valor :  caracterContador.values()) {
            if (valor != 0) {
                return false;
            }
        }
          return true;
>>>>>>> 9f7fea1 (ejercicios)
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not implemented yet");
=======
         Map<Integer, Integer> mapa = new HashMap<>();

           for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(nums[i], i);
        }

          return null;
>>>>>>> 9f7fea1 (ejercicios)
    }

    /**
     * Cuenta la frecuencia de cada caracter en la cadena recibida y
     * muestra el resultado por consola.
     *
     * Ejemplo:
     * Input: "hola"
     * Output: {h=1, o=1, l=1, a=1}
     */
    public void contarCaracteres(String texto) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not implemented yet");
=======
          Map<Character, Integer> frecuencias = new HashMap<>();

            for (char c : texto.toCharArray()) {
            if (frecuencias.containsKey(c)) {
                frecuencias.put(c, frecuencias.get(c) + 1);
            } else {
                frecuencias.put(c, 1);
            }
        }
         System.out.println(frecuencias);
>>>>>>> 9f7fea1 (ejercicios)
    }

    /**
     * Verifica si dos palabras son anagramas.
     * Deben contener las mismas letras con la misma frecuencia.
     *
     * Ejemplo:
     * Input: palabra1 = "roma", palabra2 = "amor"
     * Output: true
     */
    public boolean sonAnagramas(String palabra1, String palabra2) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not implemented yet");
=======

         if (palabra1.length() != palabra2.length()) {
            return false;
        }

        Map<Character, Integer> contador = new HashMap<>();

        for (char c : palabra1.toCharArray()) {
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }

         for (char c : palabra2.toCharArray()) {
            if (!contador.containsKey(c)) {
                return false;
            }
            contador.put(c, contador.get(c) - 1);
            if (contador.get(c) < 0) {
                return false;
            }
        }

        return true;
>>>>>>> 9f7fea1 (ejercicios)
    }
}
