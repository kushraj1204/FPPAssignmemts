package Program2;

public class DigitCount {
    public static int countNoOfDigits(int number){
        if(number==0)
            return 0;
        else{
            int count=1+countNoOfDigits(number/10);
            return count;
        }
    }

    public static void main(String[] args) {
        int digitCount=countNoOfDigits(34543787);
        System.out.println("No of digits is "+digitCount);
    }
}
