public class PersonalLoan extends Loan {
    public PersonalLoan(int num, String lName, double amount, int term, double primeRate) {
        super(num,lName,amount,term);
        setRate(primeRate + 2.7);
    }

    public String toString() {
        String result;
        result = "Personal " + super.toString();
        return result;
    }
}
