package com.campus.masacre.decorador;

import com.campus.masacre.core.Arma;

/**
 * Base Decorator (patrón Decorator, estilo Refactoring.Guru). Extiende de
 * {@link Arma} (Component) y mantiene una referencia al objeto envuelto
 * (wrappee), al que delega todo el trabajo. Los decoradores concretos
 * sobrescriben {@link #ejecutarSecuencia(String)} para agregar su
 * comportamiento antes o después de delegar.
 */
public abstract class ArmaDecorador extends Arma {

    protected Arma armaDecorada;

    public ArmaDecorador(Arma armaDecorada) {
        super(armaDecorada.getNombre(), armaDecorada.getAreaAcademica());
        this.armaDecorada = armaDecorada;
    }

    @Override
    public void ejecutarSecuencia(String nombreProfesor) {
        armaDecorada.ejecutarSecuencia(nombreProfesor);
    }

    /** No se usa: la animación completa la aporta el arma decorada. */
    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[0];
    }

    /** No se usa: la narrativa completa la aporta el arma decorada. */
    @Override
    protected String obtenerNarrativaImpacto() {
        return "";
    }
}
