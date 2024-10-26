package state;

public class PausedState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Playing the media...");
        player.setState(new PlayingState());
    }
}
