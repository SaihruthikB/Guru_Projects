package selenium.Guru_Projects;

public class Inhertance
{
	public String name;
	public String RollNumber;
	
	
public String Details(String name, String RollNumber)
{
	
	return RollNumber;

	
}

	public static void main(String args[])
	{
		Inhertance n1 = new Inhertance();
		String s1 = n1.Details("hruthik", "10");
		n1.Details(s1, s1);
		System.out.println(s1);
	}
}
 