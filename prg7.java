class Employee{
    protected String name;
    protected double basicSalary;

    public Employee(String name,double basicSalary)
    {
        this.name=name;
        this.basicSalary=basicSalary;
    }

    public double calculateSalary(){
        return basicSalary;
    }
}



class Manager extends Employee{
    private double bonus;
    
    public Manager(String name,double basicSalary,double bonus)
    {
        super(name,basicSalary);
        this.bonus=bonus;
    }

    public double calculateSalary()
    {
        return bonus + basicSalary;
    }
}

class Programmer extends Employee{
    private double overTime;

    public Programmer(String name,double basicSalary,double overTime)
    {
        super(name,basicSalary);
        this.overTime=overTime;
    }

    public double calculateSalary()
    {
        return overTime+basicSalary;
    }

}
public class prg7 {
    public static void main(String[] args) {
    Manager manager=new Manager("karthiekr",10000,5000);
    Programmer programmer=new Programmer("Sambram",15000,10);

    System.out.println("Manager Salary:"+manager.calculateSalary());
    System.out.println("Programmer Salary:"+programmer.calculateSalary());
    }
}
