// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

// desenha um X a partir dos cantos do painel
public class DrawPanelExercise extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        int width = getWidth();  // largura total
        int height  = getHeight(); // altura total

        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        
        int step = 1;
        while (step <= 15) 
        {
            g.drawLine(0, 0, height, width);
            step++;
        }
            
        
        

        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        
    }
}