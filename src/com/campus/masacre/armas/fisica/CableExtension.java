package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: un cable de extensión eléctrica de laboratorio. */
public class CableExtension extends Arma {

    public CableExtension() {
        super("Cable de Extensión", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante desconecta del enchufe una extensión eléctrica de calibre grueso...",
            "Avanza sigilosamente por detrás de la silla donde {PROFESOR} califica los laboratorios.",
            "Enrolla los extremos del cable reforzado firmemente alrededor de sus puños."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante pasa el cable de extensión por el cuello de {PROFESOR} y apoya la rodilla en su espalda, "
             + "tirando hacia atrás con toda su fuerza. La presión del hule grueso aplasta la traquea de inmediato; "
             + "los ojos de {PROFESOR} se inyectan en sangre mientras patalea desesperadamente intentando meter los dedos bajo el cable. "
             + "El estudiante sostiene la tensión hasta que se escucha un crujido sordo en las vértebras cervicales "
             + "y el cuerpo del docente se desploma inerte sobre la mesa.";
    }
}
