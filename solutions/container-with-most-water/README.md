# 011. Container With Most Water

[LeetCode – Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## Problema

Dado un array `height`, cada valor es una línea vertical. Elegir dos líneas que, junto con el eje X, formen el contenedor con más agua.

## Enfoque

Dos punteros en los extremos. En cada paso el área es `min(height[left], height[right]) * (right - left)`. Se mueve el puntero de la pared más baja, porque solo así puede subir la altura y compensar la pérdida de ancho.

- Tiempo: O(n)
- Espacio: O(1)

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
