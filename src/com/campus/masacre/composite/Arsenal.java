package com.campus.masacre.composite;

import com.campus.masacre.core.Arma;
import com.campus.masacre.core.ConsolaUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite (patrón Composite, estilo Refactoring.Guru). Hereda de
 * {@link Arma} (Component) y mantiene una lista de hijos que pueden ser
 * armas simples (Leaf) u otros arsenales. Al ejecutarse, recorre a sus
 * hijos en orden y delega en cada uno, de modo que cada arma conserva su
 * animación, narrativa y pausas originales.
 */
public class Arsenal extends Arma {

    private final List<Arma> armas = new ArrayList<>();

    public Arsenal() {
        super("Combo de Armas", "Arsenal");
    }

    public void agregar(Arma arma) {
        armas.add(arma);
    }

    public void remover(Arma arma) {
        armas.remove(arma);
    }

    public List<Arma> getArmas() {
        return armas;
    }

    @Override
    public String getNombre() {
        StringBuilder sb = new StringBuilder("Combo: ");
        for (int i = 0; i < armas.size(); i++) {
            if (i > 0) sb.append(" + ");
            sb.append(armas.get(i).getNombre());
        }
        return sb.toString();
    }

    @Override
    public void ejecutarSecuencia(String nombreProfesor) {
        for (int i = 0; i < armas.size(); i++) {
            System.out.println();
            System.out.println(ConsolaUtil.AMARILLO + "[ COMBO " + (i + 1) + "/" + armas.size() + " ]" + ConsolaUtil.RESET);
            armas.get(i).ejecutarSecuencia(nombreProfesor);
        }
    }

    /** No se usa: cada arma hija aporta su propia animación. */
    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[0];
    }

    /** No se usa: cada arma hija aporta su propia narrativa. */
    @Override
    protected String obtenerNarrativaImpacto() {
        return "";
    }
}
