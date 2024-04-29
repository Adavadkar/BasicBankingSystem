package SchoolManagementSystem;
/** this class is responsible for keeping track of teachers with details like contains id,name, salary
 * 
 */
public class Teachers 
{
    private int id;
    private String name;
    private int salary;
    
    public Teachers(int id, String name, int salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    
}


