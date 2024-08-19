/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaexpressoes;

/**
 *
 * @author joanp
 */

import java.util.Stack;
import java.util.Scanner;


public class VerificaExpressoes {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma expressão matemática: ");
        String expressao = scanner.nextLine();

        if (verificarParametrizacao(expressao)) {
            System.out.println("A expressão está corretamente parametrizada!");
        } else {
            System.out.println("A expressão está incorretamente parametrizada.");
        }
    }

    public static boolean verificarParametrizacao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Não há símbolo de abertura correspondente
                }
                char topo = pilha.pop();
                if (!saoSimbolosCorrespondentes(topo, caractere)) {
                    return false; // Símbolos não correspondem
                }
            }
        }

        return pilha.isEmpty(); // A pilha deve estar vazia no final
    }

    public static boolean saoSimbolosCorrespondentes(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') ||
               (abertura == '[' && fechamento == ']') ||
               (abertura == '{' && fechamento == '}');
    }
}
