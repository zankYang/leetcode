# 009. Palindrome Number

[LeetCode – Palindrome Number](https://leetcode.com/problems/palindrome-number/)

## Problema

Dado un entero `x`, devolver `true` si es un palíndromo y `false` en caso contrario.

## Enfoque

Sin convertir a string: rechazar negativos y números que terminan en `0` (salvo el `0`). Invertir solo la mitad derecha de los dígitos y comparar con la mitad izquierda.

- Tiempo: O(log₁₀ x)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
