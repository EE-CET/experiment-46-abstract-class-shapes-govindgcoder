abstract class Shape {
    // Abstract method numberOfSides()
  public abstract void numberOfSides(); 
}

// Create class Rectangle extends Shape
// Implement numberOfSides() to print "Rectangle has 4 sides"
class Rectangle extends Shape {
    public void numberOfSides(){
        System.out.print("Rectangle has 4 sides");
    }
}

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"
class Triangle extends Shape {
    public void numberOfSides(){
        System.out.print("Triangle has 3 sides");
    }
}
// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"
class Hexagon extends Shape {
    public void numberOfSides(){
        System.out.print("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String[] args){
        // Create objects for Rectangle, Triangle, and Hexagon
        Rectangle rc = new Rectangle();
        Triangle tr = new Triangle();
        Hexagon hx = new Hexagon();
        // Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
        rc.numberOfSides();
        System.out.print("\n");
        tr.numberOfSides();
        System.out.print("\n");
        hx.numberOfSides();
    }
}
