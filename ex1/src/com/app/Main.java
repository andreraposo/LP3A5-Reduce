package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        for(int i = 0; i < 100; i++)
            randomList.add(new Random().nextInt(500));

        Optional<Integer> soma = randomList.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println("Soma: " + soma.get());

        Optional<Integer> mult = randomList.stream()
                .reduce((n1, n2) -> n1 * n2);
        System.out.println("Multiplicação: " + mult.get());

        Optional<Integer> menor = randomList.stream()
                .reduce((n1, n2) -> Math.min(n1, n2));
        System.out.println("Menor num: " + menor.get());

        Optional<Integer> maior = randomList.stream()
                .reduce((n1, n2) -> Math.max(n1, n2));
        System.out.println("Maior num: " +maior.get());
    }
}
