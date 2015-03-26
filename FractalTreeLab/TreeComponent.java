import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Color;

/**
 * Write a description of class TreeComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeComponent extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */

    private final int PANEL_WIDTH = 1000;
    private final int PANEL_HEIGHT = 1000;

    private final int TOPX = 500, TOPY = 775;
    private final int BOTTOMX = 500, BOTTOMY = 825;

    private int current;
    private int angle = 5;
    Random randomGenerator = new Random();
    /**
     * Default constructor for objects of class TreeComponent
     */
    public TreeComponent(int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void drawFractal (int order, int x1, int y1, int prevLength, int angles, Graphics page)
    {
        int deltaX, deltaY, x3, y3, x4, y4, length; 

        if (order == 1)
            page.drawLine (x1, y1, x2, y2);
        else
        {
            length = 50 - (order * 3);
            //deltaY = (randomGenerator.nextInt(40) + 1 - (order * 3));
            //deltaX = (int)Math.sqrt((length * length)-(deltaY * deltaY));
            //deltaX = x1 - x2 - (order * 3);
            //deltaY = y1 - y2 - (order * 3);
            
            x3 = x1 + deltaX;
            y3 = y1 + deltaY;

            x4 = x1 - deltaX;
            y4 = y1 + deltaY;
            page.drawLine (x2, y2, x3, y3);
            page.drawLine (x2, y2, x3, y3);
            drawFractal (order-1, x2, y2, x2, y2, page);
            drawFractal (order-1, x2, y2, x3, y3, page);
            //drawFractal (order-1, x1, y1, x4, y4, page);
        }
        
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        
        int randomColor = randomGenerator.nextInt(6);
        if(randomColor == 0)
        {
            page.setColor (Color.blue);
        }
        else if(randomColor == 1)
        {
            page.setColor (Color.green);
        }
        else if(randomColor == 2)
        {
            page.setColor (Color.red);
        }
        else if(randomColor == 3)
        {
            page.setColor (Color.white);
        }
        else if(randomColor == 4)
        {
            page.setColor (Color.yellow);
        }
        else if(randomColor == 5)
        {
            page.setColor (Color.orange);
        }


        drawFractal (current, TOPX, TOPY, BOTTOMX, angle, page);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder (int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder ()
    {
        return current;
    }
}
