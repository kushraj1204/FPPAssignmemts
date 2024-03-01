package Program3;

public class ArrayElementSum {

    public static int getSumOfElements(int[] intArray){
        if(intArray.length==0){
            return 0;
        }
        else{
            int[] subArray=new int[intArray.length-1];
            System.arraycopy(intArray,1,subArray,0,intArray.length-1);
            int sum=intArray[0]+getSumOfElements(subArray);
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] intArr={1,4,6,8,10,11};
        System.out.println("Sum of the elements is "+getSumOfElements(intArr));
    }
}
