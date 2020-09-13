package _04_class_object_in_java.exercise;

public class Fan {
    private static int slow = 1, medium = 2, fast = 3;
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
        speed = fast;
        on=false;
        radius=10;
        color="blue";

    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(3);
        Fan1.setOn(true);
        Fan1.setRadius(10);
        Fan1.setColor("Yellow");
        display(Fan1);
        Fan Fan2 = new Fan();
        Fan2.setSpeed(2);
        Fan2.setOn(false);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        display(Fan2);

    }

    public static void display( Fan nameFan) {
        System.out.println("adad"+nameFan);
        switch (nameFan.speed){
            case 1:
            System.out.println("Speed: Fast");
            break;
            case 2:
                System.out.println("Speed: Medium");
                break;
            case 3:
                System.out.println("Speed: Slow");
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
