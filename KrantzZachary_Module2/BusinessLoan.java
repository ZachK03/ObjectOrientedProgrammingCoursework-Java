public class BusinessLoan extends Loan {
    public BusinessLoan(int num, String lName, double amount, int term, double primeRate) {
        super(num,lName,amount,term);
        setRate(primeRate + 3.2);
    }

    public String toString() {
        String result;
        result = "Business " + super.toString();
        return result;
    }
}
