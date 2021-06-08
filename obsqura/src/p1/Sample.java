package p1;

public class Sample {
	int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		int s=obj.add();
		System.out.println(s);
		
	}
		public int add()
		{
			int a=10;
			int b=20;
			c=a+b;
			return c;
		}

}
