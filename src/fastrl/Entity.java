package fastrl;

import java.awt.Color;

public class Entity {
    private World world;
    public int x;
    public int y;
    private char glyph;
    private Color color;

    public char getGlyph() {
        return glyph;
    }

    public Color color() {
        return color;
    }

    public Entity(World world, char glyph, Color color) {
        this.world = world;
        this.glyph = glyph;
        this.color = color;
    }
}
