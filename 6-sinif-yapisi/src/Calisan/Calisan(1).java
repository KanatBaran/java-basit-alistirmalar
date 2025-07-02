package Calisan;

public class Calisan {
	 
	public String ad;
	public int Yas;
	public String pozisyon;
	
	
	/*get ve set*/
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return Yas;
	}
	public void setYas(int yas) {
		Yas = yas;
	}
	public String getPozisyon() {
		return pozisyon;
	}
	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}
	/*get ve set*/
	
	
	public Calisan(String ad, int yas) {
		this.ad = ad;
		Yas = yas;
	}
	
	
	
	
	public void BilgileriYazdir()
	{ 
		System.out.println("Ad: " + getAd());
		System.out.println("Yas: " + getYas());
	}
	
	
	
}
