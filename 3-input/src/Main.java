import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan herhangi bir değer alma işlemi
		 * Scanner kütüphanesini kullanmalıyız.
		 * 
		 * www.barankanat.com.tr
		 * */
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Adinizi girin: ");
		String ad = input.nextLine();
		
		System.out.print("Soyadiniz girin: ");
		String soyad = input.nextLine();
		
		System.out.print("Yasinizi girin: ");
		Integer yas = input.nextInt();
		
		System.out.println("Merhaba, " + ad + " " + soyad + " " + yas);
	}

}
