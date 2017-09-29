package scraping.Example_01;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Example_02 {
	public static void main02(String[] args) throws Exception {

		String datoAComparar = null;
		
		String url = "https://scrapethissite.com/pages/simple/";
		Document document = Jsoup.connect(url).get();

		Elements elemento = document.select(".row .col-md-4.country");
		
		List<String> array = new ArrayList<String>();
		
		for(Element dato:elemento){
			
			datoAComparar = dato.text();
			if(datoAComparar.contains("Anguilla")){
				
				System.out.println(datoAComparar);
				System.out.println(dato.tagName("span").toString());
				break;
			}
			System.out.println("Aún estamos dentro del for");
		}
		System.out.println("Aún estamos dentro del main");
	}
}
