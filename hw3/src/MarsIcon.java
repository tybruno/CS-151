import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 An icon that has the shape of the planet Mars.
 */
public class MarsIcon implements Icon
{
    /**
     Constructs a Mars icon of a given size.
     @param aSize the size of the icon
     */
    public MarsIcon(int aSize,String clr)
    {
        size = aSize;
        this.clr = clr;
    }

    /**
     * Changes the color of the image
     * @param newClr that the image will be changed too.
     */
    public void changeClr(String newClr){
        this.clr = newClr;
    }

    public int getIconWidth()
    {
        return size;
    }

    public int getIconHeight()
    {
        return size;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y,
                size, size);


        if (clr.equals("blue")){
            g2.setColor(Color.BLUE);
        }
        else if (clr.equals("green")){
            g2.setColor(Color.GREEN);
        }
        else{
            g2.setColor(Color.RED);
        }
        g2.fill(planet);
    }
    private String clr;
    private int size;
}
