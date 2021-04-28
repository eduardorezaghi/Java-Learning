import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTCounterAnonymousInnerClass extends Frame {
 
   // The event-handler actionPerformed() needs to access these private variables
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout());  // "super" Frame sets to FlowLayout
      add(new Label("Counter"));    // An anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // read-only
      add(tfCount);                 // "super" Frame adds tfCount
 
      btnCount = new Button("Count");
      add(btnCount);                // "super" Frame adds btnCount
 
      // Construct an anonymous instance of an anonymous class.
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
      // com expressão lambda
      // btnCount.addActionListener(evt -> tfCount.setText(++count + ""));
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass(); // Let the constructor do the job
   }
}