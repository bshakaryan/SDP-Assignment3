package state;

public class PlayingState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing the player...");
        player.setState(new PausedState());
    }
}
