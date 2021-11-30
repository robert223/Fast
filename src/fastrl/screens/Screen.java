package fastrl.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public interface Screen {
    // takes an asciipanel to display itself on
    void displayOutput(AsciiPanel terminal);

    // screens respond to pressed keys
    Screen respondToUserInput(KeyEvent key);
}
