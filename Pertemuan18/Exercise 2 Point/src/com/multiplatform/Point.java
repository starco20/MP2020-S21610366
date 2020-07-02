package com.multiplatform;

public class Point {
    int x;
    int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distance(){
        Point A = (xA,yA);
        Point B = (xB,yB);
        int d = √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA);
        return d;
    }
    public int distance(int x, int y){
        return this.distance(x,y);
    }

    public void distance(Point another){
        double another;
        return this.distance(Point.another);
    }

}
