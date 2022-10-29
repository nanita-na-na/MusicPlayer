package org.example.javaConfig;

import org.example.javaConfig.playerImpl.ClassicPlayer;
import org.example.javaConfig.playerImpl.RockPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in MUSIC PLAYER! Please make your choice.\n1. Play rock music\n2. Play classic music");
        int choice = scanner.nextInt();

        if (choice == 1) {
            RockPlayer rockPlayer = context.getBean("rockPlayer", RockPlayer.class);
            rockPlayer.playMusic();
        } else if (choice == 2) {
            ClassicPlayer classicPlayer = context.getBean("classicPlayer", ClassicPlayer.class);
            classicPlayer.playMusic();
        } else {
            System.out.println("Wrong point!");
        }
    }
}
