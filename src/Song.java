import java.util.List;

public class Song {
//    public static void main(String[] args) {
//
//    }

    private String title;
    private String artist;
    private List lyrics;

    public Song(String title, String artist, List lyrics) {
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

    public List getLyrics(List lyrics) {
        return lyrics;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setArtist(String artist) {
        this.title=title;
    }

    public void setLyrics(List lyrics) {
        this.lyrics=lyrics;
    }

//    public static List parseLyrics(List Lyrics) {
//
//        return title;
//    }




}
