public class Student
{
	private String name;
	private long id;
	private double gpa;
	private PersonalData pd;
	public Student(String name,long id,double gpa,PersonalData pd)
	{
		this.name=name;
		this.id=id;
		this.gpa=gpa;
		this.pd = pd;
	}
	public String getName()
	{
		return name;
	}
	public long getID()
	{
		return id;
	}
	public double GPA()
	{
		return gpa;
	}
	public PersonalData getPersonalData()
	{
		return pd;
	}
	public String toString()
	{
		return   "Name: "+name +" ID: "+ id +" GPA: "+gpa;

	}
}