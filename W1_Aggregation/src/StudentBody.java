
public class StudentBody {

	public static void main(String[] args) {

		// Creating some address and student objects and prints them
		
		Address school = new Address("Tacettin Veli", "Kayseri","TR" , 38840);
		Address aHome = new Address("Fazilet", "Kayseri", "TR", 38000);
		
		Student Ali = new Student("Ali" ,"Yılmaz" , aHome, school);
		
		Address mhome = new Address("Cumhuriyet", "Ankara", "TR", 37000);
		Student Asli = new Student("Aslı", "Dilek", mhome, school);
		
		System.out.println(Ali);
		System.out.println();
		System.out.println(Asli);
	}

}
