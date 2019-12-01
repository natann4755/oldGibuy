package Shape;

public class rectangel extends Shape {
    private double Height;
    private double Width;

    public rectangel( String name, double height, double width) {
        super(name);
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getArea() {
        setArea(Height*Width);
        return Height*Width;
    }
    public double getPerimeter() {
        setPerimeter(Height*2+Width*2);
        return Height*2+Width*2;
    }
}
