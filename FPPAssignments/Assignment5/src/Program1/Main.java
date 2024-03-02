package Program1;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Rectangle rect1 = new Rectangle("RED", 5, 6);
        shapes[0] = rect1;
        Square sq1 = new Square("BLUE", 6);
        shapes[1] = sq1;
        Circle cir1 = new Circle("BLACK", 4.2);
        shapes[2] = cir1;
        Rectangle rect2 = new Rectangle("GREEN", 3.7, 5.8);
        shapes[3] = rect2;
        Square sq2 = new Square("PURPLE", 2);
        shapes[4] = sq2;


        printTotal(shapes);

    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape s : shapes) {
            totalArea = totalArea + s.calculateArea();
            totalPerimeter = totalPerimeter + s.calculatePerimeter();
        }
        System.out.println("Total Area is: " + totalArea);
        System.out.println("Total Perimeter is: " + totalPerimeter);
    }
}