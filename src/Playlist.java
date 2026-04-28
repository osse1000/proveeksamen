import java.io.PrintStream;
import java.util.ArrayList;


public class Playlist {

        private ArrayList<Song> songs;

        public Playlist() {
            songs = new ArrayList<>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        // total længde
        public int getTotalDuration() {
            int total = 0;

            for (Song s : songs) {
                total += s.getDuration();
            }

            return total;
        }

        // gem til CSV
        public void save(String filename) {

            try {
                PrintStream ps = new PrintStream(filename);

                for (Song s : songs) {
                    ps.println(s.toCSV());
                }

                ps.close();

            } catch (Exception e) {
                System.out.println("Fejl ved gemning: " + e.getMessage());
            }
        }

        public void printSongs() {
            for (Song s : songs) {
                System.out.println(s);
            }
        }
    }
