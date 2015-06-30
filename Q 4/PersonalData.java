import java.util.Date;

public class PersonalData
{
	private Date birthDate;
	private String address;
	private long ssn;
	public PersonalData(Date date,long ssn)
	{
		birthDate=date;
		this.ssn=ssn;
	}
	public PersonalData(int year,int month,int day,long ssn)
	{
		this.birthDate=new Date(year,month,day);
		this.ssn=ssn;
	}

	public Date getBirthDate()
	{
		return birthDate;
	}
	public String getAddress()
	{
		return address;
	}
	public long getSSN()
	{
		return ssn;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
}