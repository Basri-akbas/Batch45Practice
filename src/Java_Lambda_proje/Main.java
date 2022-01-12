package Java_Lambda_proje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

static List<Ogrenci> ogListesi=new ArrayList<Ogrenci>();
	public static void main(String[] args) {
	ogrenciListesi();
	System.out.println("*******************************************************");
	notaGoreSirala(3,5);
	System.out.println("*******************************************************");
	yaslarinaGoreSiralama();
	System.out.println("*******************************************************");
	yasaVeCinsiyeteGore(30,"kadin");
	System.out.println("*******************************************************");
	ismeGore("Ahmet");
	System.out.println("*******************************************************");
}
	
	
	
	//Öðrencileri isimlerine göre yazdýrýn
		private static void ismeGore(String isim) {
			System.out.println("*******isimlerine göre******************");
			ogListesi.stream().
			filter(t->t.getAd().equalsIgnoreCase(isim)).
			collect(Collectors.toList()).
			forEach(System.out::println);;
		
	}


	//Öðrencileri belirli bir yaþa ve cinsiyete göre sýralayarak listeleyin
	private static void yasaVeCinsiyeteGore(int yas,String cinsiyet) {
		System.out.println("************belirli bir yaþa ve cinsiyete göre***************");
		ogListesi.stream().
		filter(t->t.getYas()<yas).
		filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
		sorted(Comparator.comparing(Ogrenci::getYas)).
		forEach(System.out::println);
		
	}
	//Öðrencileri yaþlarýna göre sýralayark yazdýrin
	private static void yaslarinaGoreSiralama() {
		System.out.println("****************yaþlarýna göre*************");
		ogListesi.stream().
		sorted(Comparator.comparing(Ogrenci::getYas).reversed()).
		forEach(System.out::println);
		
	}
	
	
	
	//Öðrenci notlarýný alt ve üst limitlere göre sýralayarak  yazdirin
	private static void notaGoreSirala(int alt,int ust) {
		
		System.out.println("\n============ NOTA GÖRE SIRALAMA ============");
        System.out.println("~~~~~" + alt + "-" + ust + ". siradakileri goster ~~~");
		ogListesi.stream().
							sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).
								skip(alt - 1).
								limit(ust - alt + 1).
								forEach(System.out::println);
		
	}
	private static void ogrenciListesi() {
	ogListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
	ogListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
	ogListesi.add(new Ogrenci("Ayþe", "Can", 21, 82.3, "kadýn"));
	ogListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
	ogListesi.add(new Ogrenci("Ayþe", "Yýlmaz", 40, 45, "kadýn"));
	ogListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
	ogListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "erkek"));
	ogListesi.add(new Ogrenci("Selim", "Yaþ", 21, 95.5, "erkek"));
}

}
