package fastrl.entities;

import fastrl.World;

import fastrl.Tile;

import java.awt.Color;


public class Entity {
    private final World world;
    public int x;
    public int y;
    private EntityAI ai;
    private final char glyph;
    private final Color color;

    public void moveBy(int mx, int my) {
        ai.onEnter(x + mx, y + my, world.getTile(x + mx, y + my));
    }

    public void dig(int x, int y) {
        world.dig(x, y);
    }

    public void setEntityAI(EntityAI ai) {
        this.ai = ai;
    }

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
