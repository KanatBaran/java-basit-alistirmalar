package Calisan;

import java.util.Scanner;

public class Anasayfa {
	
	public static Muhendis[] MuhendisSirala(Muhendis[] muhendisler, int boyut)
	{
		
		Muhendis[] gecici= new Muhendis[1];
		
		for(int i = 0; i < boyut; i++)
		{
			for(int j = i; j < boyut; j++)
			{
				if(muhendisler[i].getMaas() > muhendisler[j].getMaas())
				{
					gecici[0] = muhendisler[j];
					muhendisler[j] = muhendisler[i];
					muhendisler[i] = gecici[0];
				}
			}
		}
		
		return muhendisler;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String ad;
		int yas;
		double maas;
		int muh_sayi;
		
		System.out.print("Muhendis sayisi gir: ");
		muh_sayi = input.nextInt();
		
		Muhendis[] muhendisler= new Muhendis[muh_sayi];
		
		for(int i = 0; i < muh_sayi; i++)
		{
			input.nextLine();
			
			System.out.print( (i+1) + ".Muhendisin Adi: ");
			ad = input.nextLine();
			
			System.out.print( (i+1) + ".Muhendisin Yasi: ");
			yas = input.nextInt();
			
			System.out.print( (i+1) + ".Muhendisin Maasi: ");
			maas = input.nextDouble();
			
			muhendisler[i] = new Muhendis(ad, yas, maas);
		}
		
		
		for(int i = 0; i < muh_sayi; i++)
		{
			muhendisler[i].BilgileriYazdir();
		}
		
		for(int i = 0; i < muh_sayi; i++)
		{
			muhendisler[i].MaasGuncelle();
		}
		
		for(int i = 0; i < muh_sayi; i++)
		{
			muhendisler[i].BilgileriYazdir();
		}
		
		Muhendis[] yeni_muhendisler= new Muhendis[muh_sayi];
		
		yeni_muhendisler = MuhendisSirala(muhendisler, muh_sayi);
		
		
		for(int i = 0; i < muh_sayi; i++)
		{
			yeni_muhendisler[i].BilgileriYazdir();
		}
		

	}

}
