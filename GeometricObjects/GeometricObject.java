/** A very simple class to represent shapes*/
public class GeometricObject {
  private String color = "white";
  

  /** Construct a default geometric object */
  protected GeometricObject() {
    
  }

  /** Construct a geometric object with color value */
  protected GeometricObject(String color) {
    this.color = color;
   
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return a description of the shape*/
  public String toString() {
    return "A shape with colour: " + color +"\n";
  }

}