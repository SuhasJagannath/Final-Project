import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Button implements ActionListener
{
    private int xLeft;
    private int yTop;
    private Color color;
    public Button(int x, int y, Color color)
    {
        xLeft = x;
        yTop = y;
        this.color = color;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle button = new Rectangle(xLeft, yTop, 50, 50);    
        g2.draw(button);
        g2.setPaint(color);
        g2.fill(button);
    }
}
