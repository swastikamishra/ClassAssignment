package OOPsconcepts;
class People
{
	int id;
	String name, address;
	
	public People (int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display ()
	{
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		
	}
}
	class StudentDetails extends People
	{
		float marks;
		public StudentDetails(int id,String name,String address,float marks) 
		{
			super(id,name,address);
			this.marks=marks;
		}
		
		void getData()
		{
			super.display();
			System.out.println("marks: "+marks);
		}
	}

public class InheritanceSuper {
	public static void main (String []args)
	{
		StudentDetails obj=new StudentDetails(1,"Swastika","Mumbai",90f);
		obj.getData();
	}

}
