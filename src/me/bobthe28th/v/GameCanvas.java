package me.bobthe28th.v;

import me.bobthe28th.v.entity.Camera;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    GameFrame frame;
    Camera camera;
    public GameCanvas(GameFrame frame, Camera camera) {
        this.frame = frame;
        this.camera = camera;
    }

    @Override
    public void paintComponent(Graphics g1){
        Graphics2D g = (Graphics2D) g1;
        g.setColor(Color.BLACK);
        g.fillRect(0,0,frame.getWidth(),frame.getHeight());
        camera.render(g);
    }
}
