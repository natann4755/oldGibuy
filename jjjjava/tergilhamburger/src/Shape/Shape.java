package Shape;

public class Shape {
    private double area;
    private double perimeter;
    private String name;

    public Shape(String name) {
        setName(name);
        print();
    }
    private void print (){
        System.out.println(name);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
