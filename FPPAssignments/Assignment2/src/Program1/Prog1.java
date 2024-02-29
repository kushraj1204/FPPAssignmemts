package Program1;

public class Prog1 {
    public static void main(String[] args) {
        int x= RandomNumbers.getRandomInt(1,9);
        double piPowX=Math.pow(Math.PI,x);
        System.out.println("π power x :"+piPowX);

        int y= RandomNumbers.getRandomInt(3,14);
        double yPowPi=Math.pow(y,Math.PI);
        System.out.println("y power π :"+yPowPi);
    }
}




