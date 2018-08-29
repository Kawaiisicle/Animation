import java.awt.Color;
import java.awt.Graphics;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static Color fluidColor(Graphics notG, int x, int y)
	{
		int newX = x+1;
		int newY = y+1;
		return new Color(newX%256, 0, newY%256);
	}

}
