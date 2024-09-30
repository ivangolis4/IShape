public class Main{

    public static void main(String[]args){
        Shape square = new Square(50);
        Shape rectangle = new Rectangle(50,20);
        Shape circle = new Circle(50);

        AreaCalculator c1 = new AreaCalculator(square);
        AreaCalculator c2 = new AreaCalculator(rectangle);
        AreaCalculator c3 = new AreaCalculator(circle);
         
        System.out.println("Area of Square: " + c1.GetArea());
        System.out.println("Area of Rectangle: " + c2.GetArea());
        System.out.println("Area of Circle: " + c3.GetArea());


    }
}