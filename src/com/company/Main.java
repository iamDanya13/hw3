package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args){
            List<String> words = Arrays.asList(
                    "Сбербанк", "Яндекс",
                    "Мэйл", "Гугл",
                    "Касперский", "Сбербанк",
                    "Сбербанк", "Гугл",
                    "Мэйл", "Касперский",
                    "Втб", "Газпром");
            Set<String> unique = new HashSet<>(words);

            System.out.println("Все компании");
            System.out.println(words.toString());

            System.out.println("Уникальные компании");
            System.out.println(unique.toString());

            System.out.println("Как часто встречаются компании");
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(words, key));
            }
        }
    }