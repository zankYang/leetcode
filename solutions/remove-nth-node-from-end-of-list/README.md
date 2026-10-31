# 019. Remove Nth Node From End of List

[LeetCode – Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

## Problema

Dada la cabeza de una lista enlazada, eliminar el n-ésimo nodo desde el final y devolver la nueva cabeza.

## Enfoque

Nodo `dummy` + dos punteros. `fast` avanza `n` pasos; luego `fast` y `slow` avanzan juntos hasta que `fast` llega al último nodo. Entonces `slow.next` es el nodo a borrar. El `dummy` cubre el caso de eliminar la cabeza.

- Tiempo: O(sz)
- Espacio: O(1)

## Archivos

- `ListNode.java`
- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
