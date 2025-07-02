package polimorfizm;

public class Main {
	
	public static void sinav_var(Kisi k)
	{
		k.dersCalis();
	}

	public static void main(String[] args) {
		
		//Kisi ogr=new Ogrenci(); //upcasting
		Ogrenci ogr= new Ogrenci();
		   
		
		sinav_var(ogr); //upcasting

	}

}
