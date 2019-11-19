package homework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle ct = new CTriangle(3, 4, 5);
		ct.setColor("red");
		ct.show();
	}

}

class CTriangle extends CShape {
	protected double area;

	public CTriangle(double a, double b, double c) {
		area = 0.5 * a * b;
	}

	public void show() {
		System.out.println("area=" + area);
		System.out.println("color="+this.color);
	}
}

abstract class CShape {
	protected String color;

	public void setColor(String str) {
		color = str;
	}

	public abstract void show();
}
