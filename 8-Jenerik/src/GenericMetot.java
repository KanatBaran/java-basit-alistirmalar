
public class GenericMetot {

	public static <E> void listele(E[] dizi)
	{
		for(E eleman : dizi)
		{
			System.out.println(eleman);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] dizi = {1,2,3,4,5};
		String[] kelimeler= {"Baran", "Kanat", "Serhat"};
		
		listele(dizi);
		listele(kelimeler);
		
		
	}

}
