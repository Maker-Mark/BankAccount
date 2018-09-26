/**
 * DID EXTRA CREDIT #1 and #2
 * @author Mark Goldstein
 */
public class Name {

	private String last;
	private String first;
	
	// Default constructor
	public Name() 
	{
		
	}
	// Constructor when first and last name is sent
	public Name(String firstName, String lastName) 
	{
		last = lastName;
		first = firstName;	
	}
	/* 
	 * Setters and Getters for first and last name
	 */
	public void setFirst (String f)
	{
		first = f;
	}
	public void setLast (String l) 
	{
		last = l;
	}

	public String getFirst() 
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}

}

