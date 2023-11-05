package DSA_Java.A2_Array;


class HighArray {
	
	private int[] arr;   // refer to array a
	private int nElems;   // number of elements
	
	
	public HighArray(int size)  // constructor
	{
		arr = new int[size];
		nElems = 0;
	}
	
//---------------------------------------------	
	public boolean find(int searchElems)  // find specified value
	{
	 
	
		for(int j = 0; j < nElems; j++)
		{
			if(arr[j] == searchElems)
				return true;
		}
		
		return false;
	
	}
//-------------------------------------------------
	public void insert(int value)       //put elements into Array
	{
		arr[nElems] = value;          // insert it
		nElems++;             // increment size
	}

//------------------------------------------------------------	
	
	public boolean delete(int value)    // delete Element
	{
		int a = 0;
		for(int j = 0; j < nElems; j++)
		{
			if(arr[j] == value)
			{	a = j;
				break;
			}
		}
		if(a > 0)
		{
			for(int k = a; k < nElems; k++)  // move higher ones
			{
				arr[k] = arr[k+1];
			}
			nElems--;                      // decrement size
			
			return true;
		
		}
		return false;

	}
	
//------------------------------------------------------------
	
	public void display()   // display elements
	{
		for(int j= 0; j < nElems;j++)   // display items
		{
			System.out.print(arr[j] + " ");
		}
	}
	
	
	
}

//-----------------------------------------------------------------------------

public class A3_HighArrayApp {
	
	public static void main(String[] args) 
	{
		
		HighArray arr;                 // reference
		arr = new HighArray(100);     // create LowArray object
		
		arr.insert(2);
		arr.insert(7);
		arr.insert(26);
		arr.insert(33);
		arr.insert(44);
		arr.insert(79);
		
		arr.display();
		
		System.out.println();
		
		arr.delete(79);
		
		arr.display();
		
		System.out.println();
		
		if(arr.find(99))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
		
	}

}
