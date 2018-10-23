
package javaapplication97;
import java.util.*;

public class JavaApplication97 {

    public static void main(String[] args) {
        rectangle x = new rectangle(10,20);
        circle m = new circle(30);
        compareGeometricObjects c = new compareGeometricObjects();
        System.out.println(c.compare(x, m));
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

class compareGeometricObjects implements Comparator<GeometricObject>{
    public int compare(GeometricObject o1, GeometricObject o2){
        if(o1.area()<o2.area()) return -1;
        else if(o1.area()>o2.area()) return 1;
        else return 0;
    }
}
