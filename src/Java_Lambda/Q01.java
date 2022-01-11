package Java_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Q01 {
//  2) "Q01" olarak adlandýrýlan bir class oluþturun
//  3) 5 String öðesi içeren bir String listoluþturun.
//  4) 3 tanesi "A" harfi ile baþlayacak
//  5) Elemanlar "A" harfi ile baþlýyorsa ve elemanlarýn uzunluklarý
//  5'ten küçükse, konsolda list olarak buyuk harflerle yazdýrýn.
	
	public static void main(String[] args) {
		
	List<String> list=new ArrayList<String>();
	list.add("Ali");
	list.add("Fatma");	
	list.add("Zeki");
	list.add("Ayse");
	list.add("Abuziddin");
	
	System.out.println(list.stream().filter(t->t.startsWith("A")).filter(t->t.length()<5).map(String::toUpperCase).collect(Collectors.toList()));
		
	}	
	
}
