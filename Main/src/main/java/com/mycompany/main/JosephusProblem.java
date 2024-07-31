/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author joanp
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JosephusProblem {
    private List<Pessoa> pessoas;
    private Random random;

    public JosephusProblem(List<Pessoa> pessoas) {
        this.pessoas = new ArrayList<>(pessoas);
        this.random = new Random();
    }

    public Pessoa resolverJosephus() {
        int index = 0;
        while (pessoas.size() > 1) {
            int m = random.nextInt(pessoas.size()) + 1;
            index = (index + m - 1) % pessoas.size();
            System.out.println("Eliminando: " + pessoas.get(index));
            pessoas.remove(index);
        }
        return pessoas.get(0);
    }
}
