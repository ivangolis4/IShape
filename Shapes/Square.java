public class Square implements Shape{
    private int sides;

    public Square(int sides){
        this.sides = sides;
    }

    @Override
    public double Area() {
        return sides * sides;
    }
    
}
