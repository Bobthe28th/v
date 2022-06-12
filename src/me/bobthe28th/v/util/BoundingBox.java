package me.bobthe28th.v.util;

public class BoundingBox {

    double minX;
    double minY;
    double maxX;
    double maxY;

    public BoundingBox(Vector2D corner1, Vector2D corner2) {
        this.setBox(corner1, corner2);
    }

    public BoundingBox(double x1, double y1, double x2, double y2) {
        this.setBox(x1, y1, x2, y2);
    }

    public BoundingBox() {
        this.setBox(0,0,0,0);
    }

    public BoundingBox setBox(Vector2D corner1, Vector2D corner2) {
        return this.setBox(corner1.getX(),corner1.getY(),corner2.getX(),corner2.getY());
    }

    public BoundingBox setBox(double x1, double y1, double x2, double y2) {
        this.minX = Math.min(x1,x2);
        this.minY = Math.min(y1,y2);
        this.maxX = Math.max(x1,x2);
        this.maxY = Math.max(y1,y2);
        return this;
    }

}
