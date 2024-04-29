package SchoolManagementSystem;
/* This class is responsible to keep track of student details fees paid, name, id, grade */
public class Student 
{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        feesPaid = 0;
        feesTotal = 30000;
    }
    // Not going to alter student name, id, and feesTotal
    /**
     * Going to change students grade, feesPaid hence use set methods for them
     */
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    /**Keep adding fees recieved as argument to feesPaid
     * @param fees is the fees that the student pays
     */
    public void setFeesPaid(int fees) 
    {
        this.feesPaid = fees;
        feesPaid = feesPaid+fees;
        School.setTotalMoneyEarned(feesPaid);
        
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees()
    {
        return feesTotal-feesPaid;
    }

}
