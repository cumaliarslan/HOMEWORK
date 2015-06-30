public class Test{
	public static void main(String[] args){
		//5 students are created. Let one of them has the ID 5005.
		PersonalData data1= new PersonalData(1982,01,11,234567890);
		PersonalData data2= new PersonalData(1992,10,19,876543210);
		PersonalData data3= new PersonalData(1989,04,27,928374650);
		PersonalData data4= new PersonalData(1993,07,05,819463750);
		PersonalData data5= new PersonalData(1990,11,03,321678950);
		PersonalData data6= new PersonalData(1991,11,11,463728190);
		Student student1=new Student("Ali Cantolu",5005,50,data1);
		Student student2=new Student("Merve Alaca",1234,60,data2);
		Student student3=new Student("Gizem Kanca",5678,70,data3);
		Student student4=new Student("Emel Bozdere",8902,70,data4);
		Student student5=new Student("Merter Kazan",3458,80,data5);

		//A course (let us call it CSE141) with a capacity of 3 is created
		Course CSE141=new Course("CSE141",3);

		//Any 4 of the students is added to CSE141.
		if (!CSE141.addStudent(student1)) System.out.println(student1.toString()+ " is not added");
		if (!CSE141.addStudent(student2)) System.out.println(student2.toString()+ " is not added");
		if (!CSE141.addStudent(student3)) System.out.println(student3.toString()+ " is not added");
		if (!CSE141.addStudent(student4)) System.out.println(student4.toString()+ " is not added");


		//All students of CSE141 are printed on the screen.
        System.out.println("\nAll students of "+CSE141.getCourseName()+": ");
        CSE141.list();

        //The capacity of CSE141 is increased.
        CSE141.increaseCapacity();

        //Remaining 2 students are added to CSE141.
	  	CSE141.addStudent(student4);
	  	CSE141.addStudent(student5);

	  	//All students of CSE141 are printed on the screen.
	  	System.out.println("\nAll students of "+CSE141.getCourseName()+": ");
	  	CSE141.list();

	  	//Student with ID 5005 is dropped from CSE141.
	  	CSE141.dropStudent(student1);

	  	//All students of CSE141 are printed on the screen.
	  	System.out.println("\nAll students of "+CSE141.getCourseName()+": ");
	  	CSE141.list();

	  	//Number of students enrolled to CSE141 is printed.
	  	System.out.println("\nNumber of students enrolled to "+CSE141.getCourseName()+": " + CSE141.getNumberOfStudents());

	  	//Birth year of best student of CSE141 is printed on the screen. (You should use getYear() method of java.util.Date class.)
	  	System.out.println("\nBirth year of best student of CSE141 is "+CSE141.getBestStudent().getPersonalData().getBirthDate().getYear());

	  	//A new course (let us call it CSE142) is created.
	  	Course CSE142=new Course("CSE142");

	  	//All students currently enrolled in CSE141 are added to CSE142. (You should use getStudents() method).
	  	Student[] students = CSE141.getStudents();
	  	for(int i=0;i<CSE141.getNumberOfStudents();i++)
	  		CSE142.addStudent(students[i]);

	  	//All students of CSE141 are removed from the course.
	  	CSE141.clear();

	  	//Student with ID 5005 is dropped from CSE141 and result of the operation is printed on the screen.
	  	System.out.println("\nThe result of the operation 'Student with ID 5005 is dropped from "+CSE141.getCourseName()+"' is: "+CSE141.dropStudent(student1));

	  	//All students of CSE142 are printed on the screen.
	  	System.out.println("\nAll students of "+CSE142.getCourseName()+": ");
	  	CSE142.list();

	  	//Best student of CSE142 is dropped from CSE142.
	  	CSE142.dropStudent(CSE142.getBestStudent());

	  	//All students of CSE142 are printed on the screen.
	  	System.out.println("\nAll students of "+CSE142.getCourseName()+": ");
	  	CSE142.list();

	  	//GPA of youngest student of CSE142 is printed on the screen.
		System.out.println("\nThe Youngest Student's ("+CSE142.getYoungestStudent()+") GPA is "+CSE142.getYoungestStudent().GPA());

	  	//Courses CSE141 and CSE142 are printed on the screen.
	  	System.out.println("\nCourse Information for "+CSE141.getCourseName()+":\n" + CSE141.toString());
	  	System.out.println("\nCourse Information for "+CSE142.getCourseName()+":\n" + CSE142.toString());
	   }
	}