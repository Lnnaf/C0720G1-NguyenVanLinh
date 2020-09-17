package _07_abstract_interface.exercise.shape;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        double percentRandomValue = Math.random()*100;
        double shapes[] = new double[3];
        Rectangle rectangle = new Rectangle(2,2);
        Square square = new Square(2);
        Circle circle = new Circle(2);
        shapes[0]= rectangle.resize(percentRandomValue);
        shapes[1]=square.resize(percentRandomValue);
        shapes[2]=circle.resize(percentRandomValue);
        System.out.println(Arrays.toString(shapes));
        System.out.println("Rectangle's area before resize: "+rectangle.getArea()+
                " area after resize: "+ rectangle.resize(percentRandomValue));
        System.out.println("Square's area before resize: "+square.getArea()+
                " area after resize: "+ square.resize(percentRandomValue));
        System.out.println("Circle's area before resize: "+circle.getArea()+
                " area after resize: "+ circle.resize(percentRandomValue));

    }
}
