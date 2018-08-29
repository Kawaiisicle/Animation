import java.awt.Color;
import java.awt.Graphics;

public class UniqueDot extends DotData {

	Letters l;
	public UniqueDot() {
		super(46,12,true,false,false,true,150,150,Color.BLACK, 1);
	}

	public UniqueDot(int w, int l, boolean u, boolean d, boolean le, boolean ri, int x, int y, Color theColor, int spe) {
		super(w, l, u, d, le, ri, x, y, theColor, spe);
		// TODO Auto-generated constructor stub
	}
	

	
	public void paintDot(Graphics notG)
	{
		int stX = getStartX();
		int stY = getStartY();
		notG.setColor(Color.BLACK);
		/**notG.fillRect(stX, stY, 3, 12);
		notG.fillRect(stX, stY+3, 6, 3);
		notG.fillRect(stX+6, stY+6, 3, 3);
		notG.fillRect(stX+9, stY+3, 6, 3);
		notG.fillRect(stX+12, stY, 3, 12);
		
		notG.fillRect(stX+17, stY+3, 3, 9);
		notG.fillRect(stX+20, stY, 3, 3);
		notG.fillRect(stX+20, stY+6, 3, 3);
		notG.fillRect(stX+23, stY+3, 3, 9);
		
		notG.fillRect(stX+25, stY, 3, 3);
		notG.fillRect(stX+28, stY+3, 3, 3);
		notG.fillRect(stX+34, stY, 3, 3);
		notG.fillRect(stX+31, stY+3, 3, 3);
		notG.fillRect(stX+29, stY+6, 4, 6);
		
		notG.fillRect(stX+20+17, stY+3, 3, 9);
		notG.fillRect(stX+20+20, stY, 3, 3);
		notG.fillRect(stX+20+20, stY+6, 3, 3);
		notG.fillRect(stX+20+23, stY+3, 3, 9);*/
	}

}
