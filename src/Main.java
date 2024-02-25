import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("jardín", "garden");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("arbol", "tree");
        diccionario.put("amarillo", "yellow");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("manzana", "apple");
        diccionario.put("pelota", "ball");
        diccionario.put("carro", "car");
        diccionario.put("nube", "cloud");
        diccionario.put("amigo", "friend");

        String[] palabrasAleatorias = obtenerPalabrasAleatorias(diccionario, 5);

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Traduce las siguientes palabras al inglés:");

        for (String palabra : palabrasAleatorias) {
            System.out.print(palabra + ": ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            if (diccionario.get(palabra).equalsIgnoreCase(respuestaUsuario)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    private static String[] obtenerPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAleatorias = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(palabras.length);
            palabrasAleatorias[i] = palabras[indiceAleatorio];
        }

        return palabrasAleatorias;
    }
}