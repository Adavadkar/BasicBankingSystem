package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        Teachers Aditi = new Teachers(101, "Aditi", 500);
        Teachers Melissa = new Teachers(102, "Melissa", 700);
        List<Teachers> teacherslist = new ArrayList<>();
        teacherslist.add(Melissa);
        teacherslist.add(Aditi);

        
        Student Dhaval = new Student(201, "Dhaval");
        Student Dhriya = new Student(202, "Dhriya");
        List<Student> studentslist = new ArrayList<>();
        studentslist.add(Dhaval);
        studentslist.add(Dhriya);
        School conventSchool = new School(teacherslist, studentslist);
        Dhriya.setFeesPaid(10000);
        System.out.println("Convent school has earned" + School.getTotalMoneyEarned());





        
    }
    
}
