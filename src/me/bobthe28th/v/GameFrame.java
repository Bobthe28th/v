package me.bobthe28th.v;

import me.bobthe28th.v.event.EventManager;
import me.bobthe28th.v.event.Key;
import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.event.KeyboardEvent;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class GameFrame extends JFrame implements KeyListener {

    public GameFrame() {
        this.setSize(400,400);
        this.setTitle("AAAAAAAAAAAAAA");
        this.setVisible(true);
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (KeyBindings.getKeyMap().containsKey(e.getKeyCode())) {
            EventManager.callEvent(new KeyboardEvent(KeyBindings.getKeyMap().get(e.getKeyCode()), KeyAction.TYPED));
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (KeyBindings.getKeyMap().containsKey(e.getKeyCode())) {
            EventManager.callEvent(new KeyboardEvent(KeyBindings.getKeyMap().get(e.getKeyCode()), KeyAction.PRESSED));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (KeyBindings.getKeyMap().containsKey(e.getKeyCode())) {
            EventManager.callEvent(new KeyboardEvent(KeyBindings.getKeyMap().get(e.getKeyCode()), KeyAction.RELEASED));
        }
    }
}
