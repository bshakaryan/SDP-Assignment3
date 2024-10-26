package state;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        // Initially paused
        player.pressPlay(); // Output: Playing the media...
        player.pressPlay(); // Output: Pausing the player...
        player.pressPlay(); // Output: Playing the media...
    }
}
