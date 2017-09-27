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
		
		String primerDato = null;

		// String url = "https://stackoverflow.com/questions/2835505";
		// Document document = Jsoup.connect(url).get();
		//
		// String text = document.select("link").first().toString();
		// System.out.println(text);
		//
		// Elements links = document.select("a");
		// for (Element link : links) {
		// System.out.println(link.attr("href"));
		
		String url = "https://scrapethissite.com/pages/simple/";
		Document document = Jsoup.connect(url).get();
		
		
		//Elements titulo = document.select("a");
	 	
		Elements capitals = document.select(".row .col-md-4.country .country-info");
		
		List<String> datos = new ArrayList<String>();
		for(Element dato:capitals){
			//if(frase.equals(""))
			//System.out.println(dato.attr("href"));
			datos.add(dato.text()+"\n");
		}
		
		for(Element dato:capitals){
			//if(frase.equals(""))
			//System.out.println(dato.attr("href"));
			primerDato = dato.text();
			if(primerDato.equals("[Capital: Andorra la Vella Population: 84000 Area (km2): 468.0"))
				System.out.println("HEMOS ENTRADO");
		}
		
		
		System.out.println(datos);
		
	}
}
