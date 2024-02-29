package Program6;


public class Prog6 {

    /**
     returns 0 for null array and array with 0 elements
     */
    public static int min(int[] arrayOfInts) {
        int min = 0;
        if (arrayOfInts == null) {
            return min;
        }
        if (arrayOfInts.length > 0) {
            min = arrayOfInts[0];
        }
        for (int arrayOfInt : arrayOfInts) {
            if (arrayOfInt < min) {
                min = arrayOfInt;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("Minimum number is " + min(a));
    }
}
