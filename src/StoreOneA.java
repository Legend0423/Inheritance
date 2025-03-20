public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * 0.1);
        }
        return monthlyPayment;
    }

    @Override
    public String toString() {
        String parentInfo = super.toString();
        String loanDetails = "\nLOAN DETAILS (if applicable):\n" +
                "Loan Amount: " + getLoanAmount() + "\n" +
                "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
                "Interest Rate: " + getINTEREST_RATE() + "\n" +
                "Special Customer: " + specialCustomer + "\n" +
                "Monthly Loan Payment: " + monthlyPayment + "\n";
        return parentInfo + loanDetails;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }
}    