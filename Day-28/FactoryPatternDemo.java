/* Question 3: Factory Pattern

Create objects without exposing instantiation logic.*/

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        if (type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("circle");
        Shape s2 = ShapeFactory.getShape("rectangle");

        s1.draw();
        s2.draw();
    }
}
