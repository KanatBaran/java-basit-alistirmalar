package koleksiyonlar;

import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList
		 * Birden fazla ayni nesne eklenebilir.
		 * ekleme sirasina gore ekleme yapar.
		 * .size() ile boyutu alinabilir.
		 * .get(index) ile elemana erismek mumkundur.
		 * */
		
		/*
		ArrayList ulkeler= new ArrayList();
		
		ulkeler.add("TURKEY");
		ulkeler.add("Amerika");
		ulkeler.add("Kanada");
		
		for(int i = 0; i < ulkeler.size();  i++)
		{
			System.out.println((i+1) +"." + ulkeler.get(i));
		}
		
		ulkeler.remove(1);
		
		System.out.println("\nSilme islemi yapildi!\n");
		
		for(int i = 0; i < ulkeler.size();  i++)
		{
			System.out.println((i+1) +"." + ulkeler.get(i));
		}*/
		
		/*LinkedList
		 * Hafizada art arda şekilde siralanmaz. 
		 * */
		
		LinkedList evler= new LinkedList();
		
		evler.add("Villa");
		evler.add("Daire");
		evler.add("Mustakil");
		
		for(int i = 0; i < evler.size(); i++)
		{
			System.out.println( (i+1) + "." + evler.get(i));
		}
		
		/*
		 * ArrayList: Dinamik olarak büyüyen bir dizidir. Elemanları birbirine bağlı olarak değil, ardışık bellek bloklarında saklar. Bu nedenle, eleman eklemek veya çıkarmak için diziyi kaydırmak gerekebilir.
			LinkedList: Çift yönlü bir bağlı listedir. Her eleman, bir önceki ve bir sonraki elemanı gösteren referanslara sahiptir. Bu nedenle, eleman ekleme veya çıkarma işlemleri daha hızlıdır çünkü sadece ilgili referansları güncellemek yeterlidir.
		 * */
		
		
		
		
		

	}

}
