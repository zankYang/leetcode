# 018. 4Sum

[LeetCode – 4Sum](https://leetcode.com/problems/4sum/)

## Problema

Dado un array `nums` y un entero `target`, devolver todos los cuadrupletes únicos `[nums[a], nums[b], nums[c], nums[d]]` con índices distintos cuya suma sea `target`.

## Enfoque

Ordenar el array. Fijar dos índices `i` y `j`, y resolver two-sum con punteros `left`/`right` sobre el resto. Saltar duplicados en cada nivel. Usar `long` en la suma para evitar overflow.

- Tiempo: O(n³)
- Espacio: O(1) auxiliar (sin contar la salida)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
