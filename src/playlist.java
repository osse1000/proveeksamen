import java.util.ArrayList;

public class playlist {

    private ArrayList<song> songs;

    public playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(song song) {
        songs.add(song);
    }

    public int getTotalDuration() {
        int total = 0;

        for (song s : songs) {
            total += s.getDuration();
        }
    }
    CSV

}
