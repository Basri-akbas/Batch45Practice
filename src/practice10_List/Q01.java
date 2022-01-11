package practice10_List;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
	  public static void main(String[] args) {
	        /*
	         * Input olarak verilen listteki isimlerden
	         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
	         *
	         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
	         * OUTPUT : [Veli,Omer]
	         */

		  String list[]={"Ali","Veli","Ayse","Fatma","Omer"};
		  List<String> output=new ArrayList<>();
		  
		  for (String w : list) {
			  
			  if (!(w.contains("a") || w.contains("A"))) {
				  output.add(w);
			}
			
		}

		  System.out.println(output);

	    }


}
