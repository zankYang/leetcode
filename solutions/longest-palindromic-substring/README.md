# 005. Longest Palindromic Substring

[LeetCode – Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

## Problema

Dada una cadena `s`, devolver la subcadena palindrómica más larga.

## Enfoque

Expandir desde el centro: para cada índice `i`, probar centro impar `(i, i)` y centro par `(i, i + 1)`, expandiendo mientras los caracteres coincidan. Conservar el palíndromo más largo encontrado.

- Tiempo: O(n²)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
