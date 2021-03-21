import java.util.List;

public class Album {

    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }


    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs(List songs) {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }


//    public static void printTrackListings(List songs) {
//        for (Song:songs) {
//            System.out.println(songs);
//        }
//    }

//    public void printTrackListings() {
//        System.out.println(name.toUpperCase() + " track listing...");
//        for (int i = 0; i < songs.size(); i += 1) {
//            System.out.println((i + 1) + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
//        }
//    }

//    public static void main(String[] args) {
//        Album album = new Album("The Opposite of December", ("Pierced in the Veil of Christ"), ("Electric Penis"));
//        System.out.println(album.name);
//        System.out.println(album.songs);
//    }

}
