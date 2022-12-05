public class Square extends GeometricObject implements Colorable{
    double width;

    public Square(){
        this(1.0, "white", 1.0);
    }

    public Square(double width){
        super();
        this.width = width;
    }

    public Square(double width, String color, double weight){
        super(color, weight);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter(){
        return width * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Colour all four sides");
    }

    @Override
    public String toString(){
        return String.format("Square: \n\t- %-9s: %.2f \n\t- Perimeter: %.2f","Area", getArea(), getPerimeter());
    }
}

