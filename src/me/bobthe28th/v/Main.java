package me.bobthe28th.v;

import me.bobthe28th.v.entity.Camera;
import me.bobthe28th.v.entity.Player;

public class Main {

    static GameFrame frame;
    static Camera mainCamera;
    static GameCanvas gameCanvas;
    static Player p;
    static boolean gameRunning = true;

    public static void main(String[] args) {
        frame = new GameFrame();
        mainCamera = new Camera(frame);
        gameCanvas = new GameCanvas(frame,mainCamera);
        frame.add(gameCanvas);

        p = new Player();
        gameLoop();
    }

    static void gameLoop() {
        while (gameRunning) {
            gameCanvas.repaint();
        }
    }
}
