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

    public double getMaxX() {
        return maxX;
    }

    public double getMinX() {
        return minX;
    }

    public double getMaxY() {
        return maxY;
    }

    public double getMinY() {
        return minY;
    }

    public void setBox(Vector2D corner1, Vector2D corner2) {
        this.setBox(corner1.getX(),corner1.getY(),corner2.getX(),corner2.getY());
    }

    public void setBox(double x1, double y1, double x2, double y2) {
        this.minX = Math.min(x1,x2);
        this.minY = Math.min(y1,y2);
        this.maxX = Math.max(x1,x2);
        this.maxY = Math.max(y1,y2);
    }

    public boolean contains(Vector2D v) {
        return v.getX() >= minX && v.getX() <= maxX && v.getY() >= minY && v.getY() <= maxY;
    }

    public boolean contains(BoundingBox b) {
        return b.getMinX() >= minX && b.getMinY() >= minY && b.getMaxX() <= maxX && b.getMaxY() <= maxY;
    }

    public boolean collides(BoundingBox b) {
        return minX <= b.getMaxX() && maxX >= b.getMinX() && minY <= b.getMaxY() && maxX >= b.getMinY();
    }

    public BoundingBox clone() throws CloneNotSupportedException {
        return (BoundingBox) super.clone();
    }

}
