public class Credit extends Account{
    private final double limit;
    Credit(double limit){
        this.limit = limit;
        setBalance(limit);
    }
    @Override
    public boolean deposit(double _amount) {
        if (_amount<=0){ //checks if deposit is greater than 0 or not
            System.out.println("You need to deposit more than $0 to your balance.");
            return false;
        }
        if ((getBalance()+_amount)>limit){
            System.out.println("You're trying to deposit too much into your credit account.");
            return false;
        }
        setBalance(getBalance()+_amount);
        return true;
    }
    @Override
    public boolean withdraw(double _amount) {
        if (_amount <= 0) { //checks if withdrawal is above 0 or not
            System.out.println("You need to withdraw more than $0.");
            return false;
        }
        if (_amount>getBalance()) { //checks if withdrawal amount is higher than credit balance
            System.out.println("You're trying to withdraw more than the remaining balance.");
            return false;
        }
        if ((getBalance()-_amount)>limit){ //checks if trying to withdraw too much
            System.out.println("You're trying to withdraw more than your limit will allow.");
            return false;
        }
        setBalance(getBalance()-_amount);
        return true;
    }

    @Override
    public String toString() {
        String content = "Remaining credit balance: $"+getBalance() + "\n";
        return content;
    }
}