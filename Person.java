package ObjectOriented;
class Person
{
    String name;
    int age; 
public static void main(String[] args) 
{
    Person obj = new Person();
   
    obj.setName("Dhaval");
    obj.getName();
}

public Person()
{
}
public String getName()
{
 
 System.out.println(name);
    return name;
}
public void setName(String name)
{
    this.name = name;
}

}  






