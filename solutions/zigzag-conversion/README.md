# 006. Zigzag Conversion

[LeetCode – Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## Problema

Escribir la cadena `s` en patrón zigzag con `numRows` filas y devolver el texto leído fila por fila.

## Enfoque

Simular el recorrido: un `StringBuilder` por fila y una dirección que baja/sube. Al llegar al borde superior o inferior se invierte la dirección. Al final se concatenan las filas.

- Tiempo: O(n)
- Espacio: O(n)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
