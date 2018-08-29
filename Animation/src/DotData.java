import java.awt.Color;
import java.awt.Graphics;

public class DotData {
	private int width;
	private int height;
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	private int startX;
	private int startY;
	private Color color;
	private int speed;
	
	
	public DotData()
	{
		setWidth(6);
		setHeight(6);
		up = true;
		down = false;
		left = true;
		right = false;
		setStartX(200);
		setStartY(200);
		setColor(Color.BLACK);
		setSpeed(1);
	}
	
	public DotData(int size, int x, int y, int dir, Color theColor, int spe)
	{
		setWidth(size);
		setHeight(size);
		if(dir == 0)
		{
			up = true;
			down = false;
			left = true;
			right = false;
		}
		else if(dir == 1)
		{
			up = true;
			down = false;
			left = false;
			right = true;
		}
		else if(dir == 2)
		{
			up = false;
			down = true;
			left = false;
			right = true;
		}
		else if(dir == 3)
		{
			up = false;
			down = true;
			left = true;
			right = false;
		}
		setStartX(x);
		setStartY(y);
		setColor(theColor);
		setSpeed(spe);
	}
	
	public DotData(int size, int dir, Color theColor, int spe)
	{
		setWidth(size);
		setHeight(size);
		if(dir == 0)
		{
			up = true;
			down = false;
			left = true;
			right = false;
		}
		else if(dir == 1)
		{
			up = true;
			down = false;
			left = false;
			right = true;
		}
		else if(dir == 2)
		{
			up = false;
			down = true;
			left = false;
			right = true;
		}
		else if(dir == 3)
		{
			up = false;
			down = true;
			left = true;
			right = false;
		}
		setStartX(100);
		setStartY(100);
		setColor(theColor);
		setSpeed(spe);
	}
	
	public DotData(int w, int l, boolean u, boolean d, boolean le, boolean ri, int x, int y, Color theColor,int spe)
	{
		setWidth(w);
		setHeight(l);
		up = u;
		down = d;
		left = le;
		right = ri;
		setStartX(x);
		setStartY(y);
		setColor(theColor);
		setSpeed(spe);
	}
	
	public void toggleLR()
	{
		if(left)
		{
			left = false;
			right = true;
		}
		else
		{
			left = true;
			right = false;
		}
	}
	
	public void toggleUD()
	{
		if(up)
		{
			up = false;
			down = true;
		}
		else
		{
			up = true;
			down = false;
		}
	}
	
	public void checkBounds(int boundLen, int boundHig)
	{
    	if(getStartX()+getWidth() > boundLen-12){
            toggleLR();
        }
        if(getStartX() <= 6){
            toggleLR();
        }
        if(getStartY()+getHeight() > boundHig-35){
            toggleUD();
        }
        if(getStartY() <= 6){
            toggleUD();
        }	
    }
	
	public void moveLoc(){
    	if(up){
            setStartY(getStartY() - speed);
        }
        if(down){
            setStartY(getStartY() + speed);
        }
        if(left){
            setStartX(getStartX() - speed);
        }
        if(right){
            setStartX(getStartX() + speed);
        }	
    }
	
	public void paintDot(Graphics notG)
	{
		notG.setColor(Util.fluidColor(notG, startX, startY));
		notG.fillRect(getStartX(), getStartY(), getWidth(), getHeight());
	}
	public int[] getCurrentLoc() {
		int[] loc = {getStartX(), getStartY()};
		return loc;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

}

