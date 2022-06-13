package me.bobthe28th.v;

import me.bobthe28th.v.event.Key;
import me.bobthe28th.v.util.Vector2D;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyBindings {

    static HashMap<Integer, Key> keyMap = new HashMap<>(Map.of(
            KeyEvent.VK_A,Key.LEFT,
            KeyEvent.VK_D,Key.RIGHT,
            KeyEvent.VK_W,Key.UP,
            KeyEvent.VK_S,Key.DOWN
    ));

    static HashMap<Key, Vector2D> movementVector = new HashMap<>(Map.of(
            Key.UP,new Vector2D(0.0,-1.0),
            Key.DOWN,new Vector2D(0.0,1.0),
            Key.LEFT,new Vector2D(-1.0,0.0),
            Key.RIGHT,new Vector2D(1.0,0.0)
    ));

    public static HashMap<Integer, Key> getKeyMap() {
        return keyMap;
    }

    public static HashMap<Key, Vector2D> getMovementVector() {
        return movementVector;
    }
}
