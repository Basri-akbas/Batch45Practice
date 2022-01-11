package Java_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

///        2) Bir class olu�turun, 'Q03' olarak adland�r�n
//  3) 5 elemanl� bir tamsay� listesi olu�turun
//  4) Elemanlari do�al s�raya koyun
//  5)Konsoldaki son 3 eleman�n karelerinin toplam�n� bulun.
//  6) Konsoldaki toplam� yazd�r�n
//  7) 'Fonksiyonel Programlama' kullan�n
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(12);
		list.add(6);
		list.add(9);
		list.add(15);
		Collections.sort(list);
		
		int toplam=list.stream().skip(2).map(t->t*t).reduce(0,(t,u)->t+u);
		
		System.out.println(toplam);
		
		int toplam1=list.stream().filter(t->list.indexOf(t)>1).map(t->t*t).reduce(0,(t,u)->t+u);
		System.out.println(toplam1);
	}
}
