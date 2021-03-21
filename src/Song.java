import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Song {


    private String title;
    private String artist;
    private List<String> lyrics;

    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle(String title) {
        return title;
    }

    public String getArtist(String artist) {
        return artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setArtist(String artist) {
        this.artist=artist;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics=lyrics;
    }

//    public static void parseLyrics(String lyrics) {
//        String[] lyricsList = lyrics.split(" ");
//        for (String lyric : lyricsList) {
//            System.out.println(lyricsList);
//        }

        public static List<String> parseLyrics(String words) {
            return Arrays.asList(words.split(" "));
        }


//    public static void main(String[] args) {
//
//        Song nerdy = new Song("nerdy", "poison the well", "why do your eyes paralyze me");
//
//        System.out.println(nerdy.artist);
//        System.out.println(nerdy.title);
//        System.out.println(nerdy.lyrics);
//        System.out.println(parseLyrics(nerdy));
//
//    }

}
