import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*; // Only needed if scraping a local File.
import java.util.ArrayList;

public class Scraper {


    public ArrayList<ArrayList<String>> dataTable = new ArrayList<ArrayList<String>>(); //global arraylist

    public Scraper() {

        Document doc = null;

        try {
            doc = Jsoup.connect("https://www.gurufocus.com/stock_list.php").get(); //connects to site
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        Element table = doc.getElementById("R1"); //table id
        Elements rows = table.getElementsByTag("TR"); //tr defines row in cell

        for (Element row : rows) { //loops through table rows
            Elements tds = row.getElementsByTag("TD"); //td defines data in each column

            ArrayList<String> rowList = new ArrayList<String>(); //arraylist list of rows

            for (int i = 0; i < tds.size(); i++) { //loops through size of row
                System.out.println(tds.get(i).text()); //prints data in each column
                rowList.add(tds.get(i).text()); //tds added into rowList array
                //process repeats in for-for until done
            }
            dataTable.add(rowList); //rowList data added into
        }

    }

    public static void main (String args[]) {

        new Scraper();

    }

}
