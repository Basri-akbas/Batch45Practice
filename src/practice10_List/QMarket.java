package practice10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program yaz�n�z.
	 * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
	 *
	 * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)
	 * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
	 * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.
	 * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n.
	 * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun.
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
	 * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun.
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.
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
		
		System.out.println("Haftalik ortalama kazanciniz="+getOrtalamaKazanc()+"�kadardir");
		getOrtalamaninUstundeKazancG�nleri();
		getOrtalamaninAltindaKazancG�nleri();

		scan.close();

	}

	private static void getOrtalamaninAltindaKazancG�nleri() {
		for(int i=0;i<7;i++) {
			if(gunlukKazanclar.get(i)<getOrtalamaKazanc()) {
				System.out.println("Ortalama kazancin altindaki gunler="+gunler.get(i));
			}
		}
		
	}

	private static void getOrtalamaninUstundeKazancG�nleri() {
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
