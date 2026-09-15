package com.campus.masacre.builder;

import com.campus.masacre.fabricas.FabricaMateria;

/**
 * Director del patrón Builder. Conoce la secuencia de pasos necesaria para
 * ensamblar una {@link Partida} completa, pero delega la construcción real
 * de cada parte en el {@link PartidaBuilder} inyectado.
 *
 * <p>Expone un método de orquestación por cada área académica soportada
 * (Matemáticas, Física, Ingeniería). Los tres siguen la misma secuencia de
 * construcción; se mantienen como métodos independientes para reflejar
 * fielmente el diagrama UML acordado con el equipo.</p>
 */
public class JuegoDirector {

    private PartidaBuilder builder;

    /**
     * Crea el director asociado a un builder concreto.
     *
     * @param builder implementación de {@link PartidaBuilder} a utilizar
     */
    public JuegoDirector(PartidaBuilder builder) {
        this.builder = builder;
    }

    /**
     * Permite reemplazar el builder activo en tiempo de ejecución
     * (por ejemplo, para intercambiar la estrategia de construcción).
     *
     * @param builder nueva implementación de {@link PartidaBuilder}
     */
    public void setBuilder(PartidaBuilder builder) {
        this.builder = builder;
    }

    /**
     * Orquesta la construcción de una partida del departamento de Física.
     *
     * @param nombreProfesor nombre personalizado del profesor
     * @param fabrica        fábrica concreta de Física (Abstract Factory)
     * @return partida completamente construida y lista para {@code iniciar()}
     */
    public Partida makePartidaFisica(String nombreProfesor, FabricaMateria fabrica) {
        return construirPartida(nombreProfesor, fabrica);
    }

    /**
     * Orquesta la construcción de una partida del departamento de Ingeniería.
     *
     * @param nombreProfesor nombre personalizado del profesor
     * @param fabrica        fábrica concreta de Ingeniería (Abstract Factory)
     * @return partida completamente construida y lista para {@code iniciar()}
     */
    public Partida makePartidaIngenieria(String nombreProfesor, FabricaMateria fabrica) {
        return construirPartida(nombreProfesor, fabrica);
    }

    /**
     * Orquesta la construcción de una partida del departamento de Matemáticas.
     *
     * @param nombreProfesor nombre personalizado del profesor
     * @param fabrica        fábrica concreta de Matemáticas (Abstract Factory)
     * @return partida completamente construida y lista para {@code iniciar()}
     */
    public Partida makePartidaMatematicas(String nombreProfesor, FabricaMateria fabrica) {
        return construirPartida(nombreProfesor, fabrica);
    }

    /**
     * Secuencia común de construcción (reset → profesor → armas → resultado),
     * compartida por los tres métodos públicos de orquestación para evitar
     * duplicación de código (DRY) sin alterar la firma de cada uno.
     *
     * @param nombreProfesor nombre personalizado del profesor
     * @param fabrica        fábrica concreta del área académica elegida
     * @return partida completamente construida
     */
    private Partida construirPartida(String nombreProfesor, FabricaMateria fabrica) {
        builder.reset();
        builder.buildProfesor(nombreProfesor, fabrica);
        builder.buildArmas(fabrica);
        return builder.getResult();
    }
}
