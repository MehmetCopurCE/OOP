
public class Question implements Complexity {
	
	private String question,answer;
	private int complexityLevel;
	
	public Question(String question, String answer) {  //create comstructor
		this.question = question;
		this.answer = answer;
		complexityLevel = 1 ;
	}

	@Override
	public void setComplexity(int complexity) {   //they come with interface
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getComplexity() {
		// TODO Auto-generated method stub
		return complexityLevel;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean answerIsCorrect(String candidateAnswer) { //We check answer is true or not
		return answer.equals(candidateAnswer);
	}
	
	public String toString() {
		return question + "\n" + answer;
	}

	
}
