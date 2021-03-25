import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulations {
    public static Scanner scanner = new Scanner(System.in);
    public static String userInput;


//    public static void inputNumericCheck(){
//        userInput = scanner.nextLine();
//        if(StringUtils.isNumericSpace(userInput))
//            System.out.printf("\"%s\" is a number\n", userInput);
//        else
//            System.out.printf("\"%s\" is not a number\n", userInput);
//    }

    public static void main(String[] args) {
        System.out.print("Enter something: ");
        userInput = scanner.nextLine();
        System.out.printf("You Entered: %s\n", userInput);
        if(StringUtils.isNumericSpace(userInput))
            System.out.printf("\"%s\" is a number\n", userInput);
        else
            System.out.printf("\"%s\" is not a number\n", userInput);
        System.out.printf("Flipped case: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed case: %s\n", StringUtils.reverse(userInput));

    }
}
