package Java_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

///        2) Bir class oluþturun, 'Q03' olarak adlandýrýn
//  3) 5 elemanlý bir tamsayý listesi oluþturun
//  4) Elemanlari doðal sýraya koyun
//  5)Konsoldaki son 3 elemanýn karelerinin toplamýný bulun.
//  6) Konsoldaki toplamý yazdýrýn
//  7) 'Fonksiyonel Programlama' kullanýn
	
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
