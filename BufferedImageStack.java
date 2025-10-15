import java.awt.image.BufferedImage;

//West Walton
public class BufferedImageStack {
	public static BufferedImage[] bi = new BufferedImage[2];
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
	
	public static void push(BufferedImage b)
	{
		if(bi[bi.length - 1] != null)
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
			int count = 0;
			while(bi[count] != null)
			{
				count++;
			}
			bi[count] = b;
		}
	}
	public static BufferedImage pop()
	{
		int count = 0;
		while(count < bi.length && bi[count] != null )
		{
			count++;
		}
		if(count == bi.length && bi[count - 1] == null )
		{
			throw new IllegalArgumentException("List is empty");
		}
		else
		{
			BufferedImage b = bi[count - 1];
			bi[count - 1] = null;
			return b;
		}
	}
	public  static boolean isEmpty()
	{
		if(bi[0] == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static BufferedImage get(int i)
	{
		return bi[i];
	}
	public  static int getSize()
	{
		int count = 0;
		while(bi[count] != null)
		{
			count++;
		}
		return count;
	}
	public static int getArraySize()
	{
		return bi.length;
	}
}
