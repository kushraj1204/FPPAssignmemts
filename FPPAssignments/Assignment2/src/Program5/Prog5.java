package Program5;

import java.util.Arrays;

public class Prog5 {

    public static int[] combine(int[] a, int[] b){
        int[] combination=new int[a.length + b.length];
        System.arraycopy(a,0,combination,0,a.length);
        System.arraycopy(b,0,combination,a.length,b.length);
        return combination;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(combine(new int[]{5,6,-4,3,1},new int[]{3,8,9,11})));

    }
}
