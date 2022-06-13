package me.bobthe28th.v.entity;

import me.bobthe28th.v.GameFrame;
import me.bobthe28th.v.util.BoundingBox;

public class Camera extends Entity {

    GameFrame frame;
    BoundingBox renderBox;

    public Camera(GameFrame frame) {
        this.frame = frame;
        renderBox = new BoundingBox(0,0,frame.getWidth(),frame.getHeight());
    }

}
