package me.bobthe28th.v.entity;

import me.bobthe28th.v.KeyBindings;
import me.bobthe28th.v.event.*;
import me.bobthe28th.v.util.BoundingBox;
import me.bobthe28th.v.util.Vector2D;

public class Player extends LivingEntity implements Listener {

    public Player() {
        EventManager.registerEvents(this);
        setRenderBox(new BoundingBox(0.0,0.0,50.0,70.0));
    }

    double maxSpeed = 10;
    double acceleration = 2;
    double deceleration = 0.2;

    @Override
    public void update() {
        vel.add(movement.clone().multiply(acceleration));
        if (vel.getMag() >= maxSpeed) { //TODO getMagSquared
            vel.setMag(maxSpeed);
        }
        pos.add(vel);
        vel.multiply(1 - deceleration);
        if (vel.getX() <= 0.1 && vel.getX() >= -0.1) {
            vel.setX(0);
        }
        if (vel.getY() <= 0.1 && vel.getY() >= -0.1) {
            vel.setY(0);
        }

    }

    Vector2D movement = new Vector2D(0,0);

    @EventHandler
    public void onKeyboardEvent(KeyboardEvent event) {
        if (event.getAction() == KeyAction.PRESSED && KeyBindings.getMovementVector().containsKey(event.getKey())) {
            movement.add(KeyBindings.getMovementVector().get(event.getKey()));
            movement.set(Math.max(-1.0,Math.min(1.0,movement.getX())),Math.max(-1.0,Math.min(1.0,movement.getY())));
        } else if (event.getAction() == KeyAction.RELEASED && KeyBindings.getMovementVector().containsKey(event.getKey())) {
            movement.subtract(KeyBindings.getMovementVector().get(event.getKey()));
        }
    }

}
