package fastrl;

import java.awt.Color;

import asciiPanel.AsciiPanel;

public enum Tile {

    // ascii panel supports code page 437 or any char
    FLOOR((char) 250, AsciiPanel.yellow),
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

    Tile(char glyph, Color color) {
        this.glyph = glyph;
        this.color = color;
    }


}