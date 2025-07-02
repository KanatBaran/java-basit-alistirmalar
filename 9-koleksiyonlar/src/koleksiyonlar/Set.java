package koleksiyonlar;
import java.util.*;

public class Set {

	public static void main(String[] args) {
		
		/*HashSet
		 * Ayni nesneyi bir kere tek ekleyebilirsiniz.
		 * Siralama yapmaz rastgele yerlestirir.
		 
		HashSet h=new HashSet();
		
		h.add("12 str");
		h.add(12);
		h.add("bara");
		h.add(12.0);
		
		//h.remove("12 str");
		
		Iterator iter= h.iterator();
		
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		/* pdf kaynak
		String[] kisiler={"ali", "ahmet", "ali", "mehmet"};
		
		HashSet kume=new HashSet();
		
		for (int i = 0; i < kisiler.length; i++) {
			if (!kume.add(kisiler[i])) {
			System.out.println(kisiler[i]+" zaten kayıtlı!");
			}
		}
		
		System.out.println(kume.size()+" kişi kaydedildi.");
		*/
		
		/*
		String[] kisiler={"B", "C", "D", "F", "H", "K", "L"};
		ArrayList liste=new ArrayList();
		
		for (String kisi : kisiler) {
			liste.add(kisi);
			}
		
		System.out.println(" liste elemanları sıralı.");
		System.out.println(liste);
		
		System.out.println(" rasgele karıştırılmış liste.");
		Collections.shuffle(liste,new Random());
		System.out.println(liste);
		*/
		
		
		/* Linkend HasSet 
		 * siralama yapar. Ekeleme sirasina goredir.
		 * Ayni nesne bir kere tek eklenebilir.
		 * 
		
		LinkedHashSet gunler= new LinkedHashSet();
		
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		
		Iterator iter= gunler.iterator();
		
		int syc = 1;
		while(iter.hasNext())
		{
			System.out.println((syc) + ". " + iter.next());
			syc++;
		}*/
		
		/*TreeSet
		 * Elemanlari buyukluk kucukluk siralamasina gore siralar.
		 * Bizim ekleme sirasina uymaz.
		 * Null deger alınmaz.
		 * */
		
		/*
		TreeSet tree=new TreeSet();
		
		tree.add(10);
		tree.add(3);
		tree.add(51);
		tree.add(11);
		tree.add(1);
		
		Iterator iter= tree.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}*/
		
	

	}

}
