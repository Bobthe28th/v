package me.bobthe28th.v;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    GameFrame frame;
    public GameCanvas(GameFrame frame) {
        this.frame = frame;
    }

    int i = 0;
    @Override
    public void paintComponent(Graphics g1){
        Graphics2D g = (Graphics2D) g1;
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,frame.getWidth(),frame.getHeight());
        g.setColor(Color.BLACK);
        g.fillRect(0,0,100,100);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,20,200);
        g.drawString(String.valueOf(i),50,30);

        i ++;
    }
}
