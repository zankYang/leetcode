# 008. String to Integer (atoi)

[LeetCode – String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/)

## Problema

Implementar `myAtoi(string s)`: convertir una cadena a un entero con signo de 32 bits.

1. Ignorar espacios iniciales.
2. Leer el signo opcional `+` o `-`.
3. Leer dígitos hasta el primer no dígito.
4. Si se sale del rango `[-2³¹, 2³¹ - 1]`, limitar al borde correspondiente.

## Enfoque

Recorrido lineal con chequeo de overflow **antes** de hacer `result * 10 + digit`.

- Tiempo: O(n)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
