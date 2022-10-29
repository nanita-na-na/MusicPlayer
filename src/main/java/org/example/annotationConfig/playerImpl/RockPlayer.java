package org.example.annotationConfig.playerImpl;

import org.example.annotationConfig.Player;
import org.example.annotationConfig.model.RockMusic;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Scanner;

@Component

public class RockPlayer implements Player {
    private final List<RockMusic> rockMusicList;

    public RockPlayer(List<RockMusic> rockMusicList) {
        this.rockMusicList = rockMusicList;
    }

    @PostConstruct
    public void init() {
        RockMusic rockMusic1 = new RockMusic();
        rockMusic1.setNameRockSong("Smells Like Teen Spirit");
        rockMusic1.setAuthorRockSong("Nirvana");

        RockMusic rockMusic2 = new RockMusic();
        rockMusic2.setNameRockSong("We Will Rock You");
        rockMusic2.setAuthorRockSong("Queen");

        rockMusicList.add(rockMusic1);
        rockMusicList.add(rockMusic2);
    }

    @Override
    public void playMusic() {
        // init();

        System.out.println("Playing: " + rockMusicList.get(1));

        System.out.println("1. Next\n0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Playing: " + rockMusicList.get(2));
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Wrong point");
        }
    }
}
