package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	public double getArea() {
		return this.width * this.height / 2;

	}

	public double getPerimeter() {
		return this.width + this.height + Math.sqrt(this.height * this.height + this.width * this.width);
	}

}
