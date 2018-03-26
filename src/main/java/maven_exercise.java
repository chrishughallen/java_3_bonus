import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class maven_exercise {

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
    }

}

