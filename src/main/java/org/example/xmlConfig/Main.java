package org.example.xmlConfig;

import org.example.xmlConfig.playerImpl.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        System.out.println("Hello in MUSIC PLAYER! Please make your choice.\n1. Play rock music\n2. Play classic music");
        int choice = scanner.nextInt();

        if (choice == 1) {
            MusicPlayer musicPlayer = context.getBean("musicPlayerRock", MusicPlayer.class);
            musicPlayer.playMusic();
        } else if (choice == 2) {
            MusicPlayer musicPlayer = context.getBean("musicPlayerClassic", MusicPlayer.class);
            musicPlayer.playMusic();
        } else {
            System.out.println("Wrong point!");
        }
        context.close();
    }
}