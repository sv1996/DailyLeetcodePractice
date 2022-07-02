package com.customSoting;

public class Point implements Comparable<Point>{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public Point() {
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }




    @Override
    public int compareTo(Point p) {
         return this.x - p.x;
    }
}
