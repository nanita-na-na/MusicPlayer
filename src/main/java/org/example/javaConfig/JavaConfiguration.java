package org.example.javaConfig;

import org.example.javaConfig.model.ClassicMusic;
import org.example.javaConfig.model.RockMusic;
import org.example.javaConfig.playerImpl.ClassicPlayer;
import org.example.javaConfig.playerImpl.RockPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class JavaConfiguration {

    @Bean
    public ClassicMusic classicMusic1() {
        ClassicMusic classicMusic1 = new ClassicMusic();
        classicMusic1.setNameClassicSong("Winter");
        classicMusic1.setAuthorClassicSong("Antonio Vivaldi");
        return classicMusic1;
    }

    @Bean
    public ClassicMusic classicMusic2() {
        ClassicMusic classicMusic2 = new ClassicMusic();
        classicMusic2.setNameClassicSong("Symphony 40");
        classicMusic2.setAuthorClassicSong("Amadeus Mozart");
        return classicMusic2;
    }

    @Bean
    public RockMusic rockMusic1() {
        RockMusic rockMusic1 = new RockMusic();
        rockMusic1.setNameRockSong("Smells Like Teen Spirit");
        rockMusic1.setAuthorRockSong("Nirvana");
        return rockMusic1;
    }

    @Bean
    public RockMusic rockMusic2() {
        RockMusic rockMusic2 = new RockMusic();
        rockMusic2.setNameRockSong("We Will Rock You");
        rockMusic2.setAuthorRockSong("Queen");
        return rockMusic2;
    }

    @Bean
    public List<ClassicMusic> classicMusicList() {
        return Arrays.asList(classicMusic1(), classicMusic2());
    }

    @Bean
    public List<RockMusic> rockMusicList() {
        return Arrays.asList(rockMusic1(), rockMusic2());
    }

    @Bean
    public ClassicPlayer classicPlayer() {
        return new ClassicPlayer(classicMusicList());
    }

    @Bean
    public RockPlayer rockPlayer() {
        return new RockPlayer(rockMusicList());
    }
}
