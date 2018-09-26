/**
 * DID EXTRA CREDIT #1 and #2
 * @author Mark Goldstein
 */

public class Depositor {
	//data members of Depositor object
	private Name nameOnAcc = new Name(); 
	private String socSec;

	//Default constructor for Depositor
	public Depositor()
	{
		 nameOnAcc = new Name();
		 socSec = "none";
	}
	
	//Constructor for Depositor object with attributes being passes
	public Depositor(String first, String last,String soc){
		nameOnAcc = new Name(first, last);
		socSec = soc;
	}
	
	//Social security setter
	public void setSocSec(String s) 
	{
		socSec = s;
	}

	/*Setter for name on account via data member 
	 *Object Name's instantiated "nameOnAcc"
	 *To set the name.
	 */
	public void setNameOnAcc(String first, String last) 
	{
		nameOnAcc.setFirst(first);
		nameOnAcc.setLast(last);
	}
	
	//Object getters
	public String getSocSec() 
	{
		return socSec;
	}
	public Name getNameOnAcc()
	{
		return nameOnAcc;
	}

}
