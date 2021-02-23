/* @ Author Tobechi Onwenu
 * 
 * Instructor: Prof Siva Jasthi
 * 
 * Lab 6 student.java class for java object oriented
 * 
 * 

*/
public class Student 
{
	// for representing the name of the student
	private String name;

	// for representing the email of the student
	private String email;

	// for representing the age of the student
	private int age;

	/**
	 * Default Constructor For Student Class
	 */
	public Student() 
	{

	};

	/**
	 * Overloded Constructor For Student Class
	 */
	public Student(String a_name, String a_email, int a_age) {
		name = a_name;
		email = a_email;
		age = a_age;
	}
	/**
	 * Set method for the variable name
	 */

	private void setName(String a_name) 
	{
		name = a_name;

	}
	/**
	 * Set method for the variable email
	 */

	private void setEmail(String a_email) 
	{
		email = a_email;

	}
	/**
	 * Set method for the variable age
	 */

	private void setAge(int a_age) 
	{
		age = a_age;

	}
	/**
	 * Get method for the variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get method for the variable email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Get method for the variable age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Returns the String representation of Student object
	 */
	public String toString() {
		String temp = "\nname = " + name + "\nemail = " + email + "\nage = " + age;

		return temp;
	}

	/**
	 * main( ) method for Student Class
	 */
	public static void main(String args[]) {
		// default constructor
		Student student_1 = new Student();
		student_1.setName("Michael Main");
		student_1.setEmail("michaelmain@gmail.com");
		student_1.setAge(23);
		System.out.println(student_1);
		
		Student student_2 = new Student();
		student_2.setName("Susan More");
		student_2.setEmail("susanmore@gmail.com");
		student_2.setAge(22);
		System.out.println(student_2);	

		// overloaded constructor
		Student student_3 = new Student("Liang chan", "liangchang@gmail.com", 24);
		Student student_4 = new Student("Xavier Logan", "Xavierlogan@gmail.com", 25);
		System.out.println(student_3);
		System.out.println(student_4);
	}

}
