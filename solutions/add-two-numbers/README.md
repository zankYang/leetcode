# 002. Add Two Numbers

[LeetCode – Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Problema

Dos listas enlazadas representan enteros no negativos. Los dígitos están en **orden inverso** (un dígito por nodo). Sumar ambos números y devolver el resultado como lista en el mismo formato.

## Enfoque

Recorrer ambas listas en paralelo: en cada paso sumar los dígitos actuales más el `carry`, crear un nodo con `sum % 10` y actualizar `carry = sum / 10`. Continuar mientras queden nodos o carry.

- Tiempo: O(max(m, n))
- Espacio: O(max(m, n))

## Archivos

- `Solution.java`
- `ListNode.java` — definición de nodo (solo para pruebas locales)
- `Main.java` — ejemplos locales del enunciado

