//Quiz Logic Class
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class QuizLogic {
		protected static Map<String, String> map;
		
		public QuizLogic() {
			map = new HashMap<String, String>();
		}
		
		public void addPair(String word, String def){
			map.put(word, def);
		}
		
		//reads the text file into the quiz map
		public void readContents(String contents) {
			Scanner s = new Scanner(contents);
			while(s.hasNextLine()) {
				String thisLine = s.nextLine();
				if(thisLine.equals("")) {
					break;
				}
				int delim = thisLine.indexOf(':');
				String word = thisLine.substring(0, delim);
				String def = thisLine.substring(delim+1, thisLine.length());
				map.put(word, def);
			}
			s.close();
		}
		
		//retrieves an answer that is incorrect
		public String randomAnswer(String key) {
			Random random = new Random();
			List<String> keys = new ArrayList<String>(map.keySet());
			String randomKey = map.get(keys.get( random.nextInt(keys.size()) ));
			while (randomKey.equals(key))
				randomKey = map.get(keys.get( random.nextInt(keys.size()) ));
			return randomKey;
		}
		
		public String getValue(String word) {
			return map.get(word);
		}
		
		public void deleteKey(String word) {
			map.remove(word);
		}
			
		public boolean equals(String word){
			return this.equals(word);
		}
		
		public int size() {
			return map.size();
		}
		
		public String toString() {
			return map.keySet().toString() + " " + map.values();
		}
}