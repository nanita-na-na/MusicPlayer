package org.example.javaConfig.playerImpl;

import org.example.javaConfig.Player;
import org.example.javaConfig.model.ClassicMusic;

import java.util.List;
import java.util.Scanner;

public class ClassicPlayer implements Player {
    private final List<ClassicMusic> classicMusicList;

    public ClassicPlayer(List<ClassicMusic> classicMusicList) {
        this.classicMusicList = classicMusicList;
    }


    @Override
    public void playMusic() {
        System.out.println("Play " + classicMusicList.get(0));
        System.out.println("1. Next\n0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Playing: " + classicMusicList.get(1));
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Wrong point");
        }
    }
}
