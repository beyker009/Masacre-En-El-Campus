# 🎮 Masacre en el Campus - Simulador Narrativo de Consola

**Asignatura:** Construcción de Software (Quinto Semestre)  
**Institución:** Institución Universitaria Colegio Mayor del Cauca  
**Integrantes:** Juan Diego Borja Valdés | Beyker Cerón Montilla  
**Presentado a:** Marta Cecilia Camacho Ojeda  

---

## 🛠️ Descripción del Proyecto
Simulador narrativo interactivo desarrollado en **Java (JDK 17+)** para la terminal de comandos. Permite a los estudiantes canalizar el estrés académico seleccionando una materia (Matemáticas, Física o Ingeniería) para instanciar dinámicamente a su profesor y un repertorio temático de 6 armas exclusivas con animaciones en consola.

---

## 🏗️ Arquitectura y Patrones Implementados

- **Abstract Factory:** Interfaz `FabricaMateria` e implementaciones concretas por departamento para generar familias de objetos coherentes.
- **Factory Method:** Método de instanciación encapsulado en cada fábrica para la creación de las 18 armas concretas.
- **Builder:** Estructura compuesta por `PartidaBuilder`, `JuegoPartidaBuilder` y el orquestador `JuegoDirector` para ensamblar el objeto `Partida`.
- **Principios SOLID:** Cumplimiento estricto de **SRP**, **LSP**, **ISP** y **DIP**. Infracción justificada al principio **OCP** en los bloques `switch/case` internos de creación.
- **Clases Utilitarias:** `LectorEntrada` (captura defensiva estática) y `ConsolaUtil` (colores ANSI y formateo multilínea).

---

## 🚀 Ejecución
