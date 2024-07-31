/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author joanp
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        // Adicionando 20 pessoas à lista
        for (int i = 1; i <= 20; i++) {
            pessoas.add(new Pessoa("\nNome" + i, "Telefone" + i, "Endereco" + i, "CPF" + i, i));
        }

        JosephusProblem josephusProblem = new JosephusProblem(pessoas);
        Pessoa sobrevivente = josephusProblem.resolverJosephus();
        System.out.println("\nA pessoa sobrevivente é: " + sobrevivente);
    }
}

