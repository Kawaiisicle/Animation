import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Letters extends DotData {

	int pW; //pen weight in px
	int spacing;
	int lines;
	int maxLetters;
	int colorCode;
	ArrayList<String> words;
	
	public Letters(String string) 
	{
		super(10,50, 50, 2,Color.BLACK, 1);
		pW = 3;
		spacing = 4*pW;
		lines = 0;
		this.maxLetters = maxLetters;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	
	public Letters(String string, int x, int y) 
	{
		super(10,x, y, 2,Color.BLACK, 1);
		pW = 3;
		spacing = 4*pW;
		lines = 0;
		this.maxLetters = maxLetters;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	public Letters(int x, int y, String string, int penWeight) 
	{
		super(10,x, y, 2,Color.BLACK, 1);
		pW = penWeight;
		spacing = 2*pW;
		lines = 0;
		this.maxLetters = 12;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	
	public Letters(int x, int y, String string, int penWeight, int speed, int colorCode) 
	{
		super(10,x, y, 2,Color.BLACK, speed);
		pW = penWeight;
		spacing = 2*pW;
		lines = 0;
		this.maxLetters = 12;
		setHeight((lines+1)*(pW*6));
		this.colorCode = colorCode;
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	
	public Letters(int x, int y, int dir, String string, int penWeight) 
	{
		super(10,x, y, dir,Color.BLACK, 1);
		pW = penWeight;
		spacing = 2*pW;
		lines = 0;
		this.maxLetters = 12;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	public Letters(int color, int x, int y, int dir, String string, int penWeight) 
	{
		super(10,x, y, dir,Color.BLACK, 1);
		colorCode = color;
		pW = penWeight;
		spacing = 2*pW;
		lines = 0;
		this.maxLetters = 12;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	public Letters(String string, int penWeight, int space, int maxLetters) 
	{
		super(10,50, 90, 2,Color.BLACK, 1);
		pW = penWeight;
		spacing = space*pW;
		lines = 0;
		this.maxLetters = maxLetters;
		setHeight((lines+1)*(pW*6));
		
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	
	public Letters(String string, int penWeight, int space, int maxLetters, Color theColor) 
	{
		super(10,50, 90, 2,theColor, 1);
		pW = penWeight;
		spacing = space*pW;
		lines = 0;
		this.maxLetters = maxLetters;
		setHeight((lines+1)*(pW*6));
		
		words = new ArrayList<String>();
		String[] wordArr = string.split(" ");
		for(String word : wordArr)
		{
			words.add(word);
		}
		
	}
	
	private Color checkColor(int x, int y)
	{
		switch (colorCode)
		{
		case 0: setColor(Color.RED); return Color.RED;
		case 1: setColor(Color.ORANGE); return Color.ORANGE;
		case 2: setColor(Color.YELLOW); return Color.YELLOW;
		case 3: setColor(Color.GREEN); return Color.GREEN;
		case 4: setColor(Color.BLUE); return Color.BLUE;
		case 5: setColor(Color.MAGENTA); return Color.MAGENTA;
		case 6: setColor(Util.fluidColor2(x, y)); return Util.fluidColor2(x/2, y/2);
		case 7: setColor(Util.tickerColor(Color.RED, Color.ORANGE, Color.YELLOW, x)); return Util.tickerColor(Color.RED, Color.ORANGE, Color.YELLOW, x);
		case 8: setColor(Util.tickerColor(Color.GREEN, Color.BLUE, new Color(255, 0, 255), y)); return Util.tickerColor(Color.RED, Color.ORANGE, Color.YELLOW, y);
		default: setColor(Color.BLACK); return Color.BLACK;
		}
	}
	
	private void fillRect(Graphics theG, int x, int y, int width, int height)
	{
		theG.setColor(getColor());
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
		fillRect(notG, x+(pW), y, 2, 1);		   //top right line
		fillRect(notG, x+(2*pW), y, 1, 5); //right vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
		fillRect(notG, x, y+(2*pW), 1, 3);  //left short vert line
	}
	private void drawK(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x+(2*pW), y+(3*pW), 1, 2);  //right bottom short vert line
		fillRect(notG, x, y+(2*pW), 2, 1); 		   //middle short line
		fillRect(notG, x+(2*pW), y, 1, 2);  //right top short vert line
	}
	private void drawL(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
		
	}
	private void drawM(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 5, 1);		   //top line
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x+(2*pW), y, 1, 5);  //right top short vert line
		fillRect(notG, x+(4*pW), y+(pW), 1, 4); //right vert line
	}
	private void drawN(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x+(2*pW), y, 1, 5); //right vert line
	}
	private void drawO(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x+(2*pW), y, 1, 5); //right vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
	}
	private void drawP(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x, y+(2*pW), 3, 1); 		   //middle short line
		fillRect(notG, x+(2*pW), y, 1, 3);  //right top short vert line
	}
	private void drawQ(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y, 4, 1);		   //top line
		fillRect(notG, x+(3*pW), y, 1, 5); //right vert line
		fillRect(notG, x, y+(4*pW), 4, 1); //bottom line
		fillRect(notG, x+(2*pW), y+(3*pW), 1, 1);  //right bottom short vert line
	}
	private void drawR(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x+(2*pW), y+(3*pW), 1, 2);  //right bottom short vert line
		fillRect(notG, x, y+(2*pW), 2, 1); 		   //middle short line
		fillRect(notG, x+(2*pW), y, 1, 2);  //right top short vert line
		fillRect(notG, x, y, 3, 1);		   //top line
	}
	private void drawS(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x, y, 1, 3);  //left top short vert line
		fillRect(notG, x, y+(2*pW), 3, 1); //middle line
		fillRect(notG, x+(2*pW), y+(3*pW), 1, 2);  //right bottom short vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
	}
	private void drawT(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x+(pW), y, 1, 5);		   //left vert line
	}
	private void drawU(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
		fillRect(notG, x+(2*pW), y, 1, 5); //right vert line
	}
	private void drawV(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 4);		   //left vert line most
		fillRect(notG, x+(pW), y+(4*pW), 1, 1); //bottom dot
		fillRect(notG, x+(2*pW), y, 1, 4); //right vert line most
	}
	private void drawW(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 5);		   //left vert line
		fillRect(notG, x+(4*pW), y, 1, 5);  //right vert line
		fillRect(notG, x+(2*pW), y+(2*pW), 1, 3); //right short vert line
		fillRect(notG, x, y+(4*pW), 4, 1); //bottom line
	}
	private void drawX(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 2);		   //left vert line
		fillRect(notG, x, y+(3*pW), 1, 2);		   //left vert line
		fillRect(notG, x+(2*pW), y+(3*pW), 1, 2);  //right bottom short vert line
		fillRect(notG, x+(pW), y+(2*pW), 1, 1); 		   //middle dot
		fillRect(notG, x+(2*pW), y, 1, 2);  //right top short vert line
	}
	private void drawY(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 2);		   //left vert line most
		fillRect(notG, x+(pW), y+(2*pW), 1, 3); //bottom dot
		fillRect(notG, x+(2*pW), y, 1, 2); //right vert line most
	}
	private void drawZ(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 3, 1);		   //top line
		fillRect(notG, x, y+(4*pW), 3, 1); //bottom line
		fillRect(notG, x, y+(3*pW), 1, 2);		   //left vert line
		fillRect(notG, x+(pW), y+(2*pW), 1, 1); 		   //middle dot
		fillRect(notG, x+(2*pW), y, 1, 2);  //right top short vert line
	}
	private void drawPeriod(Graphics notG, int x, int y) {
		fillRect(notG, x, y+(4*pW), 1, 1); //bottom dot
	}
	private void drawQuestion(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 2, 1);		   //top line
		fillRect(notG, x, y+(2*pW), 2, 1); 		   //middle short line
		fillRect(notG, x+(1*pW), y, 1, 3);  //right top short vert line
		fillRect(notG, x, y+(4*pW), 1, 1); //bottom dot
	}
	private void drawExclam(Graphics notG, int x, int y) {
		fillRect(notG, x, y, 1, 3);		   //left vert line
		fillRect(notG, x, y+(4*pW), 1, 1); //bottom dot
	}
	private void drawBroke(Graphics notG, int x, int y) {
		notG.setColor(Color.RED);
		fillRect(notG, x, y, 3, 5);
		notG.setColor(getColor());
	}
	public void drawLetter(Graphics notG, String letter, int x, int y)
	{
		notG.setColor(checkColor(x, y));
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
			case "R": drawR(notG, x, y); break;
			case "S": drawS(notG, x, y); break;
			case "T": drawT(notG, x, y); break;
			case "U": drawU(notG, x, y); break;
			case "V": drawV(notG, x, y); break;
			case "W": drawW(notG, x, y); break;
			case "X": drawX(notG, x, y); break;
			case "Y": drawY(notG, x, y); break;
			case "Z": drawZ(notG, x, y); break;
			case ".": drawPeriod(notG, x, y); break;
			case "?": drawQuestion(notG, x, y); break;
			case "!": drawExclam(notG, x, y); break;
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
			case "M": return 5*pW; 
			case "N": return 3*pW; 
			case "O": return 3*pW; 
			case "P": return 3*pW; 
			case "Q": return 4*pW;
			case "R": return 3*pW; 
			case "S": return 3*pW; 
			case "T": return 3*pW; 
			case "U": return 3*pW; 
			case "V": return 3*pW; 
			case "W": return 4*pW; 
			case "X": return 3*pW; 
			case "Y": return 3*pW; 
			case "Z": return 3*pW;
			case ".": return 1*pW; 
			case "!": return 1*pW; 
			case "?": return 2*pW;
			default : return 3*pW;
		}
	}
	
	public void drawWord(Graphics notG)
	{
		int letterLoc = 0;
		int letterCount = 0;
		int maxLetterLoc = 0;
		int linePos = 1;
		boolean justNewLined = false;
		for(String word : words)
		{
			int letters = word.length();
			boolean newLine = false;
			boolean tooBig = false;
			if(letters > maxLetters)
			{
				tooBig = true;
			}
			else if(letterCount+letters > maxLetters)
			{
				linePos += 6*pW;
				lines++;
				letterLoc = 0;
				newLine = true;
				justNewLined = true;
			}
			for(int i = 0; i < letters; i++)	
			{
				letterCount++;
				String theLetter = word.substring(i, i+1);
				drawLetter(notG, theLetter, getStartX()+letterLoc, getStartY()+linePos);
				letterLoc += letLen(theLetter);
				letterLoc += spacing;
				justNewLined = false;
				if(letterLoc > maxLetterLoc)
				{
					maxLetterLoc = letterLoc;
				}
				if(tooBig && (i+1)%maxLetters == 0)
				{
					linePos += 6*pW;
					lines++;
					letterLoc = 0;
					newLine = true;
					justNewLined = true;
				}
			}
			if(!newLine || tooBig)
			{
				drawLetter(notG, " ", getStartX()+letterLoc, getStartY()+linePos);
				letterLoc += 3;
				letterLoc += spacing;
			}
		}
		setWidth(maxLetterLoc-spacing);
		if(!justNewLined)
		{
			setHeight(linePos+(5*pW));
		}
		else
		{
			setHeight(linePos);
		}
	}
	
	public void paintDot(Graphics notG)
	{
		drawWord(notG);
	}

}
