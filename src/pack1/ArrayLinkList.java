package pack1;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayLinkList 
{
	void meth1()
	{
		ArrayList<LinkedList<Integer>> al=new ArrayList<LinkedList<Integer>>();
		LinkedList<Integer> ll1= new LinkedList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
        LinkedList<Integer> ll2= new LinkedList<Integer>();
		ll2.add(40);
		ll2.add(50);
		ll2.add(60);
		LinkedList<Integer> ll3= new LinkedList<Integer>();
		ll3.add(70);
		ll3.add(80);
		ll3.add(90);
	
		al.add(ll1);
		al.add(ll2);
		al.add(ll3);
		System.out.println(al);	
	}
	public static void main(String[] args) 
	{
		new ArrayLinkList().meth1();
	}

}
