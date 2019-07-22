//Web-scraper class
import java.io.IOException;
import java.util.Scanner;
import org.jsoup.*;
public class WebScrape {
	
	//test case for quick input search
	public static void main(String[] args) {
		Scanner myWord = new Scanner(System.in);
		String s = webScrape(myWord.next());
		System.out.println(s);
		myWord.close();
	}
	
	public static String webScrape(String input) {
		//connect to dictionary.com
		String url = "http://www.dictionary.com/browse/" + input + "?s=t";
		org.jsoup.nodes.Document doc = null;
		org.jsoup.nodes.Element data;

		try {
			//Initiate connection
		    doc = Jsoup.connect(url).get();
		    System.out.print(doc);
			data = doc.select("div.def-content").first();
			System.out.println(data);
			
			//copy the first sentence found after the word
			String SearchResult = data.toString();
			String output = "";
			char nextChar = ' ' ;
			int i = 0;
			SearchResult = SearchResult.substring(28);
			
			while(nextChar != ':' && nextChar != '.') {
				nextChar = SearchResult.charAt(i);
				output += nextChar;
				i++;
			}
			return output.substring(0,output.length() - 1);
		
		} catch (HttpStatusException e) {
		    System.out.println("Internet connection error (HTTP_ERROR)");		//Internet connection error
		} catch (IOException e) {
			System.out.println("Definition scrape error (IO_ERROR)");			//Page error
		}
		return "";
	}
}

