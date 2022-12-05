import java.math.*;
public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0, 0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point){
        double x1 = this.x;
        double y1 = this.y;
        double x2 = point.x;
        double y2 = point.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(double x, double y){
        MyPoint temp = new MyPoint(x, y);

        return this.distance(temp);
    }
}
