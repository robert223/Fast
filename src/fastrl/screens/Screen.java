package fastrl.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public interface Screen {
    // takes an asciipanel to display itself on
    public void displayOutput(AsciiPanel terminal);

    // responds to key pressed
    public Screen respondToUserInput(KeyEvent key);
}
