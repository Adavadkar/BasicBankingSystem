package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.t;

public class School 
{
    private List<Teachers> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    
    
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    
    public School(List<Teachers> teachers, List<Student> students) 
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpent = 0;

    }

    public List<Teachers> getTeachers() 
    {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) 
    {
        teachers.addAll(teachers);
        
    }

    public List<Student> getStudents() 
    {
        return students;
    }

    public void setStudents(List<Student> students) 
    {
        students.addAll(students);
    }

    public static int getTotalMoneyEarned() 
    {
        return totalMoneyEarned;
    }

    public static void setTotalMoneyEarned(int MoneyEarned) 
    {
        totalMoneyEarned = totalMoneyEarned + MoneyEarned;
    }

    public int getTotalMoneySpent() 
    {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int moneySpent) 
    {
        totalMoneyEarned = totalMoneyEarned-moneySpent;

    }

    

    
}
