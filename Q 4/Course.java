import java.util.Date;
public class Course
{
	private String name;
	private Student[] students;
	private int capacity=40;
	private int numberOfStudents=0;
	public Course(String name)
	{
		this.name=name;
		students = new Student[capacity];
	}
	public Course(String name,int capacity )
	{
		this.name=name;
		this.capacity=capacity;
		students = new Student[capacity];
	}
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	public String getCourseName()
	{
		return name;
	}
	public Student[] getStudents()
	{
		return students;
	}
	public boolean addStudent(Student student)
	{

		if(numberOfStudents==capacity)
			return false;
  		else
  		{
  			for(int i=0;i<numberOfStudents;i++)
  			{
  				if(student.equals(students[i]))
  				return false;
  			}
  			students[numberOfStudents] = student;
  			numberOfStudents++;
  			return true;
  		}
	}
	public boolean dropStudent (Student student)
	{
		for(int i=0;i<numberOfStudents;i++)
		{
			if(student.equals(students[i]))
  			for(int j=i;j<numberOfStudents;j++)
  			students[j]=students[j+1];
  			students[numberOfStudents]=null;
  			numberOfStudents--;
  			return true;
  		}
  		return false;
	}
	public void increaseCapacity()
	{
		Student[] temp = new Student[capacity+5];
  		System.arraycopy(students, 0, temp, 0, students.length);
  		students = temp;
  		capacity+=5;
	}
	public Student getBestStudent()
	{
		Student temp = students[0];
		for(int i=1;i<numberOfStudents;i++)
		{
			if(students[i].GPA() > temp.GPA())
			{
				temp = students[i];
			}
		}
		return temp;
	}
	public Student getYoungestStudent()
	{
		Student temp = students[0];
		for(int i=0;i<numberOfStudents;i++)
		{
			if((students[i].getPersonalData().getBirthDate().compareTo(temp.getPersonalData().getBirthDate()))>0)
			{
				temp=students[i];
			}
		}
		return temp;
	}
	public void clear()
	{
		students = new Student[capacity];
  		numberOfStudents=0;
	}
	public void list()
	{
		for(int i=0;i<numberOfStudents;i++)
  			System.out.print(students[i].toString()+"\n");
	}
	public String toString()
	{
  		String string = "Name:" + name + ", Number Of Students:" + numberOfStudents;
  		for(int i=0;i<numberOfStudents;i++)
  			string+="\n"+(i+1)+". Student's ID:"+students[i].getID();
  		return string;
	}
}