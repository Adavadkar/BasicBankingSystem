abstract class Employee
{
    abstract void calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee
{
    int payrate = 30;
    int hours = 40;
    public void calculateSalary()
    {
        int salary = payrate*hours;
        System.out.println("Salary of Manager is:"+salary);
    }
    public void displayInfo()
    {
        System.out.println("Manager Name: Aditi Ghadge");
    }

}
class Programmer extends Employee
{
    int payrate = 20;
    int hours = 40;
    public void calculateSalary()
    {
        int salary = payrate*hours;
        System.out.println("Salary of Programmer is:"+salary);
    }
    public void displayInfo()
    {
        System.out.println("Programmer Name: Dhaval Ghadge");
    }
}
public class Abstraction
{
    public static void main(String[] args)
    {
        Manager obj = new Manager();
        Programmer obj1 = new Programmer();
        obj.calculateSalary();
        obj.displayInfo();
        obj1.calculateSalary();
        obj1.displayInfo();

    }
}