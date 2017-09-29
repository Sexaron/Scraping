package scraping.Example_01;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Example_03 {
	
	public static void main(String [] args) throws IOException{
		
		//================================================================================================
		
	//		String htmlString = "<html><head><title>My title</title></head>"
	//				+"<body>Body content</body></html>";
	//		
	//		Document doc = Jsoup.parse(htmlString);
	//		String title = doc.title();
	//		String body = doc.body().text();
	//		
	//		System.out.printf("Title: %s%n", title);
	//		System.out.printf("Body: %s", body);
		
		//================================================================================================
		
		String fileName = "D:/Eclipse Proyectos/workspace/Scraping/Example_01/file.html";
		
		Document doc = Jsoup.parse(new File(fileName), "utf-8");	
		Element divTag = doc.getElementById("mydiv");
		
		System.out.println(divTag.text());
		
		//================================================================================================
		
	}

}
