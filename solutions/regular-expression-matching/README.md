# 010. Regular Expression Matching

[LeetCode – Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/)

## Problema

Dadas las cadenas `s` y `p`, implementar matching completo donde:

- `'.'` coincide con cualquier carácter
- `'*'` coincide con cero o más del carácter anterior

## Enfoque

DP 2D: `dp[i][j]` indica si `s[0..i)` coincide con `p[0..j)`.

- Si `p[j-1]` es letra o `.`, hereda de `dp[i-1][j-1]` cuando hay match.
- Si es `*`, puede usarse 0 veces (`dp[i][j-2]`) o 1+ veces si el carácter previo coincide (`dp[i-1][j]`).

- Tiempo: O(m · n)
- Espacio: O(m · n)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
