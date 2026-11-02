# 020. Valid Parentheses

[LeetCode – Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## Problema

Dada una cadena `s` con solo `'('`, `')'`, `'{'`, `'}'`, `'['` y `']'`, determinar si es válida: cada apertura se cierra con el mismo tipo y en el orden correcto.

## Enfoque

Pila: al ver un cierre, el tope debe ser su apertura correspondiente; si no, es inválido. Al terminar, la pila debe quedar vacía.

- Tiempo: O(n)
- Espacio: O(n)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
