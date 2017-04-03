
abstract public class Mensuration {
	double dim1;
	
	
	abstract void FindArea();
	abstract void Perimeter();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2.00);
		c.FindArea();
		c.Perimeter();
		
		Rectangle r = new Rectangle(5.00,10.00);
		r.FindArea();
		r.Perimeter();
		
		Triangle t = new Triangle(10.00,12.00,5.00,14.00);
		t.FindArea();
		t.Perimeter();
	}

}
class Circle extends Mensuration
{
	double area_of_circle, perimeter_of_circle;
	
	public Circle(double dim1)
	{
		this.dim1=dim1;
	}
	
	@Override
	void FindArea() {
		// TODO Auto-generated method stub
		area_of_circle = 3.14*dim1*dim1;
		System.out.println("Area of circle is :"+area_of_circle);
	}


	@Override
	void Perimeter() {
		// TODO Auto-generated method stub
		perimeter_of_circle = 2*3.14*dim1;
		System.out.println("Perimeter of circle is :"+perimeter_of_circle);
	}
	
}

class Rectangle extends Mensuration
{
	double length,breadth,area,perimeter;
	
	public Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	void FindArea() {
		// TODO Auto-generated method stub
		area = length*breadth;
		System.out.println("The area of Rectangle is :" + area);
	}

	@Override
	void Perimeter() {
		// TODO Auto-generated method stub
		perimeter = 2*(length+breadth);
		System.out.println("Perimeter of the rectangle is :"+perimeter);
	}
	
}

class Triangle extends Mensuration
{

	double base,side1,side2,height,area,perimeter;

	public Triangle(double base,double side1,double side2,double height)
	{
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	@Override
	void FindArea() {
		// TODO Auto-generated method stub
		area = base*height/2;
		System.out.println("Area of the Triangle is :"+area);
	}

	@Override
	void Perimeter() {
		// TODO Auto-generated method stub
		perimeter = base +side1 + side2;
		System.out.println("Perimeter of the triangle is: "+perimeter);
	}
	
}