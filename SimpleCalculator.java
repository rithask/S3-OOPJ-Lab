/*
 * Write a Java program that works as a simple calculator.
 * Arrange Buttons for digits and the + - * % operations properly.
 * Add a text field to display the result. Handle any possible
 * exceptions like divide by zero. Use Java Swing.
 * 
 * ALGORITHM
 * 
 * Algorithm for main
 * 1. Start
 * 2. Create an object of SimpleCalculator
 * 3. Set the default close operation
 * 4. Set visible to true
 * 5. Stop
 * 
 * Algorithm for SimpleCalculator
 * 1. Start
 * 2. Create a text field
 * 3. Set editable to false
 * 4. Set horizontal alignment to right
 * 5. Set font
 * 6. Create a panel
 * 7. Set layout to grid layout
 * 8. Create an array of buttons
 * 9. Create an array of labels
 * 10. Create a variable index and set it to 0
 * 11. For rows = 0 to 3
 * 12.     For cols = 0 to 3
 * 13.         Set buttons[index] to a new button
 * 14.         Add buttons[index] to panel
 * 15.         Add action listener to buttons[index]
 * 16.         Increment index
 * 17. Create a panel content
 * 18. Set layout to border layout
 * 19. Add display to content
 * 20. Add panel to content
 * 21. Set content pane to content
 * 22. Pack
 * 23. Set title
 * 24. Set resizable to false
 * 25. Stop
 * 
 * Algorithm for actionPerformed
 * 1. Start
 * 2. Get the command
 * 3. If command is a digit or a decimal point
 * 4.     If start of number is true
 * 5.         Set display to command
 * 6.     Else
 * 7.         Append command to display
 * 8.     Set start of number to false
 * 9. Else if command is an operator
 * 10.    If start of number is false
 * 11.        Calculate the result
 * 12.        Set display to result
 * 13.    Set operator to command
 * 14.    Set start of number to true
 * 15. Else if command is =
 * 16.    Calculate the result
 * 17.    Set display to result
 * 18.    Set operator to =
 * 19.    Set start of number to true
 * 20. Stop
 * 
 * Algorithm for calculate
 * 1. Start
 * 2. If operator is +
 * 3.     Set result to result = result + number
 * 4. Else if operator is -
 * 5.     Set result to result = result - number
 * 6. Else if operator is *
 * 7.     Set result to result = result * number
 * 8. Else if operator is /
 * 9.     Set result to result = result / number
 * 10. Else if operator is =
 * 11.    Set result to number
 * 12. Stop
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;
    private String[] labels = { "7", "8", "9", "+", "4", "5", "6", "-",
            "1", "2", "3", "*", "0", ".", "=", "/" };
    private double result = 0;
    private String operator = "=";
    private boolean startOfNumber = true;

    public SimpleCalculator() {
        display = new JTextField("0", 12);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("SansSerif", Font.BOLD, 20));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        buttons = new JButton[16];
        int index = 0;
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                buttons[index] = new JButton(labels[index]);
                panel.add(buttons[index]);
                buttons[index].addActionListener(this);
                index++;
            }
        }
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout(5, 5));
        content.add(display, BorderLayout.NORTH);
        content.add(panel, BorderLayout.CENTER);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Simple Calculator");
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent evt) {
        String command = evt.getActionCommand();
        if ('0' <= command.charAt(0) && command.charAt(0) <= '9'
                || command.equals(".")) {
            if (startOfNumber == true)
                display.setText(command);
            else
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else {
            if (startOfNumber) {
                if (command.equals("-")) {
                    display.setText(command);
                    startOfNumber = false;
                } else
                    operator = command;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n) {
        if (operator.equals("+"))
            result += n;
        else if (operator.equals("-"))
            result -= n;
        else if (operator.equals("*"))
            result *= n;
        else if (operator.equals("/"))
            result /= n;
        else if (operator.equals("="))
            result = n;
        display.setText("" + result);
    }

    public static void main(String[] args) {
        SimpleCalculator frame = new SimpleCalculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
