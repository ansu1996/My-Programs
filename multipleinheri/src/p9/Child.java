package p9;

public class Child implements Parent1,Parent2 {

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.show();
		obj.print();
		

	}
	public void show()
	{
		System.out.println("hai");
	}
	public void print()
	{
		System.out.println("hello");
	}
}
