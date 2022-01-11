package practice10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
	  /*
    Kullanýcýdan alýnan bir tamsayýya kadar FIBONACCI dizisi oluþturun.
    1-1-2-3-5-8-13-21-34....
    */

   public static void main(String[] args) {
	   
	   Scanner scan=new Scanner(System.in);
	   
	   List <Integer> list=new ArrayList<>();
	   list.add(1);
	   list.add(1);
	   
	   System.out.println("Lutfen bir sayi giriniz");
	   int sayi=scan.nextInt();
	   
	   int i=0;
	   do {
		   i=list.get(list.size()-2)+list.get(list.size()-1);
		   if(i>sayi) {
			   break;
		   }
			list.add(i);
	} while (i<sayi);
	
	   System.out.println(list);

	   scan.close();
   }
}
