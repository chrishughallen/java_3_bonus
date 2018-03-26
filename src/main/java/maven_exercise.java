import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class maven_exercise {


    public static String hasVowel(String input) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check if it has any vowels");
        input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ('a') || input.charAt(i) == ('e') || input.charAt(i) == ('i') ||
                    input.charAt(i) == ('o') || input.charAt(i) == ('u')) {
                return input + " contains a vowel";
            }
        }
        return input + " does not contain a vowel";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = scan.nextLine();
        System.out.println("You entered: " + userInput);

        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number");
        }else System.out.println(userInput + " is not a number.");

        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

        System.out.println(hasVowel("test"));

    }

}

