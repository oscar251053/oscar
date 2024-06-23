package com.ar.codoacodo;

public class FuncionesSimples {
    // Función que suma dos números enteros y devuelve el resultado
    public static int sumar(int a, int b) {
        // Se suma a y b y se devuelve el resultado
        return a + b;
    }

    // Función que multiplica dos números enteros y devuelve el resultado
    public static int multiplicar(int a, int b) {
        // Se multiplica a y b y se devuelve el resultado
        return a * b;
    }

    // Función que verifica si un número es par o impar y devuelve un booleano
    public static boolean esPar(int numero) {
        // Se verifica si el número es divisible por 2
        // Si es divisible, devuelve true (es par), de lo contrario, devuelve false (es impar)
        return numero % 2 == 0;
    }

    // Función que imprime un mensaje por pantalla
    public static void imprimirMensaje(String mensaje) {
        // Imprime el mensaje recibido por parámetro
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        // Ejemplos de llamadas a las funciones

        // Llamar a la función sumar y guardar el resultado en una variable
        int resultadoSuma = sumar(5, 3);
        // Imprimir el resultado de la suma
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Llamar a la función multiplicar y guardar el resultado en una variable
        int resultadoMultiplicacion = multiplicar(4, 7);
        // Imprimir el resultado de la multiplicación
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        // Llamar a la función esPar y guardar el resultado en una variable
        boolean esPar = esPar(10);
        // Imprimir si el número es par o no
        System.out.println("¿Es 10 par? " + esPar);

        // Llamar a la función imprimirMensaje
        imprimirMensaje("¡Hola, mundo!");
    }
}