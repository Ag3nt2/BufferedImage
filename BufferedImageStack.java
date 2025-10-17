import java.awt.image.BufferedImage;

//West Walton
public class BufferedImageStack {
	public BufferedImage[] bi = new BufferedImage[2]; //starter array
	public int count = 0;  //count
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//push("bonk");
		//System.out.println(getArraySize());
		//push("bonk");
		//push("bonk");
		//push("bonk");
		//System.out.println(getArraySize());
		//System.out.println(bi[3]);
		//pop();
		//pop();
		//pop();
		//System.out.println(bi[0]);
		//pop();
		//System.out.println(isEmpty());
		//push("bonk");
		//System.out.println(isEmpty());
		//System.out.println(getSize());
		//push("bonk");
		//push("bonk");
		//push("bonk");
		//push("bonk");
		//System.out.println(getSize());
		//System.out.println(getArraySize());
	}
	
	public void push(BufferedImage b) //adds new item to array and doubles array size if the array is too small
	{
		count++;
		if(count == bi.length)
		{
			BufferedImage[] bi2  = new BufferedImage[bi.length * 2];
			for(int i =  0 ; i < bi.length; i++)
			{
				bi2[i] = bi[i];
			}
			bi2[bi.length] = b;
			bi = bi2;
		}
		else
		{
			bi[count] = b;
		}
	}
	public  BufferedImage pop() //gets rid of last item  of the  array
	{
		BufferedImage b = bi[count];
		bi[count] = null;
		count--;
		return b;
	}
	public   boolean isEmpty() //returns if the array is  empty or not
	{
		if(count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public  BufferedImage get(int i) //peeks at the item  at  the top  of  the array
	{
		return bi[i];
	}
	public   int getSize() //returns location of last  item  of array
	{
		return count;
	}
	public  int getArraySize() //return actual size of array
	{
		return bi.length;
	}
	public  void clear() //clears array,  made this  cause i felt like it
	{
		for(int i = 0; i < bi.length; i++)
		{
			bi[i] = null;
		}
		count = 0;
	}
}