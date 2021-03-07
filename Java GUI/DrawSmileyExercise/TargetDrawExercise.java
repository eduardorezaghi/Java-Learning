import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class TargetDrawExercise extends JPanel
{
	private static final SecureRandom randomNumber = new SecureRandom();
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Color randomColor1 = new Color(1 + randomNumber.nextInt(255),1 + randomNumber.nextInt(255),1 + randomNumber.nextInt(255));
		Color randomColor2 = new Color(1 + randomNumber.nextInt(255),1 + randomNumber.nextInt(255),1 + randomNumber.nextInt(255));
		
		// desenha o circulo mais interno
		g.setColor(randomColor1);
		g.fillOval(50, 50, 100, 100);

		g.setColor(randomColor2);
		g.fillOval(75, 50, 75, 75);
	}
}