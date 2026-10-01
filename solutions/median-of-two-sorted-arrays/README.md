# 004. Median of Two Sorted Arrays

[LeetCode – Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## Problema

Dados dos arrays ordenados `nums1` y `nums2`, devolver la mediana del array combinado. La complejidad debe ser `O(log(m + n))`.

## Enfoque

Búsqueda binaria sobre el array más corto para encontrar una partición válida: la mitad izquierda tiene `(m + n + 1) / 2` elementos y `max(izquierda) <= min(derecha)`. Si el total es impar, la mediana es el máximo de la izquierda; si es par, el promedio de ese máximo y el mínimo de la derecha.

- Tiempo: O(log(min(m, n)))
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
