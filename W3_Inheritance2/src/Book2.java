
public class Book2 {

	protected int pages = 2000;  // we defined our variable as protecteed as visibility
	
	public Book2(int numpages) {  //This time we will use contructor
		pages = numpages;
	}
	
	public void setPages(int numpage) {   // setter
		pages = numpage;
	}
	
	public int getPages() {      //getter
		return pages;
	}
}
