package pl.sda.javastart.Homework.ExerciseOne;

import pl.sda.javastart.Homework.ExerciseOne.Figure;
import pl.sda.javastart.Homework.ExerciseOne.Point;

public class Square extends Figure {
    private Point p;
    private  double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    @Override
    double getArea() {
        return Math.pow(side,2);
    }

    @Override
    double getCircuit() {
        return 4*side;
    }

    @Override
    Point[] getEdges() {
        Point p1 = new Point(p.getX() + side, p.getY());
        Point p2 = new Point(p.getX(), p.getX() + side);
        Point p3 = new Point(p.getX() + side, p.getY() + side);

        return new Point[]{p, p1, p2, p3};
    }
}
