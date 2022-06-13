package me.bobthe28th.v.entity;

import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.util.Vector2D;

import java.util.HashMap;

public abstract class Entity {

    Vector2D pos = new Vector2D(0,0);
    Vector2D vel = new Vector2D(0,0);

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

    public void addVel(Vector2D vel) {
        this.vel.add(vel);
    }

}
