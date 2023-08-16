package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return this.width * this.height;

	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

	
	public void resize(double s) {
		this.width = this.width*s;
		this.height = this.height*s;
		
	};



}
