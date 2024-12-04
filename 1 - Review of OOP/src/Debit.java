public class Debit extends Account
{
    Debit(){
        super();
    }
    Debit(double promotion){
        setBalance(promotion);
    }
    @Override
    public boolean deposit(double _amount) {
        if (_amount<=0) {
            System.out.println("Deposit failed. Value is less than or equal to 0");
            return false;
        }
        setBalance(getBalance()+_amount);
        /*
        double _balance = getBalance();
        _balance = _balance + _amount;
        setBalance(_balance)
        these 3 lines are the same as line 15
         */
        return true;
    }
    @Override
    public boolean withdraw(double _amount) {
        if (_amount>getBalance()){
            System.out.println("You don't have enough money in your account to withdraw.");
            return false;
        }
        if (_amount<=0){
            System.out.println("You need to withdraw more than $0.");
            return false;
        }
        setBalance(getBalance()-_amount);
        return true;
    }

    @Override
    public String toString() {
        String content = "Current debit balance = $"+getBalance() + "\n";
        return content;
    }
}