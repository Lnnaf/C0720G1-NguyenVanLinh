package _06_ke_thua.exercise;

public class Circle {
    double radius;
    String color;
    Circle (){};
    Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
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
    double getAreaCircle(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle " + "have radius = " + radius + ", color = " + color ;
    }
}
class Cylinder extends  Circle{
    double height;
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height= height;
    }
     double getVolume(){
        return getAreaCircle()*height;
    }

    @Override
    public String toString() {
        return "Cylinder " + "have height =" + height +" with "+ super.toString();
    }
}
class Test{
    public static void main(String[] args) {
        Circle circle = new Circle(3,"black");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(4,"red",2);
        System.out.println( cylinder +" and "+"Have Volume = "+cylinder.getVolume()+" m3");
    }
}

