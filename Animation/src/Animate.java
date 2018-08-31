import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


final public class Animate {

    JFrame frame;
    DrawPanel drawPanel;

    private int canLen = 600; // Canvas length
    private int canHig = 600; // Canvas height
    private int dotSize = 40;
    
    private ArrayList<DotData> dots = new ArrayList<DotData>();
    
    
    public static void main(String[] args) {
        new Animate().go();
    }

    private void go() {
    	Scanner scanner = new Scanner(System.in);
    	dots.add(new DotData(30, 55, 34, 1,Util.randomColor(),1));
    	dots.add(new DotData(20,1,Color.GREEN,3));
    	dots.add(new DotData(15,0,Color.ORANGE,2));
    	dots.add(new Letters("WOW noah SUCKS.", 2, 2, 10));
    	dots.add(new Letters("AAAAAAAAA", 5, 2, 3));
    	dots.add(new Letters(140, 24, 0, "A", 10));
    	dots.add(new Letters(140, 5, 0, "wHY ARE YOU HERE?", 5));
    	dots.add(new Letters(140, 24, 0, "WELCOME TO MY GALLERY WALK!", 4));
    	dots.add(new Letters("THIS LOOKS WACK!", 5, 2, 12, Color.RED));
    	dots.add(new Letters(150, 240, "AAAHHHHH", 7, 5, 8));
    	dots.add(new Letters(150, 240, "AAAHHHHH", 7, 5, 6));
    	System.out.println("Write something!");
    	dots.add(new Letters(150, 240, scanner.nextLine(), 7, 5, 4));
    	for(int x = 1; x < 4; x++)
    	{
    		/*for(int i = 1; i < 10+x; i++)
        	{
        		dots.add(new DotData(i*4,i*4,true,false,false,true,200,150,new Color(255,255-(x*4),i*4),x));
        	}*/
    	}
    	
    	dots.add(new UniqueDot());
    	frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(canLen, canHig);
        frame.setLocation(375, 55);
        moveDot();
    }

    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		
		public void paintComponent(Graphics g) {
        	//White Border
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            //Black Border
            g.setColor(Color.BLACK);
            g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
            //Inside Color
            g.setColor(Color.WHITE);
            g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
            
            //Dot
            
            for(DotData dot : dots)
            {

            	dot.checkBounds(canLen,canHig);
            	dot.moveLoc();
            	dot.paintDot(g); // This is the dot
            }
            //g.fillRect(oneX + 2, oneY - 2, 2, 10);
            //g.fillRect(oneX - 2, oneY + 2, 10, 2);
        }
    }

    private void moveDot() {
        while(true){
            for(DotData dot : dots)
            {
                dot.moveLoc();
            }
            try{
                Thread.sleep(10);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
}