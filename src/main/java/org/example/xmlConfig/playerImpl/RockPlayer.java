package org.example.xmlConfig.playerImpl;

import org.example.xmlConfig.Player;
import org.example.xmlConfig.model.RockMusic;

import java.util.List;
import java.util.Scanner;

public class RockPlayer implements Player {
    private final List<RockMusic> rockMusicList;

    public RockPlayer(List<RockMusic> rockMusicList) {
        this.rockMusicList = rockMusicList;
    }

    @Override
    public void playMusic() {

        System.out.println("Playing: " + rockMusicList.get(0));

        System.out.println("1. Next\n0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Playing: " + rockMusicList.get(1));
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Wrong point");
        }
    }
}