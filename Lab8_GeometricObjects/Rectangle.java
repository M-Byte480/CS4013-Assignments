public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }

  @Override
  public boolean equals(Object r){
    if(r instanceof Rectangle) {
      return (this.height == ((Rectangle) r).height) && (this.width == ((Rectangle) r).width);
    }
    return false;
  }

  @Override
  public String toString(){
    return String.format("Rectangle: \n\t- %-9s: %.2f \n\t- Perimeter: %.2f","Area", getArea(), getPerimeter());
  }
}

