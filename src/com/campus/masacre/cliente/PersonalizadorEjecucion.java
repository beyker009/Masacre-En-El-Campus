package com.campus.masacre.cliente;

import com.campus.masacre.bridge.EscenarioEjecucion;
import com.campus.masacre.composite.Arsenal;
import com.campus.masacre.core.Arma;
import com.campus.masacre.core.ConsolaUtil;
import com.campus.masacre.core.LectorEntrada;
import com.campus.masacre.decorador.ArmaCritica;
import com.campus.masacre.decorador.ArmaElectrificada;

/**
 * Código cliente de los tres patrones estructurales. Dado el arma elegida
 * en el arsenal, pregunta al usuario si desea encadenar más armas (Composite)
 * y aplicar modificadores (Decorator), y ejecuta el resultado dentro del
 * escenario elegido (Bridge). No modifica ninguna clase de armas.
 */
public class PersonalizadorEjecucion {

    private final EscenarioEjecucion escenario;

    public PersonalizadorEjecucion(EscenarioEjecucion escenario) {
        this.escenario = escenario;
    }

    public void ejecutar(Arma armaElegida, Arma[] disponibles, String nombreProfesor) {
        Arma arma = armaElegida;

        // Composite: combo de armas
        int combo = LectorEntrada.leerEnteroEnRango("\n¿Encadenar más armas en un combo? (1 = Sí, 0 = No): ", 0, 1);
        if (combo == 1) {
            Arsenal arsenal = new Arsenal();
            arsenal.agregar(armaElegida);
            boolean agregando = true;
            while (agregando) {
                System.out.println("\n--- COMBO ACTUAL: " + arsenal.getNombre() + " ---");
                for (int i = 0; i < disponibles.length; i++) {
                    System.out.println(" " + ConsolaUtil.VERDE + "[" + (i + 1) + "]" + ConsolaUtil.RESET + " " + disponibles[i].getNombre());
                }
                int terminar = disponibles.length + 1;
                System.out.println(" " + ConsolaUtil.ROJO + "[" + terminar + "]" + ConsolaUtil.RESET + " Terminar combo\n");
                int sel = LectorEntrada.leerEnteroEnRango("Agregar arma al combo (1-" + terminar + "): ", 1, terminar);
                if (sel == terminar) {
                    agregando = false;
                } else {
                    arsenal.agregar(disponibles[sel - 1]);
                }
            }
            arma = arsenal;
        }

        // Decorator: modificadores
        System.out.println("\n--- MODIFICADOR ---");
        System.out.println(" " + ConsolaUtil.VERDE + "[1]" + ConsolaUtil.RESET + " Golpe crítico");
        System.out.println(" " + ConsolaUtil.VERDE + "[2]" + ConsolaUtil.RESET + " Electrificada");
        System.out.println(" " + ConsolaUtil.VERDE + "[3]" + ConsolaUtil.RESET + " Ambos");
        System.out.println(" " + ConsolaUtil.ROJO + "[0]" + ConsolaUtil.RESET + " Ninguno\n");
        int mod = LectorEntrada.leerEnteroEnRango("Elige un modificador (0-3): ", 0, 3);
        if (mod == 2 || mod == 3) arma = new ArmaElectrificada(arma);
        if (mod == 1 || mod == 3) arma = new ArmaCritica(arma);

        // Bridge: ejecución dentro del escenario elegido
        escenario.ejecutar(arma, nombreProfesor);
    }
}
