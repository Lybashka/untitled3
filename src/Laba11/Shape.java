package Laba11;

import javax.swing.plaf.PanelUI;

/**
 * Created by student on 22.04.2015.
 */
public class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        color="red";
        filled=true;
    }
    public  Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){

    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
