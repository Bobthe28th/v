package me.bobthe28th.v.entity;

import me.bobthe28th.v.KeyBindings;
import me.bobthe28th.v.event.EventHandler;
import me.bobthe28th.v.event.EventManager;
import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.event.KeyboardEvent;
import me.bobthe28th.v.util.BoundingBox;

public class Player extends LivingEntity implements Listener {

    public Player() {
        EventManager.registerEvents(this);
        setRenderBox(new BoundingBox(0.0,0.0,50.0,70.0));
    }

    @EventHandler
    public void onKeyboardEvent(KeyboardEvent event) {
        System.out.println(event.getAction().toString()); //While pressed, add velocity until released
        if (event.getAction() == KeyAction.PRESSED && KeyBindings.getMovementVector().containsKey(event.getKey())) {
            addPos(KeyBindings.getMovementVector().get(event.getKey()));
        }
    }

}
