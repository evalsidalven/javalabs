package ru.mirea.lab2;

public class Ball {
    private double x;
    private double y;

    public Ball (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY (double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString(){
        return this.x + " x, " + this.y + " y";
    }
}

