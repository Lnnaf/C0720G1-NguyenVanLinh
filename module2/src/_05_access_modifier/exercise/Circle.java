package _05_access_modifier.exercise;

public class Circle {
    private String name = "Circle 1";
    private double radius = 1.0;
    private String color= "Red";

    public Circle() {
    }
    public Circle(String name, double r,String color) {
        this.name = name;
        this.radius = r;
        this.color = color;
    }
    String getName(){
        return name;
    }
    String getColor() {
        return color;
    }

    double getRadius(){
        return radius;
    }
    double getArea(){
        return radius*2*Math.PI;

    }

}
 class TestCircle{
     public static void main(String[] args) {
         //circle 1
         Circle circle = new Circle();
        display(circle);
         //circle 2
         Circle circle_2 = new Circle("Circle 2",10,"blue");
         display(circle_2);

     }

     public static void display(Circle name) {
         System.out.println(name.getName());
         System.out.println(name.getRadius());
         System.out.println(name.getColor());
         System.out.println(name.getArea());
         System.out.println("-------------------------------------");
     }
}
