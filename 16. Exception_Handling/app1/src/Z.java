class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace(System.err);
			//(System.err);
			System.out.println("catch end");
		}
		System.out.println("end of main");
	}
}
