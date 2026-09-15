package com.campus.masacre.builder;

import com.campus.masacre.fabricas.FabricaMateria;

/**
 * Interfaz Builder (patrón Builder, estilo Refactoring.Guru). Declara los
 * pasos de construcción comunes para ensamblar una {@link Partida} por
 * partes, independientemente de la fábrica temática (Abstract Factory) que
 * se use para proveer al profesor y al arsenal.
 */
public interface PartidaBuilder {

    /** Reinicia el builder, descartando cualquier construcción parcial previa. */
    void reset();

    /**
     * Construye la parte "profesor" de la partida, delegando en la fábrica
     * concreta recibida.
     *
     * @param nombre  nombre personalizado ingresado por el usuario
     * @param fabrica fábrica concreta (Abstract Factory) del área académica elegida
     */
    void buildProfesor(String nombre, FabricaMateria fabrica);

    /**
     * Construye la parte "arsenal de armas" de la partida, delegando en la
     * fábrica concreta recibida.
     *
     * @param fabrica fábrica concreta (Abstract Factory) del área académica elegida
     */
    void buildArmas(FabricaMateria fabrica);

    /**
     * Entrega el producto final ensamblado.
     *
     * @return la {@link Partida} completamente construida
     */
    Partida getResult();
}
