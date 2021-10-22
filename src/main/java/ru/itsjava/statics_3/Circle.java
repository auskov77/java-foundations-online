package ru.itsjava.statics_3;

public class Circle extends Figure {
    private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double getCircleLength() {
        return 2 * this.getPI() * radiusCircle;
    }

    public double getRadiusCircle() {
        return radiusCircle;
    }

    @Override
    public String toString() {
        return "Радиус = " + radiusCircle + ", Длина окружности = " + getCircleLength();
    }

    @Override
    void getCircleName(){
        System.out.println("Круг");
    }
}
