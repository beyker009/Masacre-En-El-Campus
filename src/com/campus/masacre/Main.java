package com.campus.masacre;

import com.campus.masacre.builder.JuegoDirector;
import com.campus.masacre.builder.JuegoPartidaBuilder;
import com.campus.masacre.builder.Partida;
import com.campus.masacre.builder.PartidaBuilder;
import com.campus.masacre.core.ConsolaUtil;
import com.campus.masacre.core.LectorEntrada;
import com.campus.masacre.fabricas.FabricaFisica;
import com.campus.masacre.fabricas.FabricaIngenieria;
import com.campus.masacre.fabricas.FabricaMatematicas;
import com.campus.masacre.fabricas.FabricaMateria;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        mostrarBannerInicio();

        PartidaBuilder builder = new JuegoPartidaBuilder();
        JuegoDirector director = new JuegoDirector(builder);

        boolean continuar = true;
        while (continuar) {
            ConsolaUtil.separadorPunteado();
            System.out.println(" " + ConsolaUtil.VERDE + "[1]" + ConsolaUtil.RESET + " Matemáticas");
            System.out.println(" " + ConsolaUtil.VERDE + "[2]" + ConsolaUtil.RESET + " Física");
            System.out.println(" " + ConsolaUtil.VERDE + "[3]" + ConsolaUtil.RESET + " Ingeniería");
            System.out.println(" " + ConsolaUtil.ROJO + "[0]" + ConsolaUtil.RESET + " Salir");
            ConsolaUtil.separadorPunteado();

            int opcion = LectorEntrada.leerEnteroEnRango("\nElige una opción (0-3): ", 0, 3);
            if (opcion == 0) break;

            FabricaMateria fabrica = switch (opcion) {
                case 1 -> new FabricaMatematicas();
                case 2 -> new FabricaFisica();
                case 3 -> new FabricaIngenieria();
                default -> throw new IllegalStateException("Opción inválida: " + opcion);
            };

            String nombreProfesor = LectorEntrada.leerTextoNoVacio("\nIngresa el nombre del profesor: ");

            Partida partida = switch (opcion) {
                case 1 -> director.makePartidaMatematicas(nombreProfesor, fabrica);
                case 2 -> director.makePartidaFisica(nombreProfesor, fabrica);
                case 3 -> director.makePartidaIngenieria(nombreProfesor, fabrica);
                default -> throw new IllegalStateException("Opción inválida: " + opcion);
            };

            partida.iniciar();

            ConsolaUtil.separadorPunteado();
            int reintento = LectorEntrada.leerEnteroEnRango("¿Deseas ejecutar a otro profesor? (1 = Sí, 0 = No): ", 0, 1);
            ConsolaUtil.separadorPunteado();
            continuar = (reintento == 1);
        }

        finalizar();
    }

    private static void mostrarBannerInicio() {
        ConsolaUtil.limpiarPantallaLogica();
        
        // Velocidades aceleradas para evitar demoras largas
        int speedSeparador = 8; // Trazado ultra rápido para las líneas
        int speedTexto = 15;      // Tipeo ágil para los textos

        // Caja Titular
        ConsolaUtil.separadorDobleRojoAnimado(speedSeparador);
        
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "|                                                                        |" + ConsolaUtil.RESET, speedSeparador);
        
        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "|       " + ConsolaUtil.RESET, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "[ X ]    M A S A C R E   E N   E L   C A M P U S    [ X ]" + ConsolaUtil.RESET, speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "        |" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "|               " + ConsolaUtil.RESET, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.AMARILLO + "-- SIMULACION DE DESAHOGO ACADEMICO --" + ConsolaUtil.RESET, speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "                   |" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "|                                                                        |" + ConsolaUtil.RESET, speedSeparador);
        
        ConsolaUtil.separadorDobleRojoAnimado(speedSeparador);

        // Caja Descriptiva
        ConsolaUtil.separadorDobleRojoAnimado(speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "| " + ConsolaUtil.BLANCO_NEGRITA, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("¿Exámenes imposibles? ¿Notas injustas? ¿Un parcial que te quitó el sueño?", speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + " |" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "| " + ConsolaUtil.RESET, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("Este es tu simulador catártico de desahogo académico: elige la materia,  ", speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "|" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "| " + ConsolaUtil.RESET, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("asigna el nombre de tu profesor y libera la tensión del semestre         ", speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "|" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.imprimirConEfectoTipeoSinNL(ConsolaUtil.ROJO + "| " + ConsolaUtil.RESET, speedSeparador);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("mediante ejecuciones mecánicas y narrativas explícitas.                  ", speedTexto);
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.ROJO + "|" + ConsolaUtil.RESET, speedSeparador);

        ConsolaUtil.separadorDobleRojoAnimado(speedSeparador);
        System.out.println();
    }

    private static void finalizar() {
        System.out.println();
        ConsolaUtil.separadorDobleRojo();
        System.out.println(ConsolaUtil.ROJO + "|       [ X ]   SIMULACION FINALIZADA - SESION CERRADA   [ X ]          |" + ConsolaUtil.RESET);
        ConsolaUtil.separadorDobleRojo();
        LectorEntrada.cerrar();
    }
}   