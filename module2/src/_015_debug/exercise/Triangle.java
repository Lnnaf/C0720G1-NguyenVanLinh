package _015_debug.exercise;
import java.util.*;
public class Triangle {
    int side1, side2, side3;

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of Triangle:");
        try {
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();
            if (side1 <= 0 || side2 <=0 || side3 <=0) throw new IllegalTriangleException("Number must be greater than 0");
            else if(side1+side2<side3 || side1+side3<side2 || side2+side3<side1) throw new IllegalTriangleException("The sum of any two sides is greater than the other side");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }
    static class IllegalTriangleException extends Exception {
       public IllegalTriangleException(String error){
           super(error);
       }

        @Override
        public String toString() {
            return "Error input side of Triangle: "+super.getMessage();
        }
    }

}
