import java.awt.Color;
import java.awt.Graphics;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static Color fluidColor( int x, int y, int vers)
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
	
	public static Color fluidColor2(int x, int y)
	{
		return new Color(255-(x%256),255-(y%256), 0);
	}
	public static Color randomColor()
	{
		return new Color( (int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255 );	
	}
	
	public static Color tickerColor(Color color1, Color color2, Color color3, int counter)
	{
		int ticker = counter%3;
		switch (ticker)
		{
		case 0: return color1;
		case 1: return color2;
		case 2: return color3;
		default: return Color.BLACK;
		}
		
	}

}
