import java.util.Arrays;

public class Example02 {

    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        // simpler array print reverse

        for(int i = arr.length-1; i >= 0; i--){

            System.out.print(arr[i] + " ");

        }
        System.out.print("\n");


        // full array reverse
        
        for(int l = arr.length-1; l >= 0; l--){
            
            int x = 0;

            for(int i = 0; i < arr.length; i++){

                x = arr[l];

                if(x >= arr[i]){

                    x = arr[l];

                    arr[l] = arr[i];

                    arr[i] = x;

                    System.out.println(arr[i] + "\t" + arr[l]);

                    x = 0;
                    i = arr.length;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    
    }
}