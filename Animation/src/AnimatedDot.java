import java.awt.Color;
import java.awt.Graphics;

public class AnimatedDot extends DotData {

	int spriteTic;
	SpritePack sprites;
	public AnimatedDot(SpritePack spritePack) {
		super(10, 250, 250, 1, Color.BLACK, 1);
		sprites = spritePack;
	}

	public AnimatedDot(int size, int x, int y, int dir, Color theColor, int spe) {
		super(size, x, y, dir, theColor, spe);
		// TODO Auto-generated constructor stub
	}

	public AnimatedDot(int size, int dir, Color theColor, int spe) {
		super(size, dir, theColor, spe);
		// TODO Auto-generated constructor stub
	}

	public AnimatedDot(int w, int l, boolean u, boolean d, boolean le, boolean ri, int x, int y, Color theColor,
			int spe) {
		super(w, l, u, d, le, ri, x, y, theColor, spe);
		// TODO Auto-generated constructor stub
	}
	
	public void paintDot(Graphics someG)
	{
		spriteTic = (spriteTic)%7;
		sprites.drawSprite(someG, spriteTic);
		spriteTic++;
	}

}
