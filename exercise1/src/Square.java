public class Square extends Shape{
    public Square(double width) {
        super(width, width);
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
