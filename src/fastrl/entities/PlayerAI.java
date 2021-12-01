package fastrl.entities;

import fastrl.Tile;

public class PlayerAI extends EntityAI {
    public PlayerAI(Entity entity) {
        super(entity);
    }

    public void onEnter(int x, int y, Tile tile) {
        if (tile.isGround()) {
            entity.x = x;
            entity.y = y;
        } else if (tile.isDiggable()) {
            entity.dig(x, y);
        }
    }

}
