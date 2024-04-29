package BankingSystem;

public class WithdrawAmount 
{
    private String custName;
    private Double custAccountNumber;
    private int withdrawAmount;
    private double accBalanceBeforeWithdraw;

    public WithdrawAmount(String cName, Double cNumber, int amount, double initialAccountBalance )
    {
        this.custName = cName;
        this.custAccountNumber = cNumber;
        this.withdrawAmount = amount;
        this.accBalanceBeforeWithdraw = initialAccountBalance;

    }

    public void displayCustomerDetails(DepositAmount obj)
    {
        System.out.println("Account Details in order to Withdraw amount are folllowing:");
        System.out.println("Customer Name is:" + obj.getCustomerName());
        System.out.println("Customer Number  is:" + obj.getAccountNumber());
    }

    public void CheckAccountBalanceAfterWithdraw()
    {
        accBalanceBeforeWithdraw = accBalanceBeforeWithdraw-withdrawAmount;
        System.out.println("Account Balance after Withdraw is:" + accBalanceBeforeWithdraw);
    }

}
