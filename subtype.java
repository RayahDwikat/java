
package subtypeexample;

public class SubTypeExample {

    public static void main(String[] args) {
        circle c = new circle(5);
        rectangle r = new rectangle(10, 20);
        System.out.println(compare(c, r));
        System.out.println(compare(r, c));
        System.out.println(compare(c, c));
    }
    public static <E extends GeometricObject> int compare(E object1, E object2){
        if(object1.area() == object2.area()) return 0;
        else if(object1.area()>object2.area()) return 1;
        else return -1;
    }
}

abstract class GeometricObject{
   protected double radius;
   protected double length;
   protected double width;
   abstract double area();
}

class circle extends GeometricObject{
    public circle(double r){
        radius = r;
    }
    public double area(){
        return radius * radius * 22/7;
    }
}

class rectangle extends GeometricObject{
    public rectangle(double l, double w){
        length = l;
        width = w;
    }
    public double area(){
        return width * length;
    }
}
