
public class Problem2Main
{
	public static void main(String arg[])
	{

		Thread thread1 = new Problem2('a', 0);
		Thread thread2 = new Problem2('b', 1);
		Thread thread3 = new Problem2('c', 2);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
