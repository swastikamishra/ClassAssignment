package OOPsconcepts;

class Employee
{
	int id;
	String name,designation;
	double  basicsalary;
	
	public Employee (int id,String name,String designation,double basicsalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicsalary=basicsalary;
	}
	public void display ()
	{
	System.out.println("Id: "+id+" "+"Name: "+name+" "+"Designation: "+designation+" "+"Basic Salary: "+basicsalary);
}
}
public class EmployeeSalary {
	public static void main (String [] args)
	{
		Employee emp1 = new Employee(105,"Swastika","Developer",80000);
		Employee emp2 = new Employee(106,"Sayali","Developer",80000);
		Employee emp3 = new Employee(107,"Priya","Developer",80000);
		
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
