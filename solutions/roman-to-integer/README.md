# 013. Roman to Integer

[LeetCode – Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## Problema

Dado un numeral romano válido, convertirlo a entero.

## Enfoque

Recorrer de izquierda a derecha: si el valor actual es menor que el siguiente (casos sustractivos como `IV`, `CM`), se resta; si no, se suma.

- Tiempo: O(n)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
