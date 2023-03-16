
public class Words {

	public static void main(String[] args) {
		
		Dictionary webster = new Dictionary();  // we created our object
		
		System.out.println("Number of pages : " + webster.getPages());
		System.out.println("Number of definitions : " + webster.getDefinitions());
		System.out.println("Definitions per page : " + webster.computeRatio());

	}

}
