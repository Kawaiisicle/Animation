import java.awt.Color;
import java.awt.Graphics;

public class Letters extends DotData {

	int pW; //pen weight in px
	String word;
	int letters;
	int spacing;
	int lines;
	int maxLetters;
	public Letters(String word, int space, int maxLetters) 
	{
		super(10,2,Color.BLACK, 1);
		pW = 5; 
		this.word = word;
		this.letters = word.length();
		spacing = space*pW;
		lines = 0;
		this.maxLetters = maxLetters;
		setHeight((lines+1)*(pW*6));
	}
	
	private void fillRect(Graphics theG, int x, int y, int width, int height)
	{
		theG.fillRect(x, y, width*this.pW, height*this.pW);
	}
	
	private void drawSpace(Graphics notG, int x, int y) 
	{
		//yay!
	}
	
	private void drawA(Graphics notG, int x, int y) 
	{
		fillRect(notG, x, y, 3, 1);
		fillRect(notG, x, y+(2*pW), 3, 1);
		fillRect(notG, x, y, 1, 5);
		fillRect(notG, x+(2*pW), y, 1, 5);         //right vert line
	}
	private void drawB(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);
		fillRect(notG, x+(2*pW), y, 1, 3);
		fillRect(notG, x, y+(2*pW),4, 1);
		fillRect(notG, x+(3*pW), y+(2*pW), 1, 3);  //right short vert line
		fillRect(notG, x, y, 1, 5);
		fillRect(notG, x, y+(4*pW),4, 1);
	}
	private void drawC(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);
		fillRect(notG, x, y, 3, 1);
		fillRect(notG, x, y+(4*pW), 3, 1);
	}
	private void drawD(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);
		fillRect(notG, x, y, 2, 1);
		fillRect(notG, x, y+(4*pW), 2, 1);
		fillRect(notG, x+(2*pW), y+(pW), 1, 3);
	}
	private void drawE(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
		fillRect(notG, x, y+(2*pW), 3, 1); //middle line
	}
	private void drawF(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //left vert line
		fillRect(notG, x, y, 1, 5);		   //top line
		fillRect(notG, x, y+(2*pW), 2, 1); //middle line (short)
	}
	private void drawG(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x+(2*pW), y+(2*pW), 2, 1); //middle line (short)(right justified)
		fillRect(notG, x+(3*pW), y+(2*pW), 1, 3);  //right short vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
	}
	private void drawH(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y+(2*pW), 3, 1); //middle line
		fillRect(notG, x+(2*pW), y, 1, 5); //right vert line
	}
	private void drawI(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x+(pW), y, 1, 5);		   //left vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
	}
	private void drawJ(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawK(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawL(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawM(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawN(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawO(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawP(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawQ(Graphics notG, int x, int y) {
		drawBroke(notG, x, y);
	}
	private void drawBroke(Graphics notG, int x, int y) {
		notG.setColor(Color.RED);
		fillRect(notG, x, y, 3, 5);
		notG.setColor(getColor());
	}
	public void drawLetter(Graphics notG, String letter, int x, int y)
	{
		String it = letter.toUpperCase();
		switch (it) {
			case " ": drawSpace(notG, x, y); break;
			case "A": drawA(notG, x, y); break;
			case "B": drawB(notG, x, y); break;
			case "C": drawC(notG, x, y); break;
			case "D": drawD(notG, x, y); break;
			case "E": drawE(notG, x, y); break;
			case "F": drawF(notG, x, y); break;
			case "G": drawG(notG, x, y); break;
			case "H": drawH(notG, x, y); break;
			case "I": drawI(notG, x, y); break;
			case "J": drawJ(notG, x, y); break;
			case "K": drawK(notG, x, y); break;
			case "L": drawL(notG, x, y); break;
			case "M": drawM(notG, x, y); break;
			case "N": drawN(notG, x, y); break;
			case "O": drawO(notG, x, y); break;
			case "P": drawP(notG, x, y); break;
			case "Q": drawQ(notG, x, y); break;
			default : drawBroke(notG, x, y); break;
		}
		
	}
	
	public int letLen(String letter)
	{
		String it = letter.toUpperCase();
		switch (it) {
			case " ": return 3*pW;
			case "A": return 3*pW; 
			case "B": return 4*pW; 
			case "C": return 3*pW; 
			case "D": return 3*pW; 
			case "E": return 3*pW; 
			case "F": return 3*pW; 
			case "G": return 4*pW; 
			case "H": return 3*pW; 
			case "I": return 3*pW; 
			case "J": return 3*pW; 
			case "K": return 3*pW; 
			case "L": return 3*pW; 
			case "M": return 3*pW; 
			case "N": return 3*pW; 
			case "O": return 3*pW; 
			case "P": return 3*pW; 
			case "Q": return 3*pW; 
			default : return 3*pW;
		}
	}
	
	public void drawWord(Graphics notG)
	{
		int letterLoc = 0;
		int maxLetterLoc = 0;
		int linePos = 0;
		for(int i = 0; i < letters; i++)
		{
			String theLetter = word.substring(i, i+1);
			drawLetter(notG, theLetter, getStartX()+letterLoc, getStartY()+linePos);
			letterLoc += letLen(theLetter);
			letterLoc += spacing;
			if(letterLoc > maxLetterLoc)
			{
				maxLetterLoc = letterLoc;
			}
			if(i == maxLetters)
			{
				linePos += 6*pW;
				lines++;
				letterLoc = 0;
			}
		}
		setWidth(maxLetterLoc-spacing);
		setHeight(linePos+(5*pW));
	}
	
	public void paintDot(Graphics notG)
	{
		notG.setColor(getColor());
		drawWord(notG);
	}

}