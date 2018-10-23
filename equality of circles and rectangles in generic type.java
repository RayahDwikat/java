import java.util.*;
public class generalAreas {

	public static void main(String[] args) {
	
		rectangle r = new rectangle(2, 3);
		circle c = new circle(3);
		
		System.out.println("Same are??:" + equalArea(r, c));
		System.out.println("Same are??:" + equalArea(c, r));
		System.out.println("Same are??:" + equalArea(c, c));
		System.out.println("Same are??:" + equalArea(r, r));

	}
	public static <E extends GeometricObject> boolean equalArea(E rect, E cir){
		return rect.getArea() == cir.getArea();
	}

}

abstract class GeometricObject{
	protected double radius;
	protected double base, height;
	public abstract double getArea();
}
class circle extends GeometricObject{
	public circle(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}
}

class rectangle extends GeometricObject{
	public rectangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public double getArea(){
		return base * height;
	}
}
