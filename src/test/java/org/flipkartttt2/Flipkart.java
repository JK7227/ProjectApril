package org.flipkartttt2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.flipkart.pages.Flipkartt2;
import org.test.BaseClass;

public class Flipkart extends BaseClass{
	public static Flipkartt2 f;
	public static void main(String[] args) throws InterruptedException {
	browserLaunch("edge");
	launchUrl("https://www.flipkart.com/");
	maximize();implicityWait(10);
	f=new Flipkartt2();
	click(f.getClosepopup());
	sendKeys(f.getSearchbox(), "Nike shoe");
	click(f.getSearchbtn());
	int size = f.getNike().size();
	System.out.println(size);
	List<String> l1=new ArrayList<String>();
	for (int i = 0; i < size; i++) {
		String name = f.getNike().get(i).getText();
		l1.add(name);
	}
	Thread.sleep(2000);
	System.out.println(l1);
	List<String> l2=new ArrayList<String>();
	for (int i = 0; i < f.getPrice().size(); i++) {
		String price = f.getPrice().get(i).getText();
		String r = price.substring(0, 6);
		String p = r.replace("?", "₹");
	    l2.add(p);
	}
	System.out.println(l2);
	Thread.sleep(2000);
	Map<String, String>m=new LinkedHashMap<String, String>();
	for (int i = 0; i < l1.size(); i++) {
		m.put(l1.get(i), l2.get(i));
	}
	Set<Entry<String, String>> s = m.entrySet();
	for (Entry<String, String> ex : s) {
		System.out.println(ex);
	}
	Collections.sort(l2);
	System.out.println(l2);
	System.out.println(Collections.max(l2));
	System.out.println(Collections.min(l2));

//	quit();	
	}
}
