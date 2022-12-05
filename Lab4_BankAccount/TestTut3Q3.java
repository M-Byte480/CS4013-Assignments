public class TestTut3Q3 {
	public static void main(String[] args){
		printPerson(new Person("John", "Limerick", "086-1111111", "john@gmail.com"));
		printPerson(new Student("Mary", "Cork", "086-2222222", "mary@gmail.com", 1, "Computer Science"));
		printPerson(new Faculty("Kate", "Galway", "086-3333333", "kate@gmail.com", "CS2-222", 50000, "Monday 14h00-16h00", "Professor"));
		printPerson(new Staff("Martin", "Limerick", "086-4444444", "martin@gmail.com", "CS2-333", 50000, "Senior"));
	}
	
	public static void printPerson(Person p){
		System.out.println(p.toString()+ "\n");	
	}

}