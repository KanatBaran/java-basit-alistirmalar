package downcasting;

public class Ogrenci extends Kisi{

	@Override
	public void seslen() {
		System.out.println("Ben ogrenciyim.");
	}
	
	public void ders() {
		System.out.println("Ders calisiyorum.");
	}
	
}
