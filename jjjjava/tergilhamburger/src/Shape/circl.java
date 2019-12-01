package Shape;

public class circl extends Shape {
    private double radus;

    public circl(String name, double radus) {
        super(name);
        setRadus(radus);
    }

    public double getRadus() {
        return radus;
    }

    public void setRadus(double radus) {
        this.radus = radus;
    }
    public double getArea() {
        double area = Math.PI*radus*radus;
        setArea(area);
        return area;
    }
    public double getPerimeter() {
        double p=2*radus*Math.PI;
        setPerimeter(p);
        return p;
    }
}
