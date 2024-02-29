package Program4;

public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27F, num2 = 3.881F, num3 = 9.6F;
        float sum = num1 + num2 + num3;
        System.out.println(sum);

        int sumInt=(int) sum;
        System.out.println(sumInt);

        int sumRoundInt=Math.round(sum);
        System.out.println(sumRoundInt);
    }
}
