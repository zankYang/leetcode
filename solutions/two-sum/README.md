# 001. Two Sum

[LeetCode – Two Sum](https://leetcode.com/problems/two-sum/)

## Problema

Dado un array de enteros `nums` y un entero `target`, devolver los índices de los dos números que suman `target`.

- Hay exactamente una solución.
- No se puede usar el mismo elemento dos veces.
- El orden de la respuesta no importa.

## Enfoque

HashMap en un solo recorrido: para cada `nums[i]` buscamos si ya vimos el complemento `target - nums[i]`. Si sí, devolvemos ambos índices; si no, guardamos el valor actual con su índice.

- Tiempo: O(n)
- Espacio: O(n)

## Archivos

- `Main.java` — ejemplos locales del enunciado
- `Solution.java`