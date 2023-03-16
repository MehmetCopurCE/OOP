
public class Words2 {

	public static void main(String[] args) {

		Dictionary2 webster = new Dictionary2(1500, 52500);  // we created our object
		
		System.out.println("Number of pages : " + webster.getPages());
		System.out.println("Number of definitions : " + webster.getDefinitions());
		System.out.println("Definitions per page : " + webster.computeRatio());


	}

}
