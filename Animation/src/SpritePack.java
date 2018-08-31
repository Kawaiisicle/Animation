import java.awt.Graphics;

public class SpritePack {

	int sprites;
	public SpritePack(int num) {
		sprites = num;
	}
	
	public int spriteCount() {
		return sprites;
	}
	
	public void drawSprite(Graphics theG, int sprite)
	{
		switch (sprite)
		{
		case 0:
			theG.fillRect(100, 100, 10, 20);
			break;
		case 1:
			theG.fillRect(100, 100, 10, 30);
			break;
		case 2:
			theG.fillRect(100, 100, 10, 40);
			break;
		case 3:
			theG.fillRect(100, 100, 10, 50);
			break;
		case 4:
			theG.fillRect(100, 100, 10, 60);
			break;
		case 5:
			theG.fillRect(100, 100, 10, 50);
			break;
		case 6:
			theG.fillRect(100, 100, 10, 40);
			break;
		case 7:
			theG.fillRect(100, 100, 10, 30);
			break;
				
		default:
				theG.fillRect(100, 100, 10, 40);
			break;
			
		}
	}

}
