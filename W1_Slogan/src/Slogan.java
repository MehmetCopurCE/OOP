
public class Slogan {

	private String message;
	private static int count = 0;
	
	public Slogan( String message) {  //Constructor olusturuyoruz.
		this.message = message;
		count++ ;
	}
	
	public String toString() {   // Messsage ımızı stringe çevirmek için toString() methotu yazdık
		return message;
	}
	
	public static int getCount() {    // Sloganın kaç defa çağırıldığını ya da kullanıldığını görmek için getter ile count u alırız
		return count;
	}
	
}
