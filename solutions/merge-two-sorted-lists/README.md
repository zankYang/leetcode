# 021. Merge Two Sorted Lists

[LeetCode – Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

## Problema

Dadas las cabezas de dos listas enlazadas ordenadas, fusionarlas en una sola lista ordenada (reutilizando nodos) y devolver su cabeza.

## Enfoque

Nodo `dummy` + puntero `current`. En cada paso se enlaza el nodo menor entre `list1` y `list2`. Al agotar una lista, se cuelga el resto de la otra.

- Tiempo: O(n + m)
- Espacio: O(1)

## Archivos

- `ListNode.java`
- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
