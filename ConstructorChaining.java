package OOPsconcepts;

class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;
	
	public User (int userId,String firstName,String lastName)
	{
		this.userId=userId;
	    this.firstName=firstName;
	    this.lastName=lastName;
	    
	}
	
	public User (int userId,String firstName,String lastName,String address,long phno)
	{
		this(userId, firstName, lastName);
		this.address=address;
		this.phno=phno;
	}
	public User (int userId,String firstName,String lastName,String address,long phno,String userName,String password)
	{
		this(userId, firstName, lastName,address,phno);
		this.userName=userName;
		this.password=password;
		
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public long getPhno() {
		return phno;
	}

	


	
}

public class ConstructorChaining {
public static void main (String []args ) 
{
	User user1=new User (1,"Swastika","Mishra","Mumbai",9987293710l,"Swastika","swa@123");
	
	
	System.out.println("ID: "+user1.getUserId());
	System.out.println("First Name: "+user1.getFirstName());
	System.out.println("Last Name: "+user1.getLastName());
	System.out.println("Address: "+user1.getAddress());
	System.out.println("Phone Number: "+user1.getPhno());
	System.out.println("User Name: "+user1.getUserName());
	System.out.println("Password: "+user1.getPassword());
	
	System.out.println("======================================================");
	
	User user2=new User (2,"Milli","Mishra");
	

	System.out.println("ID: "+user2.getUserId());
	System.out.println("First Name: "+user1.getFirstName());
	System.out.println("Last Name: "+user1.getLastName());
	
}
}
