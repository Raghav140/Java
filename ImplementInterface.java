interface Circle{
    double pi = 3.14;
    double area(double);
}

class Derived implements Circle{

    public double area(double r){
        return pi*r*r;
    }
}
class ImplementInterface{

    public static void main(String ar[]) {
 
        Derived obj = new Derived();
        double circleArea = obj.area(2.5);
        System.out.println("Area of circle is :", +circleArea);
    }
}