package Calisan;

public class Muhendis extends Calisan{
	
	public static int idCounter = 100;
	
	private int id;
	public double maas;
	
	/*get ve set */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public static int getIdcounter() {
		return idCounter;
	}
	/*get ve set */

	
	public Muhendis(String ad, int yas, double maas) {
		super(ad, yas);
		setMaas(maas);
		setId( (idCounter+5) );
		setPozisyon("Muhendis");
		idCounter +=5;
	}

	@Override
	public void BilgileriYazdir() {
		System.out.println("\n\n:Bilgiler:");
		System.out.println("Pozisyon: " + getPozisyon());
		System.out.println("Id: " + getId());
		super.BilgileriYazdir();
		System.out.println("Maas: " + getMaas());
	}
	
	

	public void MaasGuncelle() {
		
		int toplam = 0, gecici = 0, yeni_maas = 0;
		gecici = 2023-getYas();
		
		while(gecici > 0) {
            toplam += gecici % 10;
            gecici = gecici / 10;
        }
		
		yeni_maas = (int) (getMaas()*toplam)/100;
		
		
		setMaas(getMaas()+yeni_maas);
		
	}
	
	
}
