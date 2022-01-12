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
	
	
	
	//��rencileri isimlerine g�re yazd�r�n
		private static void ismeGore(String isim) {
			System.out.println("*******isimlerine g�re******************");
			ogListesi.stream().
			filter(t->t.getAd().equalsIgnoreCase(isim)).
			collect(Collectors.toList()).
			forEach(System.out::println);;
		
	}


	//��rencileri belirli bir ya�a ve cinsiyete g�re s�ralayarak listeleyin
	private static void yasaVeCinsiyeteGore(int yas,String cinsiyet) {
		System.out.println("************belirli bir ya�a ve cinsiyete g�re***************");
		ogListesi.stream().
		filter(t->t.getYas()<yas).
		filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
		sorted(Comparator.comparing(Ogrenci::getYas)).
		forEach(System.out::println);
		
	}
	//��rencileri ya�lar�na g�re s�ralayark yazd�rin
	private static void yaslarinaGoreSiralama() {
		System.out.println("****************ya�lar�na g�re*************");
		ogListesi.stream().
		sorted(Comparator.comparing(Ogrenci::getYas).reversed()).
		forEach(System.out::println);
		
	}
	
	
	
	//��renci notlar�n� alt ve �st limitlere g�re s�ralayarak  yazdirin
	private static void notaGoreSirala(int alt,int ust) {
		
		System.out.println("\n============ NOTA G�RE SIRALAMA ============");
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
	ogListesi.add(new Ogrenci("Ay�e", "Can", 21, 82.3, "kad�n"));
	ogListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
	ogListesi.add(new Ogrenci("Ay�e", "Y�lmaz", 40, 45, "kad�n"));
	ogListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
	ogListesi.add(new Ogrenci("Veli", "�zt�rk", 20, 95.5, "erkek"));
	ogListesi.add(new Ogrenci("Selim", "Ya�", 21, 95.5, "erkek"));
}

}
