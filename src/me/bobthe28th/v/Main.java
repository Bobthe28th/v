package me.bobthe28th.v;

import me.bobthe28th.v.entity.Player;

public class Main {

    static GameFrame frame;
    static GameCanvas gameCanvas;
    static Player p;
    static boolean gameRunning = true;

    public static void main(String[] args) {
        frame = new GameFrame();
        gameCanvas = new GameCanvas(frame);
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
