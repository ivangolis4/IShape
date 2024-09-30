public class AreaCalculator {
    Shape shape;

    public AreaCalculator(Shape shape){
        this.shape = shape;
    }

    public double GetArea(){
        return shape.Area();
    }
}
