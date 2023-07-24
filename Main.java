import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        System.out.println("pleas enter your first number: ");
        int fristNum = S.nextInt();
        System.out.println("pleas enter your second number: ");
        int secondNum = S.nextInt();

        int SUM = fristNum + secondNum;
        System.out.println("SUM: " + SUM);

        int MUL = fristNum * secondNum;
        System.out.println("MUL: " + MUL);

        int SUB = fristNum - secondNum;
        System.out.println("SUB: " + SUB);

        int DIV = fristNum / secondNum;
        System.out.println("DIVID: " + DIV);

        int MOD = fristNum % secondNum;
        System.out.println("MOD: " + MOD);


        // 2.Write a Java program to convert a given string into lowercase.
        System.out.println("Enter String: ");
        String ST = S.nextLine();

        String StLower = ST.toLowerCase();
        System.out.println("Strint Lower: " + StLower);


        // 3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        System.out.println("Enter String: ");
        String str = S.nextLine();
        System.out.println("Input String: " + str);

        char idx = str.charAt(1);
        System.out.println("Input a number: " + idx);

        // 4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
        System.out.println("pleas enter your number: ");
        int number = S.nextInt();

        if (number % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        // 5.Write a program that checks the role of the user
        System.out.println("pleas enter your Role: ");
        String Role = S.nextLine();

        if (Role.equals("admin")) {
            System.out.println("Welcome admin");
        } else if (Role.equals("superuser")) {
            System.out.println("Welcome superuser");
        } else {
            System.out.println("Welcome user");
        }

        // 6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
        System.out.println("pleas enter your first number: ");
        int FN = S.nextInt();

        System.out.println("pleas enter your second number: ");
        int SN = S.nextInt();

        System.out.println("pleas enter your third number: ");
        int ThN = S.nextInt();

        int result = FN + SN;
        System.out.println(result == ThN);


        // 7.Take three numbers from the user and print the greatest number.

        System.out.println("Enter the 1st number: ");
        int N1 = S.nextInt();

        System.out.println("Enter the 2nd number: ");
        int N2 = S.nextInt();

        System.out.println("Enter the 3rd number: ");
        int N3 = S.nextInt();

        if (N1 >= N2 && N1 >= N3) {
            System.out.println("The greatest: " + N1);
        } else if (N2 >= N1 && N2 >= N3) {
            System.out.println("The greatest: " + N2);
        } else
            System.out.println("The greatest: " + N3);


        // 8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("Enter number: ");
        int num = S.nextInt();

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}


