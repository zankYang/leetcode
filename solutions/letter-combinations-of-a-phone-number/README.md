# 017. Letter Combinations of a Phone Number

[LeetCode – Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

## Problema

Dada una cadena `digits` con dígitos de `2` a `9`, devolver todas las combinaciones de letras que ese número podría representar según el teclado telefónico (en cualquier orden).

## Enfoque

Backtracking: en cada posición del dígito se elige una letra del mapeo del teclado, se añade al camino y se continúa. Al llegar al final se guarda la combinación y se deshace el último carácter.

- Tiempo: O(4ⁿ · n) — peor caso, dígitos con 4 letras
- Espacio: O(n) auxiliar por la profundidad de la recursión (sin contar la salida)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
