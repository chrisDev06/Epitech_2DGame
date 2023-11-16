package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static main.GameStates.*;

import main.Game;
import main.GameStates;

public class KeyboardLister implements KeyListener {
    private Game game;

    public KeyboardLister(Game game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (GameStates.gameState == EDIT) {
            game.getEditor().keyPressed(e);
        } else if (GameStates.gameState == PLAYING) {
            game.getPlaying().keyPressed(e);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
