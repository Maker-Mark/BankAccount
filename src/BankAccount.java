/**
 * DID EXTRA CREDIT #1 and #2
 * @author Mark Goldstein
 */

public class BankAccount {
	//data members of BankAccount object
	private Depositor accDet = new Depositor();// name class
	private int accNum;
	private String accType;
	private double accBal;
	
	//Default constructor
	public BankAccount()
	{
		accDet = new Depositor();
		accNum = 0;
		accType = "none";
		accBal = 0.00;
	}
	
	//Constructor for initializing object with values
	public BankAccount(String first, String last, String social,int accountNum,
			String type, double bal) 
	{
		accNum = accountNum;
		accType = type;
		accBal= bal;
		accDet = new Depositor(first, last, social);
		first = accDet.getNameOnAcc().getFirst();
		last = accDet.getNameOnAcc().getLast();
		social= accDet.getSocSec();

	}
	//Method for setting data member accDet,
	//which is of Depositor-object type
	public void setAccDet(String first, String last, String social) 
	{
		accDet.setNameOnAcc(first, last);
		accDet.setSocSec(social);

	}
	
	//Setters and getters for rest of data members
	public void setAccNum(int n) 
	{
		accNum = n;
	}

	public void setAccType(String type) 
	{
		accType = type;
	}

	public void setAccBal(double bal) 
	{
		accBal = bal;
	}

	public double getAccBal() 
	{
		return accBal;
	}

	public String getAccType() 
	{
		return accType;
	}

	public int getAccNum() 
	{
		return accNum;
	}

	public Depositor getAccDet() 
	{
		return accDet;
	}


}
