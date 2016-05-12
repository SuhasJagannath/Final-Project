import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Write a description of class ButtonComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Button sound1 = new SoundButton(0, 0, Color.red);
        Button sound2 = new SoundButton(60, 0, Color.red);
        Button sound3 = new SoundButton(120, 0, Color.red);
        Button sound4 = new SoundButton(0, 60, Color.red);
        Button sound5 = new SoundButton(60, 60, Color.red);
        Button sound6 = new SoundButton(120, 60, Color.red);
        Button sound7 = new SoundButton(0, 120, Color.red);
        Button sound8 = new SoundButton(60, 120, Color.red);
        Button sound9 = new SoundButton(120, 120, Color.red);
        Button record = new RecButton(190, 0, Color.green);
        Button play = new PlaybackButton(190, 60, Color.green);
        Button profile = new ProfileControlButton(190, 120, Color.green);
        sound1.draw(g2);
        sound2.draw(g2);
        sound3.draw(g2);
        sound4.draw(g2);
        sound5.draw(g2);
        sound6.draw(g2);
        sound7.draw(g2);
        sound8.draw(g2);
        sound9.draw(g2);
        record.draw(g2);
        play.draw(g2);
        profile.draw(g2);
    }
}
