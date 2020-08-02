package nandha;

public class Vol 
{

	public static void main(String[] args) 
	{ 
	  double volume;
	  box obj=new box(4,4,2);
	  volume= obj.height*obj.width*obj.depth;
	  System.out.println("volume is "+volume);

	}

}
class box
{
	double height,width,depth;
	box(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	
}

