package _04_class_object_in_java.exercise;

public class Fan {
    private static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius ;
    private String color;
    //getter setter

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
        speed = FAST;
        on=false;
        radius=10;
        color="blue";

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        display(fan1);

    }

    public static void display( Fan nameFan) {
        switch (nameFan.speed){
            case 1:
            System.out.println("Speed: Slow");
            break;
            case 2:
                System.out.println("Speed: Medium");
                break;
            case 3:
                System.out.println("Speed: Fast");
        }
        if (nameFan.isOn()){
            System.out.println("Status: On");
        }else{
            System.out.println("Status: Off");
        }
        System.out.println("Radius: "+nameFan.getRadius());
        System.out.println("Color is: "+nameFan.getColor());

    }
}
