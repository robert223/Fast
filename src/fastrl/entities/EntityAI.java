package fastrl.entities;

import fastrl.Tile;

public class EntityAI {
    public Entity entity;

    public EntityAI(Entity entity) {
        this.entity = entity;
        this.entity.setEntityAI(this);
    }

    public void onEnter(int x, int y, Tile tile) {

    }
}


