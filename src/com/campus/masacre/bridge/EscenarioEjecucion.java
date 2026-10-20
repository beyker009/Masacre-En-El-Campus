package com.campus.masacre.bridge;

import com.campus.masacre.core.Arma;

/**
 * Refined Abstraction (patrón Bridge). Extiende el control básico de
 * {@link EscenarioJuego} con la escena completa: combina el entorno del
 * lugar con la acción del arma, sin modificar la clase {@link Arma}.
 */
public class EscenarioEjecucion extends EscenarioJuego {

    public EscenarioEjecucion(LugarEjecucion lugar) {
        super(lugar);
    }

    /**
     * Ejecuta la escena completa: ambiente del lugar, secuencia original
     * del arma (animación, narrativa y pausas intactas) y efecto del entorno.
     *
     * @param arma           arma (simple, decorada o combo) a utilizar
     * @param nombreProfesor nombre del profesor objetivo
     */
    public void ejecutar(Arma arma, String nombreProfesor) {
        abrirEscena();
        arma.ejecutarSecuencia(nombreProfesor);
        cerrarEscena(nombreProfesor);
    }
}
