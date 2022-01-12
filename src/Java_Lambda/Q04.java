package Java_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
	  //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öðelerini içeren bir Dize listesi oluþturun
 
//  5) Farklý öðeleri seçin
//  6)Karakter sayýsýna göre doðal sýraya koyun
//  7) Tüm öðeleri büyük harfe dönüþtürün
//  8) Konsoldaki öðeleri yazdýrýn
//  9)Fonksiyonel Programlama'yý kullanýn
//  */
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("John");	
		list.add("Alexander");
		list.add("Taylor");
		list.add("Ali");
		list.add("Jackson");
		
		// 	4) "J" ile baslayan öðeleri almayýn
		list.stream().filter(t->!t.contains("J")).forEach(System.out::println);
		System.out.println("*********************************************************");
		
		
	}
}
