package fastrl.entities;

import fastrl.World;

import java.awt.Color;

// generic entity with no health or ability to move
public class Entity {
    private final World world;
    public int x;
    public int y;
    private final char glyph;
    private final Color color;

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
