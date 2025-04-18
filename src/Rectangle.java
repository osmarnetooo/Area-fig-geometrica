public record Rectangle(double height, double base) implements GeometricForm{

    @Override
    public double getArea() {
        double area = height * base;
        return area;
    }

}
