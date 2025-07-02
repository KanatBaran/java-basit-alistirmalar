package koleksiyonlar;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//İlk girin ilk cikan mantigi islenir.
		//Silme islemi kuyruk yapisinini son elemani silinir.
		//Ekeleme isleminde ise kuyruk yapisinin basina eklenir.
		
		PriorityQueue kuyruk= new PriorityQueue();
		
		kuyruk.add("Baran");
		kuyruk.add("Ahmet");
		kuyruk.add("Mehmet");
		kuyruk.add("Ali");
		
		
		System.out.println(kuyruk);
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk);
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk);
		System.out.println(kuyruk.peek()); //ilk elemani yazdirir.
		kuyruk.add("Hasan");
		System.out.println(kuyruk);
		System.out.println("boyutu="+kuyruk.size());
	}

}
