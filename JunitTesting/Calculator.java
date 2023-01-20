package com.test;

public class Calculator {

	public int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	public float add(float a,float b)
	{
	return (a+b);	
	}
	
	public int divide(int a,int b)
	{
	return a/b;	
	}
	
	public int addTwoPosistiveInt(int a,int b)
	{
	return (a+b);	
	}
	
	public double multiply(double a,double b)
	{
		return a*b;
	}
	
	public int findMax(int arr[])
	{
	int max=arr[0];     //max=12  //12 10 34 1 9
	for(int i=1;i<arr.length;i++) 
	{
		if(max<arr[i]) //34<9
			max=arr[i];  //34
		
	}
	
		return max;
		
	}
	
	public boolean searchElement(int arr[],int key)
	{
		int i;
     	boolean flag=false;
		for(i=0;i<arr.length;i++)  //i=4<10 t
		{
		if(arr[i]==key)   
		{

			flag=true; //search successful
			//System.out.println(key+ " found at "+(i+1)+" position");
			break;
		}
		}
      return flag;
	}
	
	public int searchElement2(int arr[],int key)
	{
		int i;
     	int f=-1;
		for(i=0;i<arr.length;i++)  //i=4<10 t
		{
		if(arr[i]==key)   
		{

			f=i; //search successful
			//System.out.println(key+ " found at "+(i+1)+" position");
			break;
		}
		}
      return f;
	}
	
	public int[] bubbleSort(int arr[])
	{
		int temp;
		 //sorting
        for(int i=0;i<4;i++)
        {
        	/*place currently selected element arr[i] to its current position*/
        	for(int j=i+1;j<4;j++)
        	{
        		/*swap if currently selected element is not at its current position*/
        		
        		if(arr[i]>arr[j]) //for ascending change < to >
        		{
        		temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        		}
        	}
        }//external for
        return arr;
	}
}
