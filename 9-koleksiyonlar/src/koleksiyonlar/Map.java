package koleksiyonlar;

import java.io.ObjectOutputStream.PutField;
import java.util.*;

public class Map {
	
	public static void main(String[] args) {
		
		
		/*
		 * HashMap
		 * get() ile istenilen veri getirilir.
		 * put(key, value) ile kayit islemi yapilir.
		 * 
		 * Youtube 
		 * */
		
		HashMap baskent=new HashMap();
		
		baskent.put("Türkiye", "Anakara");
		baskent.put("Fransa", "Paris");
		baskent.put("İngiltere", "Londra");
		
		
		int boyut = baskent.size();
		
	}

}
