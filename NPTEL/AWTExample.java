import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");

        Label label = new Label("Enter your name:");
        label.setBounds(50, 80, 120, 30);

        TextField textField = new TextField();
        textField.setBounds(180, 80, 150, 30);

        Button button = new Button("Submit");
        button.setBounds(100, 150, 80, 30);

        // Event handling
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                frame.setTitle("Hello, " + name);
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setLayout(null); // manual positioning
        frame.setVisible(true);
    }
}
