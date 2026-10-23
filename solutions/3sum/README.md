# 015. 3Sum

[LeetCode – 3Sum](https://leetcode.com/problems/3sum/)

## Problema

Dado un array `nums`, devolver todos los triplets `[nums[i], nums[j], nums[k]]` distintos tales que sumen 0 (índices distintos, sin triplets duplicados).

## Enfoque

Ordenar el array. Fijar `nums[i]` y resolver two-sum con punteros `left`/`right` sobre el resto. Saltar duplicados en `i`, `left` y `right`.

- Tiempo: O(n²)
- Espacio: O(1) auxiliar (sin contar la salida)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
