/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_polonesa;

/**
 *
 * @author joanp
 */

import java.util.Stack;


public class Calculadora_Polonesa {

     public static void main(String[] args) {
         
        String expressao = "3+5*2"; // <============ coloque a expressão aqui
        
        
        String tipoNotacao = "infixa"; // especifique o ipo de notação aq : infixa, pos-fixa, pre-fixa
        
        // Avaliar expressão com base no tipo de notação
        double resultado = 0.0;
        String posfixa = "", prefixa = "", infixa = "";
        
        switch (tipoNotacao) {
            case "infixa":
                posfixa = infixaParaPosfixa(expressao);
                prefixa = infixaParaPrefixa(expressao);
                resultado = avaliarPosfixa(posfixa);
                infixa = expressao;
                break;
            case "pos-fixa":
                posfixa = expressao;
                infixa = posfixaParaInfixa(posfixa);
                prefixa = infixaParaPrefixa(infixa);
                resultado = avaliarPosfixa(posfixa);
                break;
            case "pre-fixa":
                prefixa = expressao;
                infixa = prefixaParaInfixa(prefixa);
                posfixa = infixaParaPosfixa(infixa);
                resultado = avaliarPosfixa(posfixa);
                break;
        }

        // Exibir resultados
        System.out.println("Resultado: " + resultado);
        System.out.println("Notação Infixa: " + infixa);
        System.out.println("Notação Pós-fixa: " + posfixa);
        System.out.println("Notação Pré-fixa: " + prefixa);
    }

    // Método para converter notação infixa para pós-fixa
    public static String infixaParaPosfixa(String expressao) {
        StringBuilder resultado = new StringBuilder(); // Resultado final em pós-fixa
        Stack<Character> pilha = new Stack<>(); // Pilha para operadores
        
        // Iterar sobre cada caractere da expressão
        for (char c : expressao.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Se o caractere é operando, adiciona ao resultado
                resultado.append(c);
            } else if (c == '(') {
                // Se o caractere é '(', empilha
                pilha.push(c);
            } else if (c == ')') {
                // Se o caractere é ')', desempilha até encontrar '('
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    resultado.append(pilha.pop());
                }
                if (!pilha.isEmpty() && pilha.peek() != '(') {
                    return "Expressão inválida"; // Expressão inválida
                } else {
                    pilha.pop();
                }
            } else {
                // Se o caractere é um operador
                while (!pilha.isEmpty() && precedencia(c) <= precedencia(pilha.peek())) {
                    resultado.append(pilha.pop());
                }
                pilha.push(c);
            }
        }
        
        // Desempilhar os operadores restantes
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        
        return resultado.toString(); // Retorna a expressão em pós-fixa
    }

    // Método para determinar a precedência dos operadores
    public static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Método para converter notação infixa para pré-fixa
    public static String infixaParaPrefixa(String expressao) {
        StringBuilder resultado = new StringBuilder(); // Resultado final em pré-fixa
        Stack<Character> operadores = new Stack<>(); // Pilha para operadores
        Stack<String> operandos = new Stack<>(); // Pilha para operandos
        
        // Iterar sobre cada caractere da expressão
        for (char c : expressao.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Se o caractere é operando, empilha no stack de operandos
                operandos.push(String.valueOf(c));
            } else if (c == '(') {
                // Se o caractere é '(', empilha no stack de operadores
                operadores.push(c);
            } else if (c == ')') {
                // Se o caractere é ')', desempilha até encontrar '('
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    String operando2 = operandos.pop();
                    String operando1 = operandos.pop();
                    char operador = operadores.pop();
                    String exp = operador + operando1 + operando2; // Cria expressão prefixa
                    operandos.push(exp);
                }
                operadores.pop(); // Remove '(' da pilha
            } else {
                // Se o caractere é um operador
                while (!operadores.isEmpty() && precedencia(c) <= precedencia(operadores.peek())) {
                    String operando2 = operandos.pop();
                    String operando1 = operandos.pop();
                    char operador = operadores.pop();
                    String exp = operador + operando1 + operando2; // Cria expressão prefixa
                    operandos.push(exp);
                }
                operadores.push(c);
            }
        }
        
        // Desempilhar os operadores restantes
        while (!operadores.isEmpty()) {
            String operando2 = operandos.pop();
            String operando1 = operandos.pop();
            char operador = operadores.pop();
            String exp = operador + operando1 + operando2; // Cria expressão prefixa
            operandos.push(exp);
        }
        
        return operandos.pop(); // Retorna a expressão em pré-fixa
    }

    // Método para avaliar expressões pós-fixas
    public static double avaliarPosfixa(String expressao) {
        Stack<Double> pilha = new Stack<>(); // Pilha para avaliação
        
        // Iterar sobre cada caractere da expressão
        for (char c : expressao.toCharArray()) {
            if (Character.isDigit(c)) {
                // Se o caractere é dígito, empilha como número
                pilha.push((double) (c - '0'));
            } else {
                // Se o caractere é um operador, desempilha dois operandos e aplica o operador
                if (pilha.size() < 2) {
                    throw new IllegalArgumentException("Expressão inválida");
                }
                double val2 = pilha.pop();
                double val1 = pilha.pop();
                switch (c) {
                    case '+':
                        pilha.push(val1 + val2);
                        break;
                    case '-':
                        pilha.push(val1 - val2);
                        break;
                    case '*':
                        pilha.push(val1 * val2);
                        break;
                    case '/':
                        pilha.push(val1 / val2);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + c);
                }
            }
        }
        
        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida");
        }
        
        return pilha.pop(); // Retorna o resultado final
    }

    // Método para converter notação pós-fixa para infixa
    public static String posfixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>(); // Pilha para operandos
        
        // Iterar sobre cada caractere da expressão
        for (char c : expressao.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Se o caractere é operando, empilha
                pilha.push(String.valueOf(c));
            } else {
                // Se o caractere é um operador, desempilha dois operandos e aplica o operador
                if (pilha.size() < 2) {
                    throw new IllegalArgumentException("Expressão inválida");
                }
                String operando2 = pilha.pop();
                String operando1 = pilha.pop();
                String exp = "(" + operando1 + c + operando2 + ")"; // Cria expressão infixa
                pilha.push(exp);
            }
        }
        
        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida");
        }
        
        return pilha.pop(); // Retorna a expressão em infixa
    }

    // Método para converter notação pré-fixa para infixa
    public static String prefixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>(); // Pilha para operandos
        
        // Iterar sobre a expressão de trás para frente
        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                // Se o caractere é operando, empilha
                pilha.push(String.valueOf(c));
            } else {
                // Se o caractere é um operador, desempilha dois operandos e aplica o operador
                if (pilha.size() < 2) {
                    throw new IllegalArgumentException("Expressão inválida");
                }
                String operando1 = pilha.pop();
                String operando2 = pilha.pop();
                String exp = "(" + operando1 + c + operando2 + ")"; // Cria expressão infixa
                pilha.push(exp);
            }
        }
        
        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida");
        }
        
        return pilha.pop(); // Retorna a expressão em infixa
    }
}