package com.campus.masacre.decorador;

import com.campus.masacre.core.Arma;
import com.campus.masacre.core.ConsolaUtil;

/**
 * Concrete Decorator: agrega el modificador "golpe crítico" a cualquier
 * arma (o combo) sin alterar su animación ni su narrativa original.
 */
public class ArmaCritica extends ArmaDecorador {

    public ArmaCritica(Arma armaDecorada) {
        super(armaDecorada);
    }

    @Override
    public void ejecutarSecuencia(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.separadorPunteadoRojo();
        System.out.print(ConsolaUtil.ROJO + "| " + ConsolaUtil.AMARILLO);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("[ MODIFICADOR: GOLPE CRITICO ]  Dano x2 sobre " + nombreProfesor, 15);
        System.out.println(ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteadoRojo();
        ConsolaUtil.pausa(300);

        super.ejecutarSecuencia(nombreProfesor);
    }
}
