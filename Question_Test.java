// Question Test
// Test to ensure questions are assessed correctly
public class Question_Test {
	
	public static void main(String[] args) {
		
		 // Pick the correct answer
		 System.out.println("CORRECT TEST");
		 Question q = new Question("what color is an orange?", "green", "blue", "orange", "purple", "orange");
		 System.out.println(q.getQuestion());
		 q.pick(q.getC()); // pick orange
		 System.out.println("you picked: " + q.getChoice());
		 System.out.println(q.isRight());
		 System.out.println("correct was: " + q.getCorrectChoice());
		 System.out.println(q.printResults());
		 
		 System.out.println("--------------------");
		 
		 // Pick an incorrect answer
		 System.out.println("INCORRECT TEST");
		 System.out.println(q.getQuestion());
		 q.pick(q.getA()); // pick green
		 System.out.println("you picked: " + q.getChoice());
		 System.out.println(q.isRight());
		 System.out.println("correct was: " + q.getCorrectChoice());
		 System.out.println(q.printResults());
	}
}