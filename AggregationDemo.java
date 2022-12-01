package OOPsconcepts;
class UserDetails
{
	int id;
	String name;
	long phoneNo;
	
BankAgg bankAgg; //entity reference i.e aggregation

public UserDetails(int id, String name, long phoneNo, BankAgg bankAgg) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNo = phoneNo;
	this.bankAgg = bankAgg;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public long getPhoneNo() {
	return phoneNo;
}

public BankAgg getBankAgg() {
	return bankAgg;
}

}

public class AggregationDemo {
public static void main(String args [])
{
	BankAgg acc1 = new BankAgg("Ulwe","BOI",8899);
	UserDetails obj = new UserDetails(55,"Swastika",9987293710l,acc1);
	
	System.out.println("ID: "+obj.getId());
	System.out.println("Name: "+obj.getName());
	System.out.println("Phone no : "+obj.getPhoneNo());
	
	System.out.println("Bank name: "+obj.getBankAgg().getBankName());
	System.out.println("Branch name: "+obj.getBankAgg().getBranchName());
	System.out.println("Account no: "+obj.getBankAgg().getAccountNo());
}
}
