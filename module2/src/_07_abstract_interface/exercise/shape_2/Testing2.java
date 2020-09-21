package _07_abstract_interface.exercise.shape_2;

public class Testing2 {
    public static void main(String[] args) {
        Square square = new Square(2);
        Shape[] arrayShape = new Shape[1];
        arrayShape[0] = new Square();
        for (Shape shapes : arrayShape) {
            System.out.println(square.toString());
            if (shapes instanceof Square) {
                Colorable colorable = (Square) shapes;
                colorable.howToColor();
            }
        }
    }
}

