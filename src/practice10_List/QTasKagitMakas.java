package practice10_List;

import java.util.Scanner;

public class QTasKagitMakas {

	 public static void main(String[] args) {
	        // tas >makas           tas=1
	        // makas >kagit			kagit=2
	        //kagit >tas			makas=3

		 Scanner scan =new Scanner(System.in);
		 
		 int kullanici_puani=0;
		 int bilgisayar_puani=0;
		 
		 String cevap="E";
		 int oyuncu_secimi=0;
		 
		 int count=1;
		 
		 
		 while(cevap.equalsIgnoreCase("E")) {
			 
			 if (count == 1) {

	                System.out.println("\t\t    _______\r\n"
	                        + "\t\t---'   ____)\r\n"
	                        + "\t\t      (_____)\r\n"
	                        + "\t\t      (_____)\r\n"
	                        + "\t\t      (____)\r\n"
	                        + "\t\t---.__(___)\r\n"
	                        + "\t\t\r\n"
	                        + "    _______\r\n"
	                        + "---'   ____)____\r\n"
	                        + "          ______)\r\n"
	                        + "          _______)\r\n"
	                        + "         _______)\r\n"
	                        + "---.__________)\r\n"
	                        + "\r\n"
	                        + "\t\t    _______\r\n"
	                        + "\t\t---'   ____)____\r\n"
	                        + "\t\t          ______)\r\n"
	                        + "\t\t       __________)\r\n"
	                        + "\t\t      (____)\r\n"
	                        + "\t\t---.__(___)");

	                System.out.println("================================================");

	                System.out.println("Tas kagit makas oyununa hos geldiniz  :) ");

	                System.out.println("================================================");

	                System.out.println("1-Tas 2-Kagit 3-Makas");

	                System.out.println("=====================");

	            }
			 System.out.println("Seciminiz");
			 
			 count=0;
			 
			 oyuncu_secimi=scan.nextInt();
			 
			 int bilgisayarin_secimi = (int) (Math.random() * 3);
			 
			 switch(oyuncu_secimi) {
			 case 1:
				 if (bilgisayarin_secimi == 1) {

	                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Berabere");

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "+ bilgisayar_puani);

	                } else if (bilgisayarin_secimi == 2) {

	                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kaybettiniz");

	                    bilgisayar_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " +bilgisayar_puani);

	                } else {

	                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kazandiniz");

	                    kullanici_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "+ bilgisayar_puani);

	                }
				 break;
			 case 2:
				 if (bilgisayarin_secimi == 1) {

	                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kazandiniz");

	                    kullanici_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);

	                } else if (bilgisayarin_secimi == 2) {

	                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Berabere");

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "+ bilgisayar_puani);

	                } else {

	                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kaybettiniz");

	                    bilgisayar_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);

	                }
				 break;
			 case 3:
				 if (bilgisayarin_secimi == 1) {

	                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kaybettiniz");

	                    bilgisayar_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "+ bilgisayar_puani);

	                } else if (bilgisayarin_secimi == 2) {

	                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kazandiniz");

	                    kullanici_puani++;

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);

	                } else {

	                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Berabere");

	                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " + bilgisayar_puani);

	                }
				 break;
			 default:	 
				 System.out.println("Hatali giris yaptiniz, lutfen tekrar deneyiniz");

	                continue;
			 }
			 
			
			 if(kullanici_puani==3) {
				 System.out.println("Oyunu " + kullanici_puani + "-" + bilgisayar_puani + " kazandiniz");
				 
				 System.out.println("=================================================================");

	                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (E / H)");

	                System.out.println("==============================================================");

	                cevap = scan.next();
				 
	                if (cevap.equalsIgnoreCase("E")) {

	                    kullanici_puani = 0;

	                    bilgisayar_puani = 0;

	                    count = 1;						}

			 } else if (bilgisayar_puani == 3) {

	                System.out.println("Oyunu " + bilgisayar_puani + "-" + kullanici_puani + " kaybettiniz");

	                System.out.println("==================================================================");

	                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (E / H)");

	                System.out.println("==============================================================");

	                cevap = scan.next();

	                if (cevap.equalsIgnoreCase("E")) {

	                    kullanici_puani = 0;

	                    bilgisayar_puani = 0;

	                    count = 1;

	                }
				 
		 }
		 
		 
		 
		 
	 }
	 
	 
}

}