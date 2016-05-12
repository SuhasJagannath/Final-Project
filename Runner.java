import javax.swing.JFrame;
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
   public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setTitle("Dud MIDI Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonComponent component = new ButtonComponent();

        frame.add(component);

        frame.setVisible(true);
    }
}
