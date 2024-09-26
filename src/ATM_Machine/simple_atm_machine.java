package ATM_Machine;

//import java.io.*;
//import java.lang.*;
import java.util.*;

class ATM{
    float Balance;
    int PIN=1234;

    public void checkPin(){
        System.out.println("Enter your pin:");
        Scanner sc= new Scanner(System.in);
        int entered_pin =sc.nextInt();
        if(entered_pin==PIN){
            menu();
        }  
        else{
            System.out.println("Enter a valid pin");
        }
        sc.close();
    }

    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc =new Scanner(System.in);
        int option =sc.nextInt();

        if(option==1){
            checkBalance();
        }
        else if(option==2){
            withdrawMoney();
        }
        else if(option==3){
            depositMoney();
        }
        else if(option==4){
            sc.close();
            return;
            
        }
        else{
            System.out.println("Enter a valid choice");
        }
        sc.close();
    }

    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the amount that has to be withdrawn:");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdrawl Successful!!");
        }
        menu();
        sc.close();
    }

    public void depositMoney(){
        System.out.println("Enter the money to be depositted:");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Deposit Successful!!");
        menu();
        sc.close();
    }
}

public class simple_atm_machine {
    public static void main(String[] args){
     ATM obj=new ATM();
     obj.checkPin();
    }
}
