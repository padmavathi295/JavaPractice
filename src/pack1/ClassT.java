package pack1;

public class ClassT extends Thread
{
	public void run()
	{
		System.out.println("run() excuted");
	}
	public static void main(String[] args) 
	{
		ClassT aobj=new ClassT();
		Thread t=new Thread(aobj);
		t.start();
		
		
	}

}
