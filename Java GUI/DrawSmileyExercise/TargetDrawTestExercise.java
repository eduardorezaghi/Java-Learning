import javax.swing.JFrame;

;
public class TargetDrawTestExercise 
{
    public static void main(String[] args) {
        TargetDrawExercise panel = new TargetDrawExercise();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
