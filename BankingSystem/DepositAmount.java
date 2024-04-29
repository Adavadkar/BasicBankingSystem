package BankingSystem;

public class DepositAmount 
{
    private String customerName;
    private double accountNumber;
    private double amount;
    private double accountbalance;
    public DepositAmount(String customerName, double accountNumber, double amount, double accountBalance) 
    {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountbalance = accountBalance;
    }
    public  String getCustomerName() {
        return customerName;
    }
    public  double getAccountNumber() {
        return accountNumber;
    }
    public double getAmount() {
        return amount;
    }
    public void setCustomerName(String cName) {
        this.customerName = cName;
    }
    public void setAccountNumber(double cNumber) {
        this.accountNumber = cNumber;
    }
    public void setAmount(double camount) {
        this.amount = camount;
        this.accountbalance += camount;
        System.out.println("Account balance after deposit is :"+ accountbalance);

    }
    

    
}

