import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Hello world!");
//        create User
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name, password, balance to crate an account");
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name, balance, password);

//        add amount
        String messege=user.addMoney(100000);
        System.out.println(messege);


//        withdraw money
        System.out.println("Enter amout you want to withdraw:");
        int money=sc.nextInt();
        System.out.println("Enter your password:");
        String pass=sc.next();
        System.out.println(user.withDrawMoney(money,password));
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println(user.checkBalance());

//        rate of Interest

        System.out.println(user.calculateInterest(10));







        
    }
}