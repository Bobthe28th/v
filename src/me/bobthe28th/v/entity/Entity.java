package me.bobthe28th.v.entity;

import me.bobthe28th.v.util.Vector2D;

public abstract class Entity {

    Vector2D pos;
    Vector2D vel;

    public Vector2D getPos() {
        return pos;
    }

    public void setPos(Vector2D pos) {
        this.pos = pos;
    }

    public Vector2D getVel() {
        return vel;
    }

    public void setVel(Vector2D vel) {
        this.vel = vel;
    }

}
