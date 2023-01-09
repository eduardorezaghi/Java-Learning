import java.awt.*;
import java.awt.event.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3ButtonsAnonymousIC extends Frame {
    private TextField tfCount;
    private Button btnCountUp, btnCountDown, btnReset;
    private int count = 0;

    // Constructor to setup the GUI components and event handlers
    public AWTCounter3ButtonsAnonymousIC() {
        setLayout(new FlowLayout());
        add(new Label("Counter")); // an anonymous instance of Label
        tfCount = new TextField("0", 5);
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds tfCount

        btnCountUp = new Button("Count Up");
        add(btnCountUp);
        // Construct an anonymous instance of an anonymous inner class.
        // The source Button adds the anonymous instance as ActionEvent listener
        btnCountUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + "");
            }

        });
        // Com expressão lambda
        // btnCountUp.addActionListener(evt -> { 
        // ++count; 
        // tfCount.setText(count + "");
        // });
        
        btnCountDown = new Button("Count Down");
        add(btnCountDown);
        btnCountDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count--;
                tfCount.setText(count + "");
            }
        });
        // Com expressão lambda
        // btnCountDown.addActionListener(evt -> {
        //     count--;
        //     tfCount.setText(count + "");
        // });

        btnReset = new Button("Reset");
        add(btnReset);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                count = 0;
                tfCount.setText("0");
            }
        });
        btnReset.addActionListener(evt -> {
             count = 0;
             tfCount.setText("0");
        });

        setTitle("AWT Counter");
        setSize(400, 100);
        setVisible(true);
    }

    // The entry main method
    public static void main(String[] args) {
        new AWTCounter3ButtonsAnonymousIC(); // Let the constructor do the job
    }
}