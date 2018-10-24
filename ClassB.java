class P
{
	public static void test(int i)
	{
		System.out.println("main begin"+i);
	}

	public static void main(String[] args) 
	{
/*		System.out.println("main begin");
		int i=test();
		int j=i+test();
		int k=i+test()+j+test();
		System.out.println("i :"+i);
		System.out.println("j :"+j);
		System.out.println("k :"+k);
*/		System.out.println("main begin");
		test(1);

	}
/*	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
*/
//	public static void test()
//	{
//		System.out.println("from test");
//		//return "abc";
//	}

}
