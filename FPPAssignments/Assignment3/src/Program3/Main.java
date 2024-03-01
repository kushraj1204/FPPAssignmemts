package Program3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");
        String str=sc.nextLine();
        switch(str){
            case "C":
                System.out.println("Enter the radius of the circle.");
                Circle circle=new Circle(sc.nextDouble());
                System.out.println("The area of the circle is "+circle.computeArea());
                break;
            case "R":
                System.out.println("Enter the length of the rectangle.");
                double length =sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle.");
                double breadth =sc.nextDouble();
                Rectangle rectangle=new Rectangle(length,breadth);
                System.out.println("The area of the rectangle is "+rectangle.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the triangle.");
                double base =sc.nextDouble();
                System.out.println("Enter the height of the triangle.");
                double height =sc.nextDouble();
                Triangle triangle=new Triangle(base,height);
                System.out.println("The area of the triangle is "+triangle.computeArea());
                break;
            default:
                System.out.println("Invalid option specified");
                break;
        }
    }
}
