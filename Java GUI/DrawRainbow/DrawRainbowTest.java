import javax.swing.JFrame;

public class DrawRainbowTest 
{
    public static void main(String[] args) 
    {
        DrawRainbow panel = new DrawRainbow();
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(panel);
        window.setSize(400,250);
        window.setVisible(true);
    }
}
