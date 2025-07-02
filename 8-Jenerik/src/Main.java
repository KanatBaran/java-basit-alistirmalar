import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ArrayList */
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(5);
		arr.add(10);
		
		int syc = 0;
		for(Integer sayilar: arr)
		{
			System.out.println(sayilar);
			syc++;
		}
		
		
		HashMap<Integer, String> sehirler= new HashMap<Integer, String>();
		
		sehirler.put(47, "Mardin");
		sehirler.put(16, "Bursa");
		sehirler.put(72, "Batman");
		
		for(Integer sehir: sehirler.keySet())
		{
			System.out.println(sehir + " : " + sehirler.get(sehir));
		}
		
		for(String sehir: sehirler.values())
		{
			System.out.println(sehir);
		}
		
		
		
		
		
	}

}
