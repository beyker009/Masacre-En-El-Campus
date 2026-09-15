package com.campus.masacre.core;

public final class ConsolaUtil {

    public static final String RESET = "\033[0m";
    public static final String ROJO = "\033[1;31m";
    public static final String VERDE = "\033[1;32m";
    public static final String AMARILLO = "\033[1;33m";
    public static final String AZUL_CYAN = "\033[1;36m";
    public static final String BLANCO_NEGRITA = "\033[1;37m";

    private ConsolaUtil() {}

    public static void limpiarPantallaLogica() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void imprimirConEfectoTipeo(String texto, int milisegundosPorCaracter) {
        imprimirConEfectoTipeoSinNL(texto, milisegundosPorCaracter);
        System.out.println();
    }

    public static void imprimirConEfectoTipeoSinNL(String texto, int milisegundosPorCaracter) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            pausa(milisegundosPorCaracter);
        }
    }

    // Método para formatear texto largo respetando un límite de caracteres por línea
    public static String formatearTextoMultilinea(String texto, int limiteAncho) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        StringBuilder lineaActual = new StringBuilder();

        for (String palabra : palabras) {
            if (lineaActual.length() + palabra.length() + 1 > limiteAncho) {
                resultado.append(lineaActual.toString()).append("\n");
                lineaActual.setLength(0);
            }
            if (lineaActual.length() > 0) {
                lineaActual.append(" ");
            }
            lineaActual.append(palabra);
        }
        if (lineaActual.length() > 0) {
            resultado.append(lineaActual.toString());
        }

        return resultado.toString();
    }

    public static void separador() {
        System.out.println(AZUL_CYAN + "==========================================================================" + RESET);
    }

    public static void separadorPunteado() {
        System.out.println(AZUL_CYAN + "+------------------------------------------------------------------------+" + RESET);
    }

    public static void separadorPunteadoRojo() {
        System.out.println(ROJO + "+------------------------------------------------------------------------+" + RESET);
    }

    public static void separadorDobleRojo() {
        System.out.println(ROJO + "==========================================================================" + RESET);
    }

    public static void separadorDobleRojoAnimado(int velocidad) {
        imprimirConEfectoTipeo(ROJO + "==========================================================================" + RESET, velocidad);
    }
}