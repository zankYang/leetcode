# 007. Reverse Integer

[LeetCode – Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Problema

Dado un entero con signo de 32 bits `x`, devolver sus dígitos invertidos. Si el resultado se sale de `[-2³¹, 2³¹ - 1]`, devolver `0`.

## Enfoque

Extraer dígitos con `% 10` y `/ 10`, acumulando en `result`. Antes de `result * 10 + digit`, comprobar overflow para no usar `long`.

- Tiempo: O(log₁₀ |x|)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
