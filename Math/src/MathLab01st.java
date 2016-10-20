// MathLab01st.java
// The Geometry Class Program
// This is the student, starting version of the MathLab01 assignment.
// 4 Geometry class methods are provided as an example.
// You need to write the other 20 on your own.


import java.util.Scanner;


public class MathLab01st
{
	public static double side, length, width, height, base1, base2, radius;
	
	public static void main (String args[]) 						
	{   
		System.out.println("\nMathLab01\n\n");
		enterData();
		display2DPerimeters();
		display2DAreas();
		display3DSurfaceAreas();
		display3DVolumes();			
	}
	
	public static void enterData() 						
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Side     ===>>  ");										
		side = input.nextDouble();
		System.out.print("Enter  Length   ===>>  ");										
		length = input.nextDouble();
		System.out.print("Enter  Width    ===>>  ");										
		width = input.nextDouble();
		System.out.print("Enter  Height   ===>>  ");										
		height = input.nextDouble();
		System.out.print("Enter  Base1    ===>>  ");										
		base1 = input.nextDouble();
		System.out.print("Enter  Base2    ===>>  ");										
		base2 = input.nextDouble();
		System.out.print("Enter  Radius   ===>>  ");										
		radius = input.nextDouble();
	}

// Remove comments from the println statements below as you complete each of the methods of the Geometry class.
// Leave comments in place for any methods that you have not finished.

	public static void display2DPerimeters() 						
	{	
		System.out.println("\n\nPerimeters of 2D Shapes");
		System.out.println("=====================================================");
		System.out.println("Square Perimeter:                 " + Geometry.squarePerimeter(side));
		System.out.println("Pentagon Perimeter:               " + Geometry.pentagonPerimeter(side));
		System.out.println("Hexagon Perimeter:                " + Geometry.hexagonPerimeter(side));
		System.out.println("Octagon Perimeter:                " + Geometry.octagonPerimeter(side));
		System.out.println("Rectangle Perimeter:              " + Geometry.rectanglePerimeter(length,width));
		System.out.println("Circle Perimeter (circumference): " + Geometry.circumference(radius));
		System.out.println("\n");
	}
	
	public static void display2DAreas() 						
	{	
		System.out.println("Areas of 2D Shapes");
		System.out.println("=====================================================");
		System.out.println("Square Area:                      " + Geometry.squareArea(side));
		System.out.println("Rectangle Area:                   " + Geometry.rectangleArea(length,width));
		System.out.println("Parallelogram Area:               " + Geometry.parallelogramArea(base1,height));
		System.out.println("Triangle Area:                    " + Geometry.triangleArea(base1,height));		
		System.out.println("Trapezoid Area:                   " + Geometry.trapezoidArea(base1,base2,height));
		System.out.println("Hexagon Area:                     " + Geometry.hexagonArea(base1,base2,height));
		System.out.println("Circle Area:                      " + Geometry.circleArea(radius));
		System.out.println("\n");
	}



	public static void display3DSurfaceAreas() 						
	{	
		System.out.println("Surface Areas of 3D Shapes");
		System.out.println("=====================================================");
		System.out.println("Cube Surface Area:                " + Geometry.cubeSurfaceArea(side));
		System.out.println("Square Prism Surface Area:        " + Geometry.squarePrismSurfaceArea(side,height));
		System.out.println("Rectangular Prism Surface Area:   " + Geometry.rectangularPrismSurfaceArea(length,width,height));
		System.out.println("Sphere Surface Area:              " + Geometry.sphereSurfaceArea(radius));
		System.out.println("\n");
	}
	
	public static void display3DVolumes() 						
	{	
		System.out.println("Volumes of 3D Shapes");
		System.out.println("=====================================================");
		System.out.println("Cube Volume:                      " + Geometry.cubeVolume(side));
		System.out.println("Square Prism Volume:              " + Geometry.squarePrismVolume(side,height));
		System.out.println("Rectangular Prism Volume:         " + Geometry.rectangularPrismVolume(length,width,height));
		System.out.println("Pyramid Volume:                   " + Geometry.pyramidVolume(side,height));
		System.out.println("Cylinder Volume:                  " + Geometry.cylinderVolume(radius,height));
		System.out.println("Cone Volume:                      " + Geometry.coneVolume(radius,height));
		System.out.println("Sphere Volume:                    " + Geometry.sphereVolume(radius));
		System.out.println("\n");		
	}
}


class Geometry
{
    // 2D Perimeters
	public static double squarePerimeter (double s)                      
	{ 
	    return 4 * s; 
	}
	



	
		
	public static double sphereVolume(double radius) {
		// TODO Auto-generated method stub
		return 4*Math.PI*(radius*radius*radius)/3;
	}






	public static double coneVolume(double radius, double height) {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius)*(height/3);
	}






	public static double cylinderVolume(double radius, double height) {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius)*height;
	}






	public static double pyramidVolume(double side, double height) {
		// TODO Auto-generated method stub
		return (side*side)*(height/3);
	}






	public static double rectangularPrismVolume(double length, double width, double height) {
		// TODO Auto-generated method stub
		return length*width*height;
	}






	public static double sphereSurfaceArea(double radius) {
		// TODO Auto-generated method stub
		return 4*Math.PI*(radius*radius);
	}






	public static double rectangularPrismSurfaceArea(double length, double width, double height) {
		// TODO Auto-generated method stub
		return 2*(length*width)+2*(length*height)+2*(width*height);
	}






	public static double squarePrismSurfaceArea(double side, double height) {
		// TODO Auto-generated method stub
		return 2*(side*side)+4*side*height;
	}






	public static double squarePrismVolume(double side, double height) {
		// TODO Auto-generated method stub
		return (side*side)*height;
	}






	public static double circleArea(double radius) {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius);
	}






	public static double hexagonArea(double base1, double base2, double height) {
		// TODO Auto-generated method stub
		return (base1+base2)*height;
	}






	public static double trapezoidArea(double base1, double base2, double height) {
		// TODO Auto-generated method stub
		return (base1+base2)/2*height;
	}






	public static double triangleArea(double base1, double height) {
		// TODO Auto-generated method stub
		return (base1*height)/2;
	}






	public static double parallelogramArea(double base1, double height) {
		// TODO Auto-generated method stub
		return base1*height;
	}






	public static double rectangleArea(double length, double width) {
		// TODO Auto-generated method stub
		return length*width;
	}






	public static double circumference(double radius) {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}






	public static double rectanglePerimeter(double length, double width) {
		// TODO Auto-generated method stub
		return (2*length) + (2*width);
	}






	public static double octagonPerimeter(double side) {
		// TODO Auto-generated method stub
		return 8*side;
	}






	public static double hexagonPerimeter(double side) {
		// TODO Auto-generated method stub
		return 6*side;
	}






	public static double pentagonPerimeter(double side) {
		// TODO Auto-generated method stub
		return 5*side;
	}






	// 2D Areas
	public static double squareArea (double s)             
	{ 
	    return s * s; 
	}
	




    // 3D Surface Areas
	public static double cubeSurfaceArea (double s)                      
	{ 
	    return 6 * s * s; 
	}
	
	
	
	
	
	// 3D Volumes
	public static double cubeVolume (double s)             
	{ 
	    return s * s * s; 
	}
	
	
	
	

	
}

	
	