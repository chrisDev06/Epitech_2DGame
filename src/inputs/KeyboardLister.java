package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static main.GameStates.*;

import main.GameStates;

public class KeyboardLister implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A)
            GameStates.gameState = MENU;
        else if (e.getKeyCode() == KeyEvent.VK_Z)
            GameStates.gameState = PLAYING;

        else if (e.getKeyCode() == KeyEvent.VK_E)
            GameStates.gameState = SETTINGS;

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
