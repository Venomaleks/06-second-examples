import java.util.Arrays;

public class Example04 {

    public static void main(String[] args){

        int [] arr = {1,0,3,5,2};
        int [] arr1 = {3,0,5,0,1};
        int [] arr2 = {4,0,2,1,0};
        int [] arr3 = {1,0,1,1,0};
        int [] arr4 = {3,0,0,4,1};

        int x;

        for(int i = 0; i < arr1.length; i++){
            
            if( arr1[i] == 0){

                i++;

                x = arr1[i];

                i--;

                arr1[i] = x;
            }

        }

        System.out.println(Arrays.toString(arr1));
 
    }
}