package iuh.composite.book;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        
        Drawing drawing = new Drawing();
        drawing.add(triangle1);
        drawing.add(triangle2);
        drawing.add(circle1);
        drawing.add(circle2);
        
        drawing.draw("Red");
        
        drawing.clear();
        
        drawing.add(triangle1);
        drawing.add(circle1);
        drawing.draw("Green");
    }
    
}
