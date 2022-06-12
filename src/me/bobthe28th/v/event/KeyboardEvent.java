package me.bobthe28th.v.event;

public class KeyboardEvent extends Event {

    Key k;
    KeyAction a;

    public KeyboardEvent(Key k, KeyAction a) {
        this.k = k;
        this.a = a;
    }

    public Key getKey() {
        return k;
    }

    public KeyAction getAction() {
        return a;
    }
}
