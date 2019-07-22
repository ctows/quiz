// Quiz Load Test
// Test to ensure pairs are properly added to the list
public class QuizLogic_Test {
    
	public static void main(String[] args) {	
		Question q = new Question("what color is an orange?", "green", "blue", "orange", "purple", "orange");
		QuizLogic ql = new QuizLogic();
		
		System.out.println("map.addPair test:");
		ql.addPair(q.getQuestion(), q.getCorrectChoice());
		
		java.util.Iterator<String> words = ql.map.keySet().iterator();
		java.util.Iterator<String> definitions = ql.map.values().iterator();
		
		System.out.println("Question:");
		while(words.hasNext()) {
			System.out.println(words.next());
		}
		
		System.out.println("Answer:");
		while(definitions.hasNext()) {
			System.out.println(definitions.next());
		}
		
		System.out.println("-----------------------");
		System.out.println("Read string 'Hello:World' into map test:");
		ql.readContents("Hello:World");
		
		words = ql.map.keySet().iterator();
		definitions = ql.map.values().iterator();
		
		System.out.println("Question:");
		while(words.hasNext()) {
			System.out.println(words.next());
		}
		
		System.out.println("Answer:");
		while(definitions.hasNext()) {
			System.out.println(definitions.next());
		}
	}
}
