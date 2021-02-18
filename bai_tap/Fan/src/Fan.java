public class Fan {
    int slow=1;
    int medium=2;
    int fast=3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public void display(){
        if (this.on == true) {
            System.out.println("fan is on, " + "the speed is = " + this.speed + ", the color is = " + this.color + ", the radius is = " + this.radius);
        } else {
            System.out.println("fan is off, " + "the color is = " + this.color + ", the radius is = " + this.radius);
        }
        }
}

