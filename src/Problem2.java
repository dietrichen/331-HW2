/*
 * Name:		Eugene Dietrich
 * Instructor: 	Dr. Bin Lu
 * Class:		CSC 331
 * Assignment	Home Work 2 
 * Problem		2
 * File:		Problem2.Java
 */
public class Problem2 extends Thread
{
	static int token = 0;
	/*
	 * variable declaration
	 */
	char printChar;
	int tokenValue;

	/*
	 * constructor
	 */
	public Problem2(char c, int i)
	{
		this.printChar = c;
		this.tokenValue = i;
	}

	/*
	 * print method - tells the current thread print then puts to sleep so other
	 * threads can execute in order
	 */
	public void Printer() 
	{
		System.out.print(printChar);

	}

	/*
	 * When an object implementing interface Runnable is used to create a
	 * thread, starting the thread causes the object's run method to be called
	 * in that separately executing thread.
	 */
	@Override
	public synchronized void run()
	{
		for (int i = 0; i < 3; i++)
		{
			synchronized (this)// put the threads in sync
			{
				if (token == tokenValue)
				{
					Printer();					
				}
				token++;

			}

		}
	}
}
