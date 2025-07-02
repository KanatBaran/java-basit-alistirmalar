package People;

public class People<A, N> {
	
	A age;
	N name;
	
	public People(A age, N name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println( "Age: "+ this.age);
		System.out.println("Name: " + this.name);
	}
	
	
}