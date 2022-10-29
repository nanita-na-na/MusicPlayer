package org.example.annotationConfig.playerImpl;

import org.example.annotationConfig.Player;
import org.example.annotationConfig.model.ClassicMusic;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Scanner;

@Component

public class ClassicPlayer implements Player {
    private final List<ClassicMusic> classicMusicList;

    public ClassicPlayer(List<ClassicMusic> classicMusicList) {
        this.classicMusicList = classicMusicList;
    }

    @PostConstruct
    public void init() {
        ClassicMusic classicMusic1 = new ClassicMusic();
        classicMusic1.setNameClassicSong("Winter");
        classicMusic1.setAuthorClassicSong("Antonio Vivaldi");

        ClassicMusic classicMusic2 = new ClassicMusic();
        classicMusic2.setNameClassicSong("Symphony 40");
        classicMusic2.setAuthorClassicSong("Amadeus Mozart");

        classicMusicList.add(classicMusic1);
        classicMusicList.add(classicMusic2);

    }

    @Override
    public void playMusic() {
        System.out.println("Play " + classicMusicList.get(1));
        System.out.println("1. Next\n0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Playing: " + classicMusicList.get(2));
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Wrong point");
        }
    }
}
