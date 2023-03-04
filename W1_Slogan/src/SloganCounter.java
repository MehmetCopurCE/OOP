
public class SloganCounter {

	public static void main(String[] args) {

		Slogan slg;
		
		//Sloganları tanımlarız
		
		slg = new Slogan("Always be positive");
		System.out.println(slg);
		
		slg = new Slogan("Do not repeat your mistakes");
		System.out.println(slg);
		
		slg = new Slogan("Be patient for success");
		System.out.println(slg);
		
		slg = new Slogan("Always have a second plan");  
		System.out.println(slg);
		
		System.out.println();
		System.out.println("Slogan created : " + Slogan.getCount());  //Slogan sayısını alabilriz
		
	}

}
