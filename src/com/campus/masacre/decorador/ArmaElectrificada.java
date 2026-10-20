package com.campus.masacre.decorador;

import com.campus.masacre.core.Arma;
import com.campus.masacre.core.ConsolaUtil;

/**
 * Concrete Decorator: agrega el modificador "electrificada" a cualquier
 * arma (o combo) sin alterar su animación ni su narrativa original.
 */
public class ArmaElectrificada extends ArmaDecorador {

    public ArmaElectrificada(Arma armaDecorada) {
        super(armaDecorada);
    }

    @Override
    public void ejecutarSecuencia(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.print(ConsolaUtil.AZUL_CYAN + "| " + ConsolaUtil.BLANCO_NEGRITA);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("[ MODIFICADOR: ELECTRIFICADA ]  Chispas azules recorren el arma", 15);
        System.out.println(ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();
        ConsolaUtil.pausa(300);

        super.ejecutarSecuencia(nombreProfesor);
    }
}
