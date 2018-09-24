
public class Name {

	private String last;
	private String first;

	//private AccName name; //
	/**
	 * making default values for empty constructor
	 */

	public Name() {

	}
	public Name(String firstName, String lastName) {
		last = lastName;
		first = firstName;	
	}
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

