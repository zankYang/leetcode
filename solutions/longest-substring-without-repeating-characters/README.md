# 003. Longest Substring Without Repeating Characters

[LeetCode – Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Problema

Dada una cadena `s`, encontrar la longitud de la subcadena más larga sin caracteres repetidos.

## Enfoque

Ventana deslizante con `HashMap` del último índice visto de cada carácter. Al expandir `right`, si el carácter ya aparece dentro de la ventana, se mueve `left` justo después de esa ocurrencia.

- Tiempo: O(n)
- Espacio: O(min(n, alfabeto))

## Archivos

- `Solution.java`
- `Main.java` — ejemplos locales del enunciado
