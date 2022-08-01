package MyPractice;

public class JavaTest {
	
	static int y = 20;
	
	int s;
	float f =10f;
	int z = 30;

	public static void main(String[] args) {
		JavaTest t = new JavaTest();
		int z;
		t.m2();
		//System.out.println(z);
		System.out.println(t.z);
	}
	public JavaTest() {
		int s = 70;
		System.out.println(s);

	}
	{
		System.out.println("non static block");
		
	}
	static {

		int h = 78;
		System.out.println(h);

		System.out.println("static block");
	}

	public void m2() {
		System.out.println(this.z);
		int a = 15;
		System.out.println(a);

	}

}

//class Test1
//{
//   public static void main(String[] args) {
//	
//	   
//	   System.out.println();
//	   
//}
//   
//   public void m1()
//   {
//	   
//	   JavaTest t = new JavaTest();
//	   System.out.println(t.y);
//		
//	   
//	   
//   }
//
//}
