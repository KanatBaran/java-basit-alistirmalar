import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * Sayının Asal Sayı Olup Olmadığını Kontrol Eden Algoritma
		 * 
		 * Asal Sayı: Asal sayılar, sadece iki pozitif tam sayı böleni olan, kendisine ve 1 sayısına kalansız bölünebilen, 1'den büyük sayma sayılarıdır.
		 * 
		 * www.barankanat.com.tr
		 * */
		
		int durum = 1; int kontrol = 2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayi girin: ");
		int sayi = input.nextInt();
		
		if (sayi >= 2) {
			
			while (kontrol<sayi) 
			{
				if(sayi % kontrol == 0) { durum = 0; break; }
				kontrol++;
			}
			
		}else {
			durum = 0;
		}
		
		if (durum == 1) {
			System.out.println("Sayiniz Asaldir.");
		}else {
			System.out.println("Sayiniz asal değildir.");
		}
		
		

	}

}
