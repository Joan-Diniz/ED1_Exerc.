/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilhadinamica;

/**
 *
 * @author joanp
 */

import java.util.Scanner;
import java.util.Stack;

public class PilhaDinamica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        System.out.println("Digite os valores inteiros (-127 a 128). Digite 0 para finalizar:");

        int valor;
        do {
            valor = scanner.nextInt();
            if (valor != 0) {
                if (valor % 2 == 0) {
                    pilhaPar.push(valor);
                } else {
                    pilhaImpar.push(valor);
                }
            }
        } while (valor != 0);

        System.out.println("Valores na pilha PAR:");
        while (!pilhaPar.isEmpty()) {
            System.out.print(pilhaPar.pop() + " ");
        }

        System.out.println("\nValores na pilha ÍMPAR:");
        while (!pilhaImpar.isEmpty()) {
            System.out.print(pilhaImpar.pop() + " ");
        }
    }
}
