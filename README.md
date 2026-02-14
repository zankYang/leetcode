# LeetCode — Soluciones y práctica diaria

Repositorio personal de soluciones a problemas de **LeetCode**, con el objetivo de mantener una rutina constante de práctica en algoritmos, estructuras de datos y pensamiento lógico.

---

## Índice

- [Objetivo del repositorio](#objetivo-del-repositorio)
- [Compromiso: un problema al día](#compromiso-un-problema-al-día)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Lenguajes utilizados](#lenguajes-utilizados)
- [Convenciones y formato](#convenciones-y-formato)
- [Cómo usar este repositorio](#cómo-usar-este-repositorio)
- [Recursos y referencias](#recursos-y-referencias)

---

## Objetivo del repositorio

Este proyecto sirve como:

- **Registro** de las soluciones que voy resolviendo en [LeetCode](https://leetcode.com).
- **Práctica deliberada** en patrones clásicos: dos punteros, ventana deslizante, búsqueda binaria, programación dinámica, grafos, árboles, etc.
- **Referencia futura** para repasar enfoques y complejidades (tiempo y espacio) de problemas ya resueltos.
- **Trazabilidad** del progreso y de la constancia (un problema diario cuando sea posible).

No se trata solo de “pasarlos”; el foco está en entender el razonamiento, documentar la idea y, cuando tenga sentido, probar variantes o optimizaciones.

---

## Compromiso: un problema al día

**Meta:** intentar subir **al menos una solución diaria** a este repositorio.

- No siempre será posible por tiempo u otros compromisos, pero la idea es mantener el hábito.
- Se prioriza la **calidad** (entender y explicar la solución) sobre la cantidad.
- Los problemas pueden ser de cualquier dificultad (Fácil, Medio, Difícil) y de cualquier categoría (Arrays, Strings, Trees, DP, etc.).

Este ritmo ayuda a:

- Mantener la mente “caliente” en resolución de problemas.
- Acumular un repertorio de patrones y trucos reutilizables.
- Tener un historial claro de avance en el tiempo.

---

## Estructura del proyecto

```
LeetCode/
├── README.md           # Este archivo
├── Java/               # Soluciones en Java
│   └── ...
├── PHP/                # Soluciones en PHP (si se usan)
├── TypeScript/         # Soluciones en TypeScript (si se usan)
└── scripts/            # Utilidades (ej. deploy, generación de plantillas)
    └── deploy_leetcode.py
```

Cada solución vive en la carpeta del lenguaje correspondiente. Los nombres de archivo suelen incluir el **número del problema** (y opcionalmente un nombre corto) para localizarlos rápido y para que los scripts de despliegue/organización funcionen correctamente.

---

## Lenguajes utilizados

El proyecto está preparado para soluciones en:

| Lenguaje   | Carpeta      | Extensión |
|-----------|--------------|-----------|
| Java      | `Java/`      | `.java`   |
| PHP       | `PHP/`       | `.php`    |
| TypeScript| `TypeScript/`| `.ts`     |

Se irán añadiendo soluciones en uno o varios lenguajes según el problema y el objetivo de práctica (por ejemplo, repasar sintaxis o estructuras de un lenguaje concreto).

---

## Convenciones y formato

- **Nombres de archivo:** se usa un prefijo numérico asociado al problema en LeetCode (ej. `1_TwoSum.java`, `42_TrappingRainWater.java`) para mantener un orden claro y facilitar la búsqueda.
- **Comentarios:** en el código se intenta incluir:
  - Enunciado o enlace al problema.
  - Idea de la solución en una o dos líneas.
  - Complejidad: tiempo y espacio (Big O) cuando sea relevante.
- **Código:** se mantiene legible y con nombres de variables y métodos descriptivos; el objetivo es que sea útil para repasar más adelante.

---

## Cómo usar este repositorio

1. **Navegar:** explora las carpetas por lenguaje y por número de problema.
2. **Estudiar:** abre cualquier solución y lee los comentarios y la implementación para entender el enfoque.
3. **Comparar:** si hay varias soluciones para el mismo problema (por lenguaje o por enfoque), se pueden comparar para ver trade-offs.
4. **Scripts:** en `scripts/` hay utilidades (por ejemplo `deploy_leetcode.py`) para automatizar commits o despliegues de las soluciones; consulta los comentarios dentro de cada script para su uso.

---

## Recursos y referencias

- [LeetCode](https://leetcode.com) — plataforma principal de problemas.
- [LeetCode Patterns](https://seanprashad.com/leetcode-patterns/) y similares — agrupaciones por patrón para estudiar por temas.
- Documentación oficial de algoritmos y estructuras de datos según el lenguaje (Java Collections, etc.) para repasar APIs y mejores prácticas.

---

*Repositorio con fines de práctica y mejora continua. Las soluciones son propias y pueden no ser las únicas ni las más óptimas; sirven como registro de aprendizaje y referencia.*
