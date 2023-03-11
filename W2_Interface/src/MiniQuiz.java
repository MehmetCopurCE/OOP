import java.util.Scanner;

public class MiniQuiz {

	public static void main(String[] args) {

		Question q1,q2;  
		String possible;
		
		Scanner scanner = new Scanner(System.in); //gettin input from user
		
		q1 = new Question("Who will be one of the best software developer in future?", "Me");  //creating question
		q1.setComplexity(4);
		
		q2 = new Question("Which sector is more funny? Mobile developer or Web developer? ", "Mobile Developer");
		q2.setComplexity(10);
		
		System.out.println(q1.getQuestion());
		System.out.println("Level " + q1.getComplexity() );
		
		System.out.println("Please enter an answer : ");
		possible = scanner.nextLine();
		
		if (q1.answerIsCorrect(possible)) {
			System.out.println("Correct :)");
		}else {
			System.out.println("No, the correct answer is : " + q1.getAnswer());
		}
		
	}

}
