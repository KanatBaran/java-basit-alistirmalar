package downcasting;

public class Main {
	
	public static void main(String[] args) {
		
		Kisi kisi_nese= new Ogrenci();
		
		kisi_nese.seslen();
		
		Ogrenci ogrenci_nesne= (Ogrenci) kisi_nese;
		ogrenci_nesne.ders();
		
	}
}
