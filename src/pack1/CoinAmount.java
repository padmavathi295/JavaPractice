package pack1;

import java.util.Arrays;

public class CoinAmount 
{
	int meth1(int[]coins,int amount)
	{
		int[] arr=new int[amount+1];
		Arrays.fill(arr, amount+1);
		arr[0]=0;
		for(int coin:coins)
		{
			for(int j=coin;j<=amount;j++)
			{
				arr[j]=Math.min(arr[j],arr[j-coin]+1);
			}
		}
		if(arr[amount]>amount)
		{
			return -1;
		}
		else
		{
			return arr[amount];
		}
		
		
	}
	public static void main(String[] args) 
	{
		CoinAmount obj=new CoinAmount();
		int[]coins= {1,2,5};
		int amount=11;
		int result=obj.meth1(coins,amount);
		System.out.println(result);
	}

}
