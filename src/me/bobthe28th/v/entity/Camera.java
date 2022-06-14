package me.bobthe28th.v.entity;

import me.bobthe28th.v.GameFrame;
import me.bobthe28th.v.util.BoundingBox;
import me.bobthe28th.v.util.Vector2D;

import java.awt.*;

public class Camera extends Entity {

    GameFrame frame;
    BoundingBox toRenderBox;

    public Camera(GameFrame frame) {
        this.frame = frame;
        toRenderBox = new BoundingBox(0,0,frame.getWidth(),frame.getHeight());
        setRender(false);
    }

    public void render(Graphics2D g) {
        for(Entity entity : EntityManager.getEntityList()) {
            if (entity.doRender()) {
                if (entity.getRenderBox() != null && toRenderBox.collides(entity.getRenderBox())) {
                    Vector2D renderPos = entity.getPos().clone().subtract(pos);
                    g.setColor(Color.BLUE);
                    g.fillRect((int)Math.round(renderPos.getX()),(int)Math.round(renderPos.getY()),(int)Math.round(entity.getRenderBox().getWidth()),(int)Math.round(entity.getRenderBox().getHeight()));
                }
            }
        }
    }

}
