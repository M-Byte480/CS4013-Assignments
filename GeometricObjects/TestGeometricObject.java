import java.util.ArrayList;

public class TestGeometricObject{
	public static void main(String[] args){
		GeometricObject geoObj1= new GeometricObject();

		GeometricObject geoObj2= new GeometricObject("Red");
		System.out.println(geoObj2.toString());
		
		Circle circle1= new Circle(1);
		System.out.println(circle1.toString());
		
		Rectangle rect1= new Rectangle(2,2);
		Object milan = new String("This");

		//Without inheritance the following statements aren't possible
		circle1.setColor("Blue");
		System.out.println("Colour of Circle: " + circle1.getColor());
		System.out.println("Colour of Rectangle: " + rect1.getColor());
		
		
		ArrayList<Object> hello = new ArrayList<>();
		hello.add("Kool");
		hello.add(new Integer(12));
		hello.add(new Boolean(true));

		//change constructor in Circle class to use super to invoke super class constructor
		Circle circle2= new Circle("Yellow",10);
		System.out.println(circle2.toString());


		//change toString method in Circle class to invoke toString method in GeometricObject using super
		System.out.println(circle2.toString());

		//what happens at compile time when a method is invoked?
		printShape(geoObj2);

		//to demonstrate polymorphism and dynamic binding; consider what happens when code is compiled and also when it is executed
		printShape(circle1);
		printShape(rect1);
		printShape(circle2);

		/*
		ArrayList<GeometricObject> shapes = new ArrayList<GeometricObject>();
		shapes.add(circle1);
		shapes.add(rect1);
		shapes.add(circle2);
		for(GeometricObject shape: shapes)
			shape.toString();
		*/
	}
	
	public static void printShape(GeometricObject aShape){
		System.out.println(aShape.toString());
	}
}