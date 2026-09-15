package com.campus.masacre.core;

public abstract class Arma {

    protected String nombre;
    protected String areaAcademica;

    public Arma(String nombre, String areaAcademica) {
        this.nombre = nombre;
        this.areaAcademica = areaAcademica;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAreaAcademica() {
        return areaAcademica;
    }

    protected abstract String[] obtenerLineasAnimacion();
    protected abstract String obtenerNarrativaImpacto();

    public void ejecutarSecuencia(String nombreProfesor) {
        ConsolaUtil.separador();
        System.out.println(ConsolaUtil.BLANCO_NEGRITA + "ARMA SELECCIONADA: " + nombre.toUpperCase() 
                + " [" + areaAcademica + "]" + ConsolaUtil.RESET);
        ConsolaUtil.separador();
        
        ConsolaUtil.pausa(200);

        // 1. Preparación alineada a 15ms por carácter y pausas breves
        String[] animacion = obtenerLineasAnimacion();
        for (String linea : animacion) {
            String lineaProcesada = linea.replace("{PROFESOR}", nombreProfesor);
            String lineaFormateada = ConsolaUtil.formatearTextoMultilinea(lineaProcesada, 84);
            ConsolaUtil.imprimirConEfectoTipeo(lineaFormateada, 27);
            ConsolaUtil.pausa(100);
        }

        ConsolaUtil.pausa(400);

        // 2. Muerte / Impacto igualado a 15ms por carácter (en ROJO)
        String impactoProcesado = obtenerNarrativaImpacto().replace("{PROFESOR}", nombreProfesor);
        String impactoFormateado = ConsolaUtil.formatearTextoMultilinea(impactoProcesado, 84);

        System.out.print(ConsolaUtil.ROJO + "\n");
        ConsolaUtil.imprimirConEfectoTipeo(impactoFormateado, 27);
        System.out.print(ConsolaUtil.RESET);

        ConsolaUtil.pausa(800);

        // 3. Cuadro de Ejecución Completada
        System.out.println();
        ConsolaUtil.separadorPunteadoRojo();
        ConsolaUtil.pausa(100);

        System.out.print(ConsolaUtil.ROJO + "| " + ConsolaUtil.BLANCO_NEGRITA);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("[ EJECUCION COMPLETADA CON EXITO ]", 15);
        System.out.println(ConsolaUtil.ROJO + "                                     |" + ConsolaUtil.RESET);
        ConsolaUtil.pausa(100);

        System.out.print(ConsolaUtil.ROJO + "| " + ConsolaUtil.AMARILLO);
        ConsolaUtil.imprimirConEfectoTipeoSinNL("+100 pts de desahogo academico", 15);
        System.out.println(ConsolaUtil.ROJO + "                                       |" + ConsolaUtil.RESET);
        ConsolaUtil.pausa(100);

        ConsolaUtil.separadorPunteadoRojo();

        ConsolaUtil.pausa(300);
        System.out.println("\n[Presione ENTER para continuar]");
        LectorEntrada.esperarEnter();
    }
}