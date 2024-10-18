package com.app.geometry;

public class appGeometry {
    private float x1, y1;
    private float x2, y2;

    public appGeometry(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }

    public void getDetails() {
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
    }

    public boolean isEqual() {
        return (x1 == x2 && y1 == y2);
    }

    public double Distance() {
        float distX = x2 - x1;
        float distY = y2 - y1;
        return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
    }
}
