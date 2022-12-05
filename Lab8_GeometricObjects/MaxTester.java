public class MaxTester {
    public static void main(String[] args) {
        GeometricObject[] shapes = {
                new Circle(9, "orange", 2.5),
                new Rectangle(3, 4),
                new Circle(),
                new Square(),
                new Square(4)
        };

        for (GeometricObject o : shapes) {
            if(o instanceof Colorable){
                ((Colorable) o).howToColor();
            }
        }
    }
}
