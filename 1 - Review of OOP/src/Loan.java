public class Loan extends Account{
    private double loanamount, interest;
    private int years, months;
    Loan(double loanamount, double interest, int years){
        this.loanamount = loanamount;
        this.interest = interest;
        this.years = years;
        this.months = years * 12;
        setBalance(loanamount);
    }
    @Override
    public boolean deposit(double _amount) {
        if (_amount>0){
            setBalance(getBalance() - _amount); //loan will reduce if more is paid off
            return true;
        }
        return false;
    }
    @Override
    public boolean withdraw(double _amount) {
        return false; //can't really withdraw from a loan
    }
    public double MonthlyPayment() {
        double interestRate = (interest / 100) / 12;
        return (loanamount * interestRate) /
                (1 - Math.pow(1 + interestRate, -months));
    }

    @Override
    public String toString() {
        String content = "Monthly Payment: $" + MonthlyPayment() +
                "\nRemaining Balance: $" + getBalance();
        return content;
    }
}
