class Table1
{
	void printTable1(int n)
	{
		synchronized(this)
		{
            for(int i=1;i<=5;i++)
			{
                System.out.println(n*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}		
	}
}

class Mythread_1 extends Thread
{
	Table1 t;
	Mythread_1(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable1(5);
	}
}


class Mythread_2 extends Thread
{
	Table1 t;
	Mythread_2(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable1(100);
	}
}

class sync_threads 
{
	public static void main(String args[])
	{
		Table1 obj = new Table1();
		Mythread_1 th1 = new Mythread_1(obj);
        Mythread_2 th2 = new Mythread_2(obj);
        th1.start();
        th2.start();
        
	}
}