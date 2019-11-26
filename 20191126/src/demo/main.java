package demo;
interface Shape
{
	abstract double getArea();
}


class Rectangle implements Shape
{
	double length;
	double width;
	public Rectangle(double l ,double w)
	{
		length=l;
		width=w;
	}
	public double getArea()
	{
		return length*width;
	}
	public String toString()
	{
		return "Area"+ getArea();
	}
}



class Triangle implements Shape
{
	double base;
	double height;
	public Triangle(double l ,double w)
	{
		base=l;
		height=w;
	}
	public double getArea()
	{
		return base*height/2;
	}
	public String toString()
	{
		return "Area"+ getArea();
	}
}




public class main {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(5,10);
		rect.getArea();
		System.out.println(rect);
		Triangle tria=new Triangle(5,10);
		System.out.println(tria);
	}

}
