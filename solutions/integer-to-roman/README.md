# 012. Integer to Roman

[LeetCode – Integer to Roman](https://leetcode.com/problems/integer-to-roman/)

## Problema

Dado un entero entre 1 y 3999, convertirlo a numeral romano.

## Enfoque

Greedy: recorrer valores de mayor a menor (incluyendo formas sustractivas `CM`, `CD`, `XC`, `XL`, `IX`, `IV`) y restar mientras quepan, acumulando el símbolo correspondiente.

- Tiempo: O(1) — cantidad fija de símbolos
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
