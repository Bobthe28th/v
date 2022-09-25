package me.bobthe28th.v;

import me.bobthe28th.v.event.EventManager;
import me.bobthe28th.v.event.KeyAction;
import me.bobthe28th.v.event.KeyboardEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame implements KeyListener {

    public void start() {
        this.setSize(400,400);
        this.setTitle("v");
        this.setFocusable(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setBackground(new Color(1f,1f,1f,0.0f));

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
