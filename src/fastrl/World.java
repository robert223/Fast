package fastrl;

import java.awt.Color;

public class World {
    private Tile[][] tiles;
    private int width;

    public void dig(int x, int y) {
        if (getTile(x, y).isDiggable())
            tiles[x][y] = Tile.FLOOR;
    }

    public int getWidth() {
        return width;
    }

    private int height;

    public int getHeight() {
        return height;
    }

    public World(Tile[][] tiles) {
        this.tiles = tiles;
        this.width = tiles.length;
        this.height = tiles[0].length;
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return Tile.BOUNDS;
        else
            return tiles[x][y];
    }

    public char getGlyph(int x, int y) {
        return getTile(x, y).getGlyph();
    }

    public Color getColor(int x, int y) {
        return getTile(x, y).getColor();
    }
}