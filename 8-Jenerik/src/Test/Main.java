package Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer> sayi= new Test<Integer>(15);
		
		System.out.println(sayi.getObj());
		
		Test<String> kelime= new Test<String>("Üniversite");
		
		System.out.println(kelime.getObj());

	}

}
