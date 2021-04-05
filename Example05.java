

public class Example05 {

    public static void main(String[] args){

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
    }
}