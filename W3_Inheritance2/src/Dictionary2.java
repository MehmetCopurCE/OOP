
public class Dictionary2 extends Book2 {
	
	private int definitions = 60000;  // we defined a new variable as private

	public Dictionary2(int numpages, int numDefinitions) {  // we use super to use constructor
		super(numpages);
		definitions = numDefinitions;
	}
	
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
