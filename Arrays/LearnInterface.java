interface Shape
{
    int length = 10;
    int breadth = 20;
    double PI = 3.14;
    int radius = 5;
    int base = 20;
    int height = 15;

    void getArea();
}
class Rectangle implements Shape
{
    public void getArea()
    {
        int area = length*breadth;
        System.out.println("Area of rectangle is:"+ area);
    }
}
class Circle implements Shape
{
    public void getArea()
    {
        double area = PI*radius*radius;
        System.out.println("Area of Circle is:"+ area);
    }
}
class Triangle implements Shape
{
    public void getArea()
    {
        double  area = 0.5*base*height;
        System.out.println("Area of Triangle is:"+ area);
        
    }
}
public class LearnInterface
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.getArea();
        Circle obj1 = new Circle();
        obj1.getArea();
        Triangle obj2 = new Triangle();
        obj2.getArea();
        
        
        
    }
}