package Sporcu;

public abstract class Sporcu {
	
	public abstract void calis();
	
	public Sporcu()
	{
		System.out.println("Calis() cagrilmada once");
		
		calis();
		
		System.out.println("Calis cagrildiktan sonra");
	}
	
}
