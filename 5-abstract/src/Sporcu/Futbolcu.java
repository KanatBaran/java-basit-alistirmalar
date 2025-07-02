package Sporcu;

public class Futbolcu {
	
	int antreman_sayisi = 4;
	
	public void calis()
	{
		System.out.println("Futbolcu calis(): " + antreman_sayisi);
	}
	
	public Futbolcu()
	{
		super();
		System.out.println("Futbolcu yapilandirici");
		calis();
	}
	
}
