package fastrl.items;

import java.awt.Color;

import asciiPanel.AsciiPanel;

public enum Item {

    // ascii panel supports code page 437
    WARHAMMER((char) 15, AsciiPanel.red),
    WALL((char) 178, AsciiPanel.yellow),
    BOUNDS('x', AsciiPanel.brightBlack);

    private char glyph;

    public char getGlyph() {
        return glyph;
    }

    private Color color;

    public Color color() {
        return color;
    }

    Item(char glyph, Color color) {
        this.glyph = glyph;
        this.color = color;
    }


}