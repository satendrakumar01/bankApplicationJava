import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    private String name;
   private String accountNo;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
//        bank has initialzied
        this.rateOfInterest=6.5;




        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    private static double rateOfInterest;

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {

        balance=balance+amount;
        return "Money Added sucsscssfully are you able to see the updated balance :" +balance;
    }

    @Override
    public String withDrawMoney(int amount, String enterdPassword) {
        if(Objects.equals(enterdPassword,password)){

            if(amount>balance){
                return "Sorry you have insuffcient amount in your bank account !";
            }
            else {
                balance=balance-amount;
                return "Current account balance is :"+balance;
            }

        }else{
            return "Wrong Password Try Agian !";
        }

    }

    @Override
    public double calculateInterest(int years) {


        return (balance*years*rateOfInterest)/100;
    }
}
