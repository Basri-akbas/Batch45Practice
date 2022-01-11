package Java_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q03 {
	//String isimlerden olusan bir list olusturun

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("Fatma");	
		list.add("Zeki");
		list.add("Ayse");
		list.add("Abuziddin");
		list.add("Ayse");
		
		 //Konsoldaki farkl� ��eleri uzunluklar�yla birlikte yazd�r�n.
		list.stream().distinct().sorted().forEach(t-> System.out.println(t+"="+t.length()));
		System.out.println("*********************************************************");
		
		//Konsoldaki farkl� ��eleri yazd�r�n, uzunluklar�na g�re s�ralay�n.
		list.stream().distinct().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
		System.out.println("*********************************************************");
		
		//Konsoldaki farkl� ��eleri yazd�r�n, son karakterlerine g�re s�ralay�n.
		list.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);
		System.out.println("*********************************************************");
		
		//Konsoldaki farkl� ��eleri ters s�rada yazd�r�n.
		list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("*********************************************************");
		
		//Uzunlu�u 7'den k���k olan farkl� ��eleri ters s�rada konsolda b�y�k harflerle yazd�r�n.
		list.stream().distinct().filter(t->t.length()<7).map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
   
}
