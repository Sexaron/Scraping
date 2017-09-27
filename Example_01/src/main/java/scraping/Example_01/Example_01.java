package scraping.Example_01;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class Example_01 {
	public static void main(String[] args) throws Exception {

		// String url = "https://stackoverflow.com/questions/2835505";
		// Document document = Jsoup.connect(url).get();
		//
		// String text = document.select("link").first().toString();
		// System.out.println(text);
		//
		// Elements links = document.select("a");
		// for (Element link : links) {
		// System.out.println(link.attr("href"));
		
		String url = "https://as.com";
		Document document = Jsoup.connect(url).get();
		
		
		Elements titulo = document.select("a");
		
		for(Element dato:titulo){
			System.out.println(dato.attr("href"));
		}
		
	}
}
