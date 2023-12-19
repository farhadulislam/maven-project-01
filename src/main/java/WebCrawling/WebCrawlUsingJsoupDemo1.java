package WebCrawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class WebCrawlUsingJsoupDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String url = "";
        crawl(1, url, new ArrayList<>());
    }

    private static void crawl(int level, String url, ArrayList<String> visited){
        if(level<=5){
            Document doc = request(url,visited);
            if (doc != null) {
                for (Element link : doc.select("a[href]")) {
                    String nextUrl = link.absUrl("href");
                    if (!visited.contains(nextUrl)) {
                        crawl(level++, nextUrl, visited);
                    }
                }
            }

        }

    }
    private static Document request(String url, ArrayList<String> visited){
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();
            if(con.response().statusCode() == 200){
                System.out.println("Link : " + url);
                System.out.println(doc.title());
                visited.add(url);
                return doc;
            }
            return  null;

        } catch (Exception e) {
            return null;
        }

    }
}
