package me.bobthe28th.v.entity;

import me.bobthe28th.v.KeyBindings;
import me.bobthe28th.v.event.EventHandler;
import me.bobthe28th.v.event.EventManager;
import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.event.KeyboardEvent;

public class Player extends LivingEntity implements Listener {

    public Player() {
        EventManager.registerEvents(this);
    }

    @EventHandler
    public void onKeyboardEvent(KeyboardEvent event) {
        if (event.getAction() == KeyAction.PRESSED && KeyBindings.getMovementVector().containsKey(event.getKey())) {
            addVel(KeyBindings.getMovementVector().get(event.getKey()));
            System.out.println(getVel().toString());
        }
    }

}
