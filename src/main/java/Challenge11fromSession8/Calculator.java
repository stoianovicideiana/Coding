package Challenge11fromSession8;

import java.util.Scanner;

public class Calculator {

    //Create a basic calculator that can accept 2 numbers from the user and use them for the following operations: +, -, *, /.
    //Requirements:
    //User should be prompted with a message to enter two numbers for the mathematical operation
    //User should be prompted with a message to enter the operator that he wants to use (+, -, * or /)
    //Consider some validations in case the user doesn’t enter a proper number value
    //The number is too large
    //The format is not the one we expect
    //Any other edge case you can think of
    //Instruct the user what he has to do, with a message, if he finds himself on an edge case
    //After the operation is completed, the user should have the option to either enter 2 other numbers for another mathematical operation, or to exit the program

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter number 2:");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Which operation do you want to perform: +, -, * or /");
        String inputUser = sc.nextLine();

        sc.close();

        double resultAddition = num1 + num2;
        double resultSubtraction = num1 - num2;
        double resultMultiply = num1 * num2;
        double resultDivision = num1 / num2;

        switch (inputUser) {
            case "+":
                System.out.println(resultAddition);
                break;
            case "-":
                System.out.println(resultSubtraction);
                break;
            case "*":
                System.out.println(resultMultiply);
                break;
            case "/":
                System.out.println(resultDivision);
                break;
            default:
                System.out.println("Error from user input, type again");

        }
    }

}
