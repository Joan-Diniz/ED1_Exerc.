/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerc1604;

/**
 *
 * @author Usuário
 */

import java.util.Stack;

public class Exerc1604 {

    public static void main(String[] args) {
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC  E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        System.out.println(inverterPalavras(frase1));
        System.out.println(inverterPalavras(frase2));
    }

    public static String inverterPalavras(String frase) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                pilha.push(frase.charAt(i));
            } else {
                while (!pilha.isEmpty()) {
                    fraseInvertida.append(pilha.pop());
                }
                fraseInvertida.append(' ');
            }
        }

        while (!pilha.isEmpty()) {
            fraseInvertida.append(pilha.pop());
        }

        return fraseInvertida.toString();
    }
    }

