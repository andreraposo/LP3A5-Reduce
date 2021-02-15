package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

        Stream<String> streamP = nomes.stream().filter(c -> c.charAt(0) == 'P');
        Optional<String> nomesComP = streamP.reduce((s1, s2) -> s1.concat(s2));
        System.out.println("Nomes com P: " + nomesComP.get());

        Stream<String> streamA = nomes.stream().filter(c -> c.charAt(0) == 'A');
        Optional<String> nomesComA = streamA.reduce((s1, s2) -> s1.concat(s2));
        System.out.println("Nomes com A: " + nomesComA.get());

        Optional<String> todosNomes = nomes.stream().reduce((s1, s2) -> s1.concat(s2));
        System.out.println("Nomes: " + todosNomes.get());
    }
}
