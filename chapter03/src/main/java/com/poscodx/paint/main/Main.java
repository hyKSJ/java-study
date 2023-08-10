package com.poscodx.paint.main;

import com.poscodx.paint.i.Drawable;
import com.poscodx.paint.point.ColorPoint;
import com.poscodx.paint.point.Point;

//import com.poscodx.paint.shape.Circle;
//import com.poscodx.paint.shape.Rect;
//import com.poscodx.paint.shape.Shape;
//import com.poscodx.paint.shape.Triangle;

import com.poscodx.paint.shape.*;
import com.poscodx.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10,20);
//		point1.setX(10);
//		point1.setY(10);
		
		draw(point1);
//		point1.disappear();
		point1.show(false);
		
//		ColorPoint point2 = new ColorPoint();
		// 업캐스팅
		Point point2 = new ColorPoint();
		point2.setX(20);
		point2.setY(20);
		
		// 다운캐스팅 명시적으로 표현dsa
//		ColorPoint p = (ColorPoint) point2;
		
		((ColorPoint)point2).setColor("red");
		draw(point2);
		
		Rect rect = new Rect();
		draw(rect);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Circle circle = new Circle();
		draw(circle);
		
		draw(new GraphicText("Hello World"));
		
		// instanceof 연산자 test
		
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Object);
		
		// 오류: 연산자 우측항이 클래스인 경우,
		//      레퍼런스 하고 있는 클래스 타입의 hierachy 상의 하위와 상위만
		//      instanceof 연산자를 사용할 수 있다.
//		System.out.println(circle instanceof Rect);

		// 연산자 우측항이 인터페이스인 경우,
		// hierachy 상관없이(애초에 hierachy 관계도 아님) instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint(Point point) {
//		point.show(true);
//	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}

//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	
}
