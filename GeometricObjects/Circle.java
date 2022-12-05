/*A simple version fo the Circle class */
public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }


  public Circle(String colour, double radius){
	super(colour);
	this.radius=radius;		  
  }
  
  
  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
	
  public String toString() {
    return " Circle\n  Radius: " + radius + "\n  Area: " + getArea() + "\n  Perimeter: " + getPerimeter()+ "\n" + super.toString();
  }
  
}