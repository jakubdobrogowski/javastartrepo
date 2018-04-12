package pl.sda.javastart.Homework.ExerciseOne;

import pl.sda.javastart.Homework.ExerciseOne.Figure;
import pl.sda.javastart.Homework.ExerciseOne.Point;

public class Rectangle extends Figure {

    private Point p;
    public double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getCircuit() {
        return 2 * width + 2 * height;
    }

    @Override
    Point[] getEdges() {
        Point p1 = new Point(p.getX() + width, p.getY());
        Point p2 = new Point(p.getX(), p.getX() + height);
        Point p3 = new Point(p.getX() + width, p.getY() + height);

        return new Point[]{p, p1, p2, p3};

    }
}
