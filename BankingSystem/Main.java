package BankingSystem;

import java.util.Scanner;

public class Main 
{
    private static Scanner sc = new Scanner(System.in);
    static double initialAccountBalance = 1000;
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    { 
        System.out.println("Welcome to National Bank");
        while(true)
        {
            displayMenuOptions();
           String choice = sc.nextLine();

            switch (choice) {
                case "1":
                case "2":
                getCustomerDetails( choice);
                break;
                
                case "3":
                System.out.println("Exiting the application. Thank you for using National Bank");
                System.exit(0);
                break;
            
                default:
                System.out.println("Invalid choice. Please select a valid option");
                break;
            }
        }
            
            
    }

    private static void displayMenuOptions()
    {
        System.out.println("Please choose from anyone of the below menu options:");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Exit");
    }
    
    private static void performDepositAmount(String cName, Double cNumber)
    {
        System.out.println("Enter Amount to be deposited");
        Double camount = sc.nextDouble();
        DepositAmount dpamnt = new DepositAmount(cName, cNumber, camount,initialAccountBalance);
        dpamnt.setAmount(camount);

    }

    private static void getCustomerDetails(String choice)
    {
        try
        {
            System.out.println("Enter Customer Name");
            String cName = sc.nextLine().trim();
            if(cName.matches(".*\\d+.*") || cName.isEmpty())
            throw new IllegalArgumentException("Name must contain only charachters");
            try
            {
                System.out.println("Enter Customer Account Number ");
                Double cNumber = sc.nextDouble();
                if (cNumber.isNaN() || cNumber.equals(0) || cNumber.doubleValue() <= 0)
                throw new IllegalArgumentException("Account number must contain only numbers"); 
                switch (choice) {
                    case "1":
                        performDepositAmount(cName, cNumber);
                        break;
                    case "2":
                        performWithdrawAmount(cName, cNumber);
                        break;
                
                    default:
                        System.out.println("Invalid choice");
                        break;
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
         catch (Exception e) 
        {
            System.out.println(e);
        }
    }

    private static void performWithdrawAmount(String cName, Double cNumber)
    {
        System.out.println("Enter the amount to withdraw from Account");
        int withAmount = sc.nextInt();
        WithdrawAmount wdamount = new WithdrawAmount(cName, cNumber, withAmount, initialAccountBalance);
        wdamount.CheckAccountBalanceAfterWithdraw();
        
    }
}
