package practice10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
	 * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
	 *
	 * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)
	 * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
	 * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn.
	 * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan aþaðýysa o günleri return yap.
	 * */


	static List<Integer> gunlukKazanclar=new ArrayList<>();
	static List <String> gunler=new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		int i=0;
		int k=0;
		while (i<7) {
			
			System.out.println(gunler.get(k)+" gunki kazanci giriniz");
			int kazanc=scan.nextInt();
			gunlukKazanclar.add(kazanc);
			
			k++;
			i++;
		}
		
		System.out.println("Haftalik ortalama kazanciniz="+getOrtalamaKazanc()+"´kadardir");
		getOrtalamaninUstundeKazancGünleri();
		getOrtalamaninAltindaKazancGünleri();

		scan.close();

	}

	private static void getOrtalamaninAltindaKazancGünleri() {
		for(int i=0;i<7;i++) {
			if(gunlukKazanclar.get(i)<getOrtalamaKazanc()) {
				System.out.println("Ortalama kazancin altindaki gunler="+gunler.get(i));
			}
		}
		
	}

	private static void getOrtalamaninUstundeKazancGünleri() {
		for(int i=0;i<7;i++) {
			if(gunlukKazanclar.get(i)>getOrtalamaKazanc()) {
				System.out.println("Ortalama kazancin ustundeki gunler="+gunler.get(i));
			}
		}
		
	}

	private static double getOrtalamaKazanc() {
		double  kazanc=0;
		for(int i=0;i<7;i++) {
			kazanc=kazanc+gunlukKazanclar.get(i);
		}
		double ortalama=kazanc/7;
		return ortalama;
	}

}
