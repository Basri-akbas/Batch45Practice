package practice10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

		urunListesi.add("Portakal");urunListesi.add("Elma");urunListesi.add("Uzum");urunListesi.add("Domates");urunListesi.add("Biber");
		urunFiyatlari.add(2.99);urunFiyatlari.add(1.99);urunFiyatlari.add(1.59);urunFiyatlari.add(0.99);urunFiyatlari.add(1.99);
		Scanner scan=new Scanner (System.in);
		
		int secim=0;
		do {
			System.out.println("Lutfen almak istediginiz urunu seciniz cikmak icin cikisi seciniz"+"\n"+"1=Portakal"+"\n"+"2=Elma"+
													"\n"+"3=Uzum"+"\n"+"4=Domates"+"\n"+"5=Biber"+"\n"+"6=Cikis"+"\n");
			secim=scan.nextInt();
			if(secim!=6) {
				System.out.println("Kac kilo almak istersiniz ");
				int kilo=scan.nextInt();
				
				toplanOdenecekTutar+=hesaplama(urunFiyatlari.get(secim-1),kilo);

				
					System.out.println("Devam etmek istiyormusunuz  E & H");
					String str=scan.next().toUpperCase();
					if(str.equals("E")) {
						continue;
					}else {
						secim=6;
						
					}
			}else {
				secim=6;
			}
			
		} while (secim!=6);
		System.out.println("Toplam tutar= "+toplanOdenecekTutar+"$");
		scan.close();

	}
	public static double hesaplama(double  secim,int kilo) {
		double toplam=secim*kilo;
		return toplam;
	}
	
}
