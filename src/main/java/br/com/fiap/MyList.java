package br.com.fiap;

import java.util.*;

public class MyList {

    public static void main(String[] args) {
          hashSet();
          linkedHashSet();



    }


    static void hashSet(){
        Set<String> nomes = new HashSet<String>();
        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add("Joao");
        System.out.println(nomes);
        System.out.println(nomes.contains("Felipe"));



    }

    static void linkedHashSet(){
        Set<String> nomes = new LinkedHashSet<String>();
        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add("Joao");
        System.out.println(nomes);
        System.out.println(nomes.contains("Felipe"));
    }



    }



