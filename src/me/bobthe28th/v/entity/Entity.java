package me.bobthe28th.v.entity;

import me.bobthe28th.v.util.BoundingBox;
import me.bobthe28th.v.util.Vector2D;

public abstract class Entity {

    Vector2D pos = new Vector2D(0,0);
    Vector2D vel = new Vector2D(0,0);

    boolean render = true;
    BoundingBox renderBox;

    public void update() {}

    public Entity() {
        EntityManager.register(this);
    }

    public boolean doRender() {
        return render;
    }

    public void setRender(boolean render) {
        this.render = render;
    }

    public BoundingBox getRenderBox() {
        return renderBox;
    }

    public void setRenderBox(BoundingBox renderBox) {
        this.renderBox = renderBox;
    }

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

    public void addPos(Vector2D pos) {
        this.pos.add(pos);
    }

}
