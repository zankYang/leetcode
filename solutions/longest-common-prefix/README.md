# 014. Longest Common Prefix

[LeetCode – Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

## Problema

Dado un array de strings, encontrar el prefijo común más largo. Si no hay ninguno, devolver `""`.

## Enfoque

Escaneo vertical: usar la primera cadena como referencia y comparar carácter a carácter con el resto. Al primer desajuste (o fin de alguna cadena), devolver el prefijo acumulado.

- Tiempo: O(n · m) — n cadenas, m longitud del prefijo
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
