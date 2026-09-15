package com.campus.masacre.builder;

import com.campus.masacre.fabricas.FabricaMateria;

public class JuegoPartidaBuilder implements PartidaBuilder {

    private Partida partida;

    public JuegoPartidaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.partida = new Partida();
    }

    @Override
    public void buildProfesor(String nombre, FabricaMateria fabrica) {
        partida.setProfesorActual(fabrica.crearProfesor(nombre));
    }

    @Override
    public void buildArmas(FabricaMateria fabrica) {
        partida.setArmasDisponibles(fabrica.crearArmas());
    }

    @Override
    public Partida getResult() {
        Partida resultado = this.partida;
        reset();
        return resultado;
    }
}