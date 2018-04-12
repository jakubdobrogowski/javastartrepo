package pl.sda.javastart.Homework.ExerciseOne;

import java.util.Arrays;

public class OopHomework1 {

    public static void main(String[] args) {
        Point pFirst = new Point(0, 0);

        Rectangle firstFihure = new Rectangle(pFirst, 5, 3);
        Circle SeconfFigure = new Circle(pFirst, 5);
        Square ThirdFigure = new Square(pFirst, 4);

        rectandleShow(firstFihure);
        circleShow(SeconfFigure);
        squareShow(ThirdFigure);

    }

    private static void squareShow(Square square) {

        System.out.println(square.getClass().getSimpleName());
        System.out.println("Pole= " + square.getArea());
        System.out.println("Obwód= " + square.getCircuit());
        System.out.println(Arrays.toString(square.getEdges()));
        System.out.println();
    }

    private static void circleShow(Circle circle) {

        System.out.println(circle.getClass().getSimpleName());
        System.out.println("Pole= " + circle.getArea());
        System.out.println("Obwód= " + circle.getCircuit());
        System.out.println(Arrays.toString(circle.getEdges()));
        System.out.println();
    }

    private static void rectandleShow(Rectangle rectangle) {

        System.out.println(rectangle.getClass().getSimpleName());
        System.out.println("Pole= " + rectangle.getArea());
        System.out.println("Obwód= " + rectangle.getCircuit());
        System.out.println(Arrays.toString(rectangle.getEdges()));
        System.out.println();
    }
}
