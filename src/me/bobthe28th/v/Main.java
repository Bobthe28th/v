package me.bobthe28th.v;

import me.bobthe28th.v.entity.Camera;
import me.bobthe28th.v.entity.Entity;
import me.bobthe28th.v.entity.EntityManager;
import me.bobthe28th.v.entity.Player;

public class Main {

    static GameFrame frame;
    static Camera mainCamera;
    static GameCanvas gameCanvas;
    static Player p;
    static boolean gameRunning = true;

    static double interpolation = 0;
    static final int TICKS_PER_SECOND = 60;
    static final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
    static final int MAX_FRAMESKIP = 5;
    static double nextTick;

    public static void main(String[] args) {
        frame = new GameFrame();
        mainCamera = new Camera(frame);
        gameCanvas = new GameCanvas(frame,mainCamera);
        frame.add(gameCanvas);
        frame.start();
        mainCamera.updateSize();
        p = new Player();
        nextTick = System.currentTimeMillis();
        gameLoop();
    }

    static void gameLoop() {
        while (gameRunning) {
            int loops = 0;
            while (System.currentTimeMillis() > nextTick && loops < MAX_FRAMESKIP) {
                for (Entity entity : EntityManager.getEntityList()) {
                    entity.update();
                }
                nextTick += SKIP_TICKS;
                loops ++;
            }
            gameCanvas.repaint(); //interpolate https://dewitters.com/dewitters-gameloop/
        }
    }
}
