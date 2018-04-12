package pl.sda.javastart.Homework.ExerciseOne;

public class Circle extends Figure {

    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double getCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    Point[] getEdges() {
        return new Point[]{p};
    }
}
