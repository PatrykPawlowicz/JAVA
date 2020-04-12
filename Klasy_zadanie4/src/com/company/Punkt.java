package com.company;

public class Punkt {
    private int x;
    private int y;
    public String toString(){
        String res = "Punkt: (" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ")";
        return res;
    }
    public Punkt(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
