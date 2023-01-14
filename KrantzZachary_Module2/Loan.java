abstract public class Loan implements LoanConstants {
    private int l_num;
    private String l_lastName;
    private double l_amount;
    private double l_rate;
    private int l_term;

    public Loan(int num, String lName, double amount, int term) {
        if(!canCreate(amount)) {
            throw new IllegalArgumentException("Loans must be less than $50,000.");
        }
        setNumber(num);
        setLastName(lName);
        setAmount(amount);
        setTerm(term);
    }

    public String toString() {
        String result;
        result = "Loan ID: " + l_num + ". $" + String.format("%.2f", l_amount) + ", term of " + l_term + " years with rate of " + String.format("%.1f", l_rate) + "% for " + l_lastName + ".";
        return result;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Loan)) {
            return false;
        }
        boolean result = false;
        if((this.getAmount() == ((Loan) obj).getAmount()) && (this.getTerm() == ((Loan) obj).getTerm())) {
            result = true;
        }
        return result;
    }

    public boolean canCreate(double amount) {
        boolean result = false;
        if(amount <= 50000.00) {
            result = true;
        };
        return result;
    }

    public int getNumber() {
        return l_num;
    }

    public void setNumber(int l_num) {
        this.l_num = l_num;
    }

    public String getLastName() {
        return l_lastName;
    }

    public void setLastName(String l_lastName) {
        this.l_lastName = l_lastName;
    }

    public double getAmount() {
        return l_amount;
    }

    public void setAmount(double l_amount) {
        this.l_amount = l_amount;
    }

    public double getRate() {
        return l_rate;
    }

    public void setRate(double l_rate) {
        this.l_rate = l_rate;
    }

    public int getTerm() {
        return l_term;
    }

    public void setTerm(int l_term) {
        if(l_term != lc_long || l_term != lc_medium || l_term != lc_short) {
            l_term = lc_short;
            System.out.println("Invalid term length, defaulting to short-term.");
        }
        this.l_term = l_term;
    }
}
