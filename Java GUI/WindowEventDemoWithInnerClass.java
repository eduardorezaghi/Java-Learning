import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemoWithInnerClass extends Frame {
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public WindowEventDemoWithInnerClass () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);
      add(tfCount);
 
      btnCount = new Button("Count");
      add(btnCount);
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      // Allocate an anonymous instance of an anonymous inner class
      // that implements WindowListener.
      // "super" Frame adds this instance as WindowEvent listener.
      addWindowListener(new WindowListener() {
         @Override
         public void windowClosing(WindowEvent evt) {
            System.exit(0);  // terminate the program
         }
         // Need to provide an empty body for compilation
         @Override public void windowOpened(WindowEvent evt) { }
         @Override public void windowClosed(WindowEvent evt) { }
         @Override public void windowIconified(WindowEvent evt) { }
         @Override public void windowDeiconified(WindowEvent evt) { }
         @Override public void windowActivated(WindowEvent evt) { }
         @Override public void windowDeactivated(WindowEvent evt) { }
      });
 
      setTitle("WindowEvent Demo");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new WindowEventDemoWithInnerClass();   // Let the constructor do the job
   }
}