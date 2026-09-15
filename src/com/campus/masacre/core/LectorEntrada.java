package com.campus.masacre.core;

import java.util.Scanner;

public final class LectorEntrada {

    private static final Scanner scanner = new Scanner(System.in);

    private LectorEntrada() {}

    public static void esperarEnter() {
        scanner.nextLine();
    }

    public static String leerTextoNoVacio(String mensaje) {
        String entrada = "";
        while (entrada.trim().isEmpty()) {
            System.out.print(mensaje);
            entrada = scanner.nextLine();
        }
        return entrada.trim();
    }

    public static int leerEnteroEnRango(String mensaje, int minimo, int maximo) {
        int valor = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= minimo && valor <= maximo) {
                    valido = true;
                } else {
                    System.out.println(ConsolaUtil.ROJO + "[X] Opción fuera de rango (" + minimo + " - " + maximo + ")." + ConsolaUtil.RESET);
                }
            } catch (NumberFormatException e) {
                System.out.println(ConsolaUtil.ROJO + "[X] Ingresa un número entero válido." + ConsolaUtil.RESET);
            }
        }
        return valor;
    }

    public static void cerrar() {
        scanner.close();
    }
}