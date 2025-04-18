public record Circle(double radius) implements GeometricForm {

    private static final double pi = 3.14;

    @Override
    public double getArea() {
        double area = pi * (radius * radius);
        return area;
    }


}
