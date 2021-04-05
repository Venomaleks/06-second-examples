import java.util.Scanner;

public class Example03 {

    public static void main(String[] args){

    /** */

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

    }
}