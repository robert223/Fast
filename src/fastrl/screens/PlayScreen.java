package fastrl.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
import fastrl.World;
import fastrl.WorldBuilder;

public class PlayScreen implements Screen {
    private World world;
    private int centerX;
    private int centerY;
    private final int screenWidth;
    private final int screenHeight;

    public PlayScreen() {
        screenWidth = 80;
        screenHeight = 21;
        createWorld();
    }

    public void displayOutput(AsciiPanel terminal) {
        int left = getScrollX();
        int top = getScrollY();

        displayTiles(terminal, left, top);
        terminal.write('X', centerX - left, centerY - top);
    }

    public Screen respondToUserInput(KeyEvent key) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                return new LoseScreen();
            case KeyEvent.VK_ENTER:
                return new WinScreen();
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_H:
                scrollBy(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_L:
                scrollBy(1, 0);
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_K:
                scrollBy(0, -1);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_J:
                scrollBy(0, 1);
                break;
            case KeyEvent.VK_Y:
                scrollBy(-1, -1);
                break;
            case KeyEvent.VK_U:
                scrollBy(1, -1);
                break;
            case KeyEvent.VK_B:
                scrollBy(-1, 1);
                break;
            case KeyEvent.VK_N:
                scrollBy(1, 1);
                break;
        }

        return this;
    }

    private void createWorld() {
        world = new WorldBuilder(90, 31)
                .makeCaves()
                .buildWorld();
    }

    public int getScrollX() {
        return Math.max(0, Math.min(centerX - screenWidth / 2, world.getWidth() - screenWidth));
    }

    public int getScrollY() {
        return Math.max(0, Math.min(centerY - screenHeight / 2, world.getHeight() - screenHeight));
    }

    private void displayTiles(AsciiPanel terminal, int left, int top) {
        for (int x = 0; x < screenWidth; x++) {
            for (int y = 0; y < screenHeight; y++) {
                int wx = x + left;
                int wy = y + top;

                terminal.write(world.getGlyph(wx, wy), x, y, world.getColor(wx, wy));
            }
        }
    }

    private void scrollBy(int mX, int mY) {
        centerX = Math.max(0, Math.min(centerX + mX, world.getWidth() - 1));
        centerY = Math.max(0, Math.min(centerY + mY, world.getHeight() - 1));
    }
}