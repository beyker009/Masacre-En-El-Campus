package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: un ventilador de pedestal industrial. */
public class VentiladorPedestal extends Arma {

    public VentiladorPedestal() {
        super("Ventilador de Pedestal", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante retira la rejilla protectora del ventilador de pedestal industrial...",
            "Lo conecta a la toma de corriente y ajusta el motor a la máxima velocidad rotatoria.",
            "Empuja la base con ruedas hacia el escritorio donde {PROFESOR} se encuentra sentado."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante agarra a {PROFESOR} del cabello y proyecta su rostro de frente contra las aspas metálicas en movimiento. "
             + "Las hlices cercenan la piel, rompen los huesos faciales y destrozan la cavidad ocular en milisegundos, "
             + "salpicando tejido y sangre por todo el suelo del aula hasta que el cuerpo inerte cae desplomado.";
    }
}
