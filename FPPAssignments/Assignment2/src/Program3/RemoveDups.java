package Program3;

import java.util.Arrays;

public class RemoveDups {

    public static String[] removeDuplicates(String[] strArray){
        String[] uniqueElementArrayTmp=new String[strArray.length];
        int uniqueNonNullCount=0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i]!=null){
                boolean exists=false;
                for (int j = 0; j < uniqueNonNullCount ; j++) {
                    if(uniqueElementArrayTmp[j].equals(strArray[i])){
                        exists=true;
                        break;
                    }
                }
                if(!exists){
                    uniqueElementArrayTmp[uniqueNonNullCount]=strArray[i];
                    uniqueNonNullCount++;
                }
            }
        }
        String[] uniqueElementArray=new String[uniqueNonNullCount];
        for (int i = 0; i < uniqueNonNullCount; i++) {
            uniqueElementArray[i]=uniqueElementArrayTmp[i];
        }
        return  uniqueElementArray;
    }

    public static void main(String[] args) {
        String[] result=removeDuplicates(new String[]{"horse", "dog", "cat", "horse", "dog"});

        System.out.println("The "+result.length+" non null unique elements are "+Arrays.toString(result));
    }
}
