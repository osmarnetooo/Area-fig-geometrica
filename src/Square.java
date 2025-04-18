public record Square(double side) implements GeometricForm{

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

}
