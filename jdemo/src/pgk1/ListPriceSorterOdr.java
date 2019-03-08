package pgk1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.testng.annotations.Test;

public class ListPriceSorterOdr {

	@Test
	public void firstTest() {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Car");
		al.add("Abc");
		al.add("Zar");
		al.add("Bus");
		al.add("Abc");
		al.add("abc");

//		System.out.println(al);
	    
		Collections.sort(al);
		
		System.out.println("Sorted Array-->"+al);
		/*System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.smartprix.com/");

		TreeSet<String> srtPriceLst = new TreeSet<String>();
		List<WebElement> pricesLst = driver.findElements(By.xpath("//span[@class='price']"));
		for(WebElement s : pricesLst) {

			srtPriceLst.add(s.getText().substring(1));


		}
		System.out.println(srtPriceLst);*/


		/*ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("1");
		al.add("2");
		al.add("zebra");

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Car");
		ts.add("Bus");
		ts.add("Aeroplane");
		ts.addAll(al);


		System.out.println(ts);
		 */

	}
}
