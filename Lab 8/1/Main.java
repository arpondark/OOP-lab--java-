abstract class  Employee{
    protected String name;
    protected int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract void displayDetails();


}

 class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int id) {
        super(name, id);
    }
    public void displayDetails()
    {
        System.out.println("Full-Time-Employee");
     System.out.println(name);
     System.out.println(id);
    }


}

 class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, int id) {
        super(name, id);
    }
    

    
    public void displayDetails()
    {
        System.out.println("Part-Time-Employee");
     System.out.println(this.name);
     System.out.println(this.id);
    }


}

public class Main{
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        employee[0] = new FullTimeEmployee("arpon",100);
        employee[1] = new PartTimeEmployee("arpon1",102);
        for(Employee e:employee)
        {
            e.displayDetails();
        }
    }
}