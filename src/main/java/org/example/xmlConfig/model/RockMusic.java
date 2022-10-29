package org.example.xmlConfig.model;

public class RockMusic {

    private String nameRockSong;
    private String authorRockSong;

    public RockMusic(String nameRockSong, String authorRockSong) {
        this.nameRockSong = nameRockSong;
        this.authorRockSong = authorRockSong;
    }
    public RockMusic(){
    }

    public String getNameRockSong() {
        return nameRockSong;
    }

    public void setNameRockSong(String nameRockSong) {
        this.nameRockSong = nameRockSong;
    }

    public String getAuthorRockSong() {
        return authorRockSong;
    }

    public void setAuthorRockSong(String authorRockSong) {
        this.authorRockSong = authorRockSong;
    }

    @Override
    public String toString() {
        return "RockMusic: " +
                "Song - " + nameRockSong +
                ", author - " + authorRockSong;
    }
}