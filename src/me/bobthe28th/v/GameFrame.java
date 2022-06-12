package me.bobthe28th.v;

import me.bobthe28th.v.event.EventManager;
import me.bobthe28th.v.event.Key;
import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.event.KeyboardEvent;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        EventManager.callEvent(new KeyboardEvent(Key.LEFT, KeyAction.TYPED));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        EventManager.callEvent(new KeyboardEvent(Key.LEFT, KeyAction.PRESSED));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        EventManager.callEvent(new KeyboardEvent(Key.LEFT, KeyAction.RELEASED));
    }
}
