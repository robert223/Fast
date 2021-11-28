package fastrl.screens;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

import static fastrl.Motd.randomMOTD;

public class MainMenu implements Screen {


    public void displayOutput(AsciiPanel terminal) {
        System.out.println("[MainMenu] Drawing title");
        terminal.writeCenter("    ______              __ ", 2);
        terminal.writeCenter("   / ____/____ _ _____ / /_", 3);
        terminal.writeCenter("  / /_   / __ `// ___// __/", 4);
        terminal.writeCenter(" / __/  / /_/ /(__  )/ /_  ", 5);
        terminal.writeCenter("/_/     \\__,_//____/ \\__/  ", 6);
        terminal.writeCenter("-- press [enter] to play --", 8);
        terminal.writeCenter(randomMOTD(), 22);
    }

    public Screen respondToUserInput(KeyEvent key) {
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
    }
}