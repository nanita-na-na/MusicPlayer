package org.example.annotationConfig;

import org.example.annotationConfig.playerImpl.ClassicPlayer;
import org.example.annotationConfig.playerImpl.RockPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

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
        context.close();
    }
}
