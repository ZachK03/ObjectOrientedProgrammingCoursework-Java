import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DivideNums(scan);
        DivideNums(scan);
    }

    static void DivideNums (Scanner scan) {
        System.out.println("Divide: ");
        int num1 = scan.nextInt();
        System.out.println("By: ");
        int num2 = scan.nextInt();

        try {
            int num3 = num1 / num2;

            System.out.println("Successfully divided: " + num1 + " / " + num2 + " = " + num1 / (float)num2 + ".");
        } catch (ArithmeticException ae) {
            System.out.println("You tried to divide by zero! That's not possible! How could you possibly ever try this? Have you not passed 9th grade?!");
        }
    }
}