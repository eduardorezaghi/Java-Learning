import java.awt.*;
import java.awt.event.*;

import org.graalvm.compiler.nodes.NodeView.Default;

// An AWT GUI program inherits from the top-level container java.awt.Frame
public class KeyEventDemo extends Frame {

   private TextField tfInput;  // Single-line TextField to receive tfInput key
   private TextArea taDisplay; // Multi-line TextArea to taDisplay result

   // Constructor to setup the GUI components and event handlers
   public KeyEventDemo() {
      setLayout(new FlowLayout()); // "super" frame sets to FlowLayout

      add(new Label("Enter Text: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40); // 5 rows, 40 columns
      add(taDisplay);

      tfInput.addKeyListener(new MyKeyListener());
         // tfInput TextField (source) fires KeyEvent.
         // tfInput adds an anonymous instance of MyKeyListener
         //   as a KeyEvent listener.

      setTitle("KeyEvent Demo"); // "super" Frame sets title
      setSize(400, 200);         // "super" Frame sets initial size
      setVisible(true);          // "super" Frame shows
   }

   // The entry main() method
   public static void main(String[] args) {
      new KeyEventDemo();  // Let the constructor do the job
   }

   // Define an inner class to handle KeyEvent
   private class MyKeyListener implements KeyListener {
      // Called back when a key has been typed (pressed and released)
      @Override
      public void keyTyped(KeyEvent evt) {
         taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
      }
    
      // Not Used, but need to provide an empty body for compilation
      @Override public void keyPressed(KeyEvent evt) { }
      @Override public void keyReleased(KeyEvent evt) { }
   }
} 