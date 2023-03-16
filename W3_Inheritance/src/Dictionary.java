
public class Dictionary extends Book{

	private int definitions = 60000;  // we defined a new variable as private
	
	
	public double computeRatio() {    // we can get the number of definitions per pages
		return  (double) definitions/pages;
	}
	
	public void setDefinitions(int def) {  // setter
		definitions = def;
	}
	
	public int getDefinitions() {   //getter
		return definitions;
	}
}
