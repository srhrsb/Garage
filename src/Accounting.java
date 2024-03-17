public class Accounting {
    private double cash; //Kasse
    public Accounting( double cash){
        this.cash = cash;
    }

    public boolean withdrawMoney( double amount ){
        if(cash - amount >= 0){//ist genug Geld da?
            cash -= amount; // ja => abziehen
            return true;
        }
        //nein nicht genug Geld
        return false;
    }

    public void addMoney( double amount ){
        cash += amount;
    }

    public double getBalance(){
       return cash;
    }

}
