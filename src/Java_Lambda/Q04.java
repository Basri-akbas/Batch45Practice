package Java_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
	  //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" ��elerini i�eren bir Dize listesi olu�turun
 
//  5) Farkl� ��eleri se�in
//  6)Karakter say�s�na g�re do�al s�raya koyun
//  7) T�m ��eleri b�y�k harfe d�n��t�r�n
//  8) Konsoldaki ��eleri yazd�r�n
//  9)Fonksiyonel Programlama'y� kullan�n
//  */
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("John");	
		list.add("Alexander");
		list.add("Taylor");
		list.add("Ali");
		list.add("Jackson");
		
		// 	4) "J" ile baslayan ��eleri almay�n
		list.stream().filter(t->!t.contains("J")).forEach(System.out::println);
		System.out.println("*********************************************************");
		
		
	}
}
