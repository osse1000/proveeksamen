public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Someone like you", "Adele", 212));
        playlist.addSong(new Song("Let it be", "The Beatles", 180));
        playlist.addSong(new Song("Butterfly Effect", "Travis Scott", 240));

        playlist.printSongs();

        System.out.println("Total duration: " + playlist.getTotalDuration());

        playlist.save("songs.csv");
    }
}