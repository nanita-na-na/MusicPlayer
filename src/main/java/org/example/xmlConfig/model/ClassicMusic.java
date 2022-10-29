package org.example.xmlConfig.model;

public class ClassicMusic {

    private String nameClassicSong;
    private String authorClassicSong;

    public ClassicMusic(String nameClassicSong, String authorClassicSong) {
        this.nameClassicSong = nameClassicSong;
        this.authorClassicSong = authorClassicSong;
    }

    public ClassicMusic() {
    }

    public String getNameClassicSong() {
        return nameClassicSong;
    }

    public void setNameClassicSong(String nameClassicSong) {
        this.nameClassicSong = nameClassicSong;
    }

    public String getAuthorClassicSong() {
        return authorClassicSong;
    }

    public void setAuthorClassicSong(String authorClassicSong) {
        this.authorClassicSong = authorClassicSong;
    }

    @Override
    public String toString() {
        return "ClassicMusic: " +
                "Song - " + nameClassicSong +
                ", author - " + authorClassicSong;
    }
}