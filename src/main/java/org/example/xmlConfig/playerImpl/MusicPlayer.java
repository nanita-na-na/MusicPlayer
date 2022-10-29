package org.example.xmlConfig.playerImpl;

import org.example.xmlConfig.Player;

public class MusicPlayer implements Player {
    Player player;

    public MusicPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void playMusic() {
        player.playMusic();
    }
}