package OOPsconcepts;
class BankAgg
{
	String bankName,branchName;
	float accountNo;
	
	public BankAgg(String bankName, String branchName, float accountNo) 
	{
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountNo = accountNo;
	}


public String getBankName() {
		return bankName;
	}

public String getBranchName() {
		return branchName;
	}

public float getAccountNo() {
		return accountNo;
	}
}

public class BankAggregation {
	public static void main (String []args)
	{
		BankAgg obj = new BankAgg("Ulwe","BOI",9998);
		System.out.println("Bank Name: "+obj.getBankName());
		System.out.println("Branch Name: "+obj.getBranchName());
		System.out.println("AC Number: "+obj.getAccountNo());
	}

}

