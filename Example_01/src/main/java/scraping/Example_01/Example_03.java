package scraping.Example_01;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

public class Example_03 {

	public static void main(String[] args) throws IOException {

		// ================================================================================================

		// String htmlString = "<html><head><title>My title</title></head>"
		// +"<body>Body content</body></html>";
		//
		// Document doc = Jsoup.parse(htmlString);
		// String title = doc.title();
		// String body = doc.body().text();
		//
		// System.out.printf("Title: %s%n", title);
		// System.out.printf("Body: %s", body);

		// ================================================================================================

		// String fileName = "D:/Eclipse
		// Proyectos/workspace/Scraping/Example_01/file.html";
		//
		// Document doc = Jsoup.parse(new File(fileName), "utf-8");
		// Element divTag = doc.getElementById("mydiv");
		//
		// System.out.println(divTag.text());

		// ================================================================================================

		// String url = "https://as.com/";
		//
		// Document doc = Jsoup.connect(url).get();
		// String title = doc.title();
		// System.out.println(title);

		// ================================================================================================
		//
		// String webPage = "https://as.com/";
		//
		// String html = Jsoup.connect(webPage).get().html();
		//
		// System.out.println(html);

		// ================================================================================================

		// String url = "http://www.jsoup.org";
		//
		// Document doc = Jsoup.connect(url).get();
		//
		//// String description =
		// doc.select("meta[name=description]").first().attr("content");
		// String description =
		// doc.select("meta[name=description]").attr("content");
		// System.out.println("Descripción: " + description);
		//
		//// String keywords =
		// doc.select("meta[name=keywords]").first().attr("content");
		// String keywords = doc.select("meta[name=keywords]").attr("content");
		// System.out.println("Keywords: " + keywords);

		// ================================================================================================

		// String url = "https://jsoup.org";
		//
		// Document document = Jsoup.connect(url).get();
		// Elements links = document.select("div[class]");
		//
		// System.out.println(links.toString() + "\nTERMINA LO QUE CONTIENE
		// LINK");
		//
		// for (Element link : links) {
		// System.out.println("link : " + link.attr("class"));
		// System.out.println("text : " + link.text());
		//
		// }

		// ================================================================================================

		// String htmlString = "<html><head><title>My title</title></head>"
		// + "<body><center>Body content</center></body></html>";
		// //String htmlString = ""; //si queremos que dé válido
		//
		// boolean valid = Jsoup.isValid(htmlString, Whitelist.basic());
		//
		// if (valid) {
		//
		// System.out.println("The document is valid");
		// } else {
		//
		// System.out.println("The document is not valid.");
		// System.out.println("Cleaned document");
		//
		// Document dirtyDoc = Jsoup.parse(htmlString);
		// System.out.println("Antes de limpiar: " +dirtyDoc.html());
		// Document cleanDoc = new Cleaner(Whitelist.basic()).clean(dirtyDoc);
		//
		// System.out.println("Después de limpiar: " +cleanDoc.html());
		// }

		// ================================================================================================

		Document doc;
		try {

			// get all images
			// doc = Jsoup.connect("http://x-hub.io").get();
			doc = Jsoup.connect("https://as.com").get();
			Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			for (Element image : images) {

				System.out.println("\nsrc : " + image.attr("src"));
				System.out.println("height : " + image.attr("height"));
				System.out.println("width : " + image.attr("width"));
				System.out.println("alt : " + image.attr("alt"));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
