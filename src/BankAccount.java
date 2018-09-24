import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BankAccount {

	private Depositor accDet = new Depositor();// name class
	private int accNum;
	private String accType;
	private double accBal;

	public BankAccount()
	{
		Depositor accDet = new Depositor();
		accNum = 0;
		accType = "none";
		accBal = 0.0;

	}

	public BankAccount(String first, String last, String social,int accountNum,
			String type, double bal) {

		accNum = accountNum;
		accType = type;
		accBal= bal;
		accDet = new Depositor(first, last, social);
		first = accDet.getNameOnAcc().getFirst();
		last = accDet.getNameOnAcc().getLast();
		social= accDet.getSocSec();

	}

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

	public void setAccDet(String first, String last, String social) 
	{
		accDet.setNameOnAcc(first, last);
		accDet.setSocSec(social);

	}

}
