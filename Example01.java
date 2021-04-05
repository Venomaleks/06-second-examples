import java.util.Arrays;
import java.util.Scanner;


// ALL THIS IS ALL THE PROGRAMING QUESTIONS 006

public class Example01 {

    public static void main(String[] args){

 ///////////////////////////////////////////////////////////

        /**  // Example 02 Revers array counter as string or in array

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
    
    */


 ///////////////////////////////////////////////////////////

        /**  // Example 03 Palendrom check with scanner or string

    //    whit scanner

        System.out.println("wright a word");

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();


    //    simple string text if palindrom

    //    String word = "noon";

        boolean isPalindrom = true;

        for(int i = 0; i < word.length(); i++){

            System.out.println(word.charAt(i));

            if(word.charAt(i) == word.charAt(word.length()-i-1)){

            }else{

                isPalindrom = false;
            }

        }

        if( isPalindrom ){

            System.out.println("The word is a palindrom!");
            System.out.println(word);

        } else{

            System.out.println("the word is NOT a palindrom!");
            System.out.println(word);
        }

        */


 ///////////////////////////////////////////////////////////

        /**  // Example 04 remove 0 whit 1 element over it

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

        */


 ///////////////////////////////////////////////////////////

        /**  // Example 05 array element counter is 5


        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = {4,5,6,10,12};
        int [] arr2 = {12,32,3,42,5,26};
        int [] arr3 = {21,2,0,12};
 
        boolean arrIs5 = true;

        for(int i = 0; i <= arr3.length; i++){

            if(i == 5){

                arrIs5 = false;

            }else{

                arrIs5 = true;

            }
        }
    
        if(arrIs5){

            System.out.println("naaa fam it ant 5 in length");
        }else{

            System.out.println("this is arr length is 5");
        }

        */
 
 
    }
}