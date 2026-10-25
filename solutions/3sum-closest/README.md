# 016. 3Sum Closest

[LeetCode – 3Sum Closest](https://leetcode.com/problems/3sum-closest/)

## Problema

Dado un array `nums` y un entero `target`, encontrar tres enteros cuya suma sea lo más cercana posible a `target`. Devolver esa suma (hay exactamente una solución).

## Enfoque

Ordenar el array. Fijar `nums[i]` y recorrer el resto con punteros `left`/`right`. Mantener la suma más cercana a `target`; si la suma actual es menor, avanzar `left`; si es mayor, retroceder `right`; si coincide, devolver inmediatamente.

- Tiempo: O(n²)
- Espacio: O(1) auxiliar (sin contar el coste del sort)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
