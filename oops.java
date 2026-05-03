import java.util.Scanner;
public class oops {
    public static void main(String[] args) {
        int pin_no=2006;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your pin");
        int pin=sc.nextInt();
        sample o =new sample();
        if(pin_no==pin){
            System.out.println("1.Balance/t2.Deposit");
            System.out.println("Enter your choice(1 or 2): ");
            int choice=sc.nextInt();
            
            if(choice==1){
                System.out.println(o.getbalance());
            }
            else if(choice==2){
                System.out.println("Enter your amount: ");
                double amt=sc.nextDouble();
                o.deposit(amt);
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
        else{
            System.out.println("Incorrect pin");
        }
        }
    }
class sample{
    private double balance=3000;
    double getbalance(){
        return balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
}