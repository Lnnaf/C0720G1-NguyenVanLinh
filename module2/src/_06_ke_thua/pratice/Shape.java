package _06_ke_thua.pratice;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {

    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //getter setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
            return "a Shape " + "with color of " + color  + (isFilled()?" is filled":" is not filled");
        }
    }
    class Circle extends Shape{
        private  double radius = 1;
        Circle(){
        }
        Circle(double radius){
            this.radius = radius;
        }
        Circle(double radius, String color, boolean filled){
            super(color,filled);
            this.radius = radius;
        }
        //getter setter Circle


         double getRadius() {
            return radius;
        }

         void setRadius(double radius) {
            this.radius = radius;
        }
        double getArea(){
            return radius*radius*Math.PI;
        }
        double getPerimeter(){
            return radius*2*Math.PI;
        }

        @Override
        public String toString() {
            return "Circle" + "with radius=" + getRadius() +", which is a sub class of"+super.toString();
        }
    }
    class Rectangle extends Shape{
        double width=1.0, length=1.0;
        Rectangle(){
        }
        Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }
        Rectangle(double width, double length, String color , boolean filled){
            super(color, filled);
            this.width = width;
            this.length=length;
        }

         double getWidth() {
            return width;
        }

         void setWidth(double width) {
            this.width = width;
        }

         double getLength() {
            return length;
        }

         void setLength(double length) {
            this.length = length;
        }
        double getArea(){
            return width*length;
        }
        double getPerimeter(){
            return  (width+length)*2;
        }

        @Override
        public String toString() {
            return "A Rectangle" + " with width = " + getWidth() + ", length = " + getLength() +", which is a subclass of "+super.toString();
        }
    }
        class Square extends Rectangle{
            Square(){
            }
           Square(double side){
               super(side,side);
           }
           Square (double side, String color, boolean filled){
                super(side,side,color,filled);
           }
           double getSide(){
                return getWidth();
           }
           void setSide(double side){
                setWidth(side);
                setLength(side);
           }

            @Override
            void setWidth(double width) {
                setSide(width);
            }
        }
        class ShapeTest{
            public static void main(String[] args) {
//                Shape shape = new Shape();
//                System.out.println(shape);
//                shape = new Shape("red",false);
//                System.out.println(shape);
//                Circle circle = new Circle();
//                System.out.println(circle);
//                circle = new Circle(3.5,"red",false);
//                System.out.println(circle);
//                Rectangle rectangle = new Rectangle();
//                System.out.println(rectangle);
//                rectangle = new Rectangle(10,7,"black",false);
//                System.out.println(rectangle);
                Square square = new Square();
                System.out.println(square);

                square = new Square(2.3);
                System.out.println(square);

                square = new Square(5.8, "yellow", true);
                System.out.println(square);
            }
        }
