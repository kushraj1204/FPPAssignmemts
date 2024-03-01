package Program1;

public class ReverseInteger {
    public static void printDigitInReverse(int number){
        if(number==0)
            return;
        else{
            int lastDigit=number%10;
            System.out.println(lastDigit);
            printDigitInReverse(number/10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing digits in Reverse");
        printDigitInReverse(34543);
    }
}
