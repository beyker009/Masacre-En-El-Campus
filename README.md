# Masacre en el Campus

Simulador narrativo en consola desarrollado en Java (JDK 17+). Permite a los estudiantes seleccionar una materia (Matemáticas, Física o Ingeniería) para instanciar a su profesor y un repertorio temático de 6 armas exclusivas.

En el segundo corte se añade la opción de ejecución personalizada: elegir la ubicación del campus (Biblioteca, Sala de Cómputo, Sala de Profesores o Aula de Clase), encadenar armas en combos y aplicar modificadores (golpe crítico o electrificada).

---

## Arquitectura y Patrones

### Primer Corte (Creacionales)
- **Abstract Factory:** `FabricaMateria` e implementaciones por departamento.
- **Factory Method:** Instanciación de las 18 armas concretas.
- **Builder:** `PartidaBuilder`, `JuegoPartidaBuilder` y `JuegoDirector` para ensamblar la partida.

### Segundo Corte (Estructurales)
- **Decorator:** `ArmaDecorador`, `ArmaCritica` y `ArmaElectrificada` para modificadores dinámicos.
- **Bridge:** `EscenarioJuego` / `EscenarioEjecucion` (abstracción) conectados con `LugarEjecucion` (implementación en las 4 zonas del campus).
- **Composite:** `Arsenal` para agrupar armas y ejecutarlas como combo.

### Clases Utilitarias
- `LectorEntrada`: Captura de datos por consola.
- `ConsolaUtil`: Formato multilínea y colores ANSI.

---

## Estructura del Proyecto

Organizado en los paquetes: `core`, `armas`, `fabricas`, `builder`, `decorador`, `bridge`, `composite` y `cliente` (con `Main.java` como punto de entrada).
