import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


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
    	dots.add(new DotData(dotSize,dotSize,true,false,true,false,200,100,Color.BLUE,1));
    	dots.add(new DotData(dotSize,dotSize,false,true,true,false,100,200,Color.GREEN,3));
    	dots.add(new DotData(dotSize,dotSize,true,false,false,true,200,150,Color.ORANGE,2));
    	dots.add(new Letters("BIG BEEBEE", 2, 3));
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