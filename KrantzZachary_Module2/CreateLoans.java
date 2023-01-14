import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        //Array for loans to be stored
        Loan[] loans = new Loan[5];
        double primeRate;
        System.out.println("Enter the current prime interest rate: ");
        primeRate = scan.nextDouble();
        //Loop 5 times for data
        for (int i = 0; i < 5; i++) {
            System.out.println("Creating new loan...");
            int choice = 0;
            //Keep asking for type while choice is not one of the options
            do {
                System.out.println("Select loan type. Enter 1 for Business. Enter 2 for Personal.");
                choice = scan.nextInt();
                if(choice != 1 && choice != 2)
                    System.out.println("Incorrect loan type. Try again.");
            } while (choice != 1 && choice != 2);
            //Get last name
            System.out.println("Enter your last name: ");
            //Extra nextLine() to clear the empty character
            scan.nextLine();
            String lName = scan.nextLine();
            //Keep asking for amount while amount is less than 0 or greater than 50,000
            double lAmount = -1;
            do {
                System.out.println("Enter loan amount: ");
                lAmount = scan.nextDouble();
                if(lAmount > 50000)
                    System.out.println("Cannot have a loan greater than $50,000. Try again.");
            } while (lAmount < 0 || lAmount > 50000);
            //Get term length
            System.out.println("Enter term length. Available options are 3 years, 7 years, and 15 years. Default is 3.");
            int lTerm = scan.nextInt();
            //Switch for the different loan choices
            switch (choice){
                case 1:
                    loans[i] = new BusinessLoan(i, lName, lAmount, lTerm, primeRate);
                    break;
                case 2:
                    loans[i] = new PersonalLoan(i, lName, lAmount, lTerm, primeRate);
                    break;
            }
            //Give overview of created loan
            System.out.println("Loan created: " + loans[i]);
        }
        //Output all loans
        System.out.println("Printing all loans: ");
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
