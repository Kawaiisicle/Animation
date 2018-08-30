import java.awt.Color;
import java.awt.Graphics;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static Color fluidColor(Graphics notG, int x, int y, int vers)
	{
		if(vers == 1)
		{
			int newX = x+1;
			int newY = y+1;
			return new Color(newX%256, 0, newY%256);
	
		}
		else if(vers == 2)
		{
			return new Color(255-(x%256),255-(y%256), 0);
		}
		else
		{
			return new Color(255-(x%256),255-(y%256), 0);
		}
	}
	
	public static Color fluidColor2(Graphics notG, int x, int y)
	{
		return new Color(255-(x%256),255-(y%256), 0);
	}
	public static Color randomColor()
	{
		return new Color( (int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255 );	
	}

}
