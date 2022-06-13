package me.bobthe28th.v.util;

public class Vector2D {

    double x;
    double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D set(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vector2D set(Vector2D v) {
        this.x = v.getX();
        this.y = v.getY();
        return this;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getMag() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2D normalize() {
        this.x /= getMag();
        this.y /= getMag();
        return this;
    }

    public Vector2D add(Vector2D v) {
        this.x += v.getX();
        this.y += v.getY();
        return this;
    }

    public Vector2D multiply(double m) {
        this.x *= m;
        this.y *= m;
        return this;
    }

    public double dot(Vector2D v) {
        return this.x * v.getX() + this.y * v.getY();
    }

    public boolean equals(Vector2D v) {
        if (v == this) {
            return true;
        }
        return v.getX() == this.x && v.getY() == y;
    }

    public Vector2D clone() throws CloneNotSupportedException {
        return (Vector2D) super.clone();
    }

    public String toString() {
        return "x=" + this.x + ", y=" + this.y;
    }

}
