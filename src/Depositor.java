/**
 * 
 * @author Mark
 *
 */

public class Depositor {
	private Name nameOnAcc = new Name();// depositor
	private String socSec;

	public Depositor(){
		Name nameOnAcc = new Name();
		String socSec = "none";
	}

	public Depositor(String first, String last,String soc){
		nameOnAcc = new Name(first, last);
		socSec = soc;
	}

	public void setSocSec(String s) 
	{
		socSec = s;
	}

	public String getSocSec() 
	{
		return socSec;
	}

	public void setNameOnAcc(String first, String last) 
	{
		nameOnAcc.setFirst(first);
		nameOnAcc.setLast(last);
	}

	public Name getNameOnAcc()
	{
		return nameOnAcc;
	}

}
