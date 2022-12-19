/*
 * Traffic Light Simulation using Swing
 * Write a Java program that simulates a traffic light. The program lets
 * the user select one of three lights: red, yellow, or green. When a radio
 * button is selected, the light is turned on, and only one light can be
 * on at a time. No light is on when the program starts.
 * 
 * ALGORITHM
 * 
 * Algorithm for main
 * 1. Start
 * 2. Create a TrafficLightFrame object
 * 3. Set the default close operation
 * 4. Set visible to true
 * 5. Stop
 * 
 * Algorithm for TrafficLightFrame
 * 1. Start
 * 2. Set title
 * 3. Set size
 * 4. Create a panel
 * 5. Set layout to grid layout
 * 6. Create an action listener
 * 7. Create a radio button for red
 * 8. Add action listener to red
 * 9. Add red to panel
 * 10. Create a radio button for yellow
 * 11. Add action listener to yellow
 * 12. Add yellow to panel
 * 13. Create a radio button for green
 * 14. Add action listener to green
 * 15. Add green to panel
 * 16. Create a button group
 * 17. Add red, yellow, and green to group
 * 18. Add panel to north
 * 19. Create a light panel
 * 20. Add light panel to center
 * 21. Stop
 * 
 * Algorithm for LightPanel
 * 1. Start
 * 2. Call paintComponent
 * 3. If red light is on
 * 4.     Set color to red
 * 5. Else if yellow light is on
 * 6.     Set color to yellow
 * 7. Else if green light is on
 * 8.     Set color to green
 * 9. Else
 * 10.    Set color to gray
 * 11. Fill oval
 * 12. Stop
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight {
    public static void main(String[] args) {
        TrafficLightFrame frame = new TrafficLightFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static class TrafficLightFrame extends JFrame {
        public TrafficLightFrame() {
            setTitle("Traffic Light");
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1));
            ActionListener listener = new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    if (event.getSource() == redButton) {
                        redLightOn = true;
                        yellowLightOn = false;
                        greenLightOn = false;
                    }
                    else if (event.getSource() == yellowButton) {
                        yellowLightOn = true;
                        greenLightOn = false;
                        redLightOn = false;
                    }
                    else if (event.getSource() == greenButton) {
                        greenLightOn = true;
                        yellowLightOn = false;
                        redLightOn = false;
                    }
                    repaint();
                }
            };
            redButton = new JRadioButton("Red");
            redButton.addActionListener(listener);
            panel.add(redButton);
            yellowButton = new JRadioButton("Yellow");
            yellowButton.addActionListener(listener);
            panel.add(yellowButton);
            greenButton = new JRadioButton("Green");
            greenButton.addActionListener(listener);
            panel.add(greenButton);
            ButtonGroup group = new ButtonGroup();
            group.add(redButton);
            group.add(yellowButton);
            group.add(greenButton);
            add(panel, BorderLayout.NORTH);
            lightPanel = new LightPanel();
            add(lightPanel, BorderLayout.CENTER);
        }

        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 400;
        private JRadioButton redButton;
        private JRadioButton yellowButton;
        private JRadioButton greenButton;
        private LightPanel lightPanel;
        private boolean redLightOn = false;
        private boolean yellowLightOn = false;
        private boolean greenLightOn = false;

        public class LightPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x = getWidth() / 2 - 20;
                int y = getHeight() / 2 - 50;
                if (redLightOn) {
                    g.setColor(Color.RED);
                    g.fillOval(x, y, 40, 40);
                }
                if (yellowLightOn) {
                    g.setColor(Color.YELLOW);
                    g.fillOval(x, y + 50, 40, 40);
                }
                if (greenLightOn) {
                    g.setColor(Color.GREEN);
                    g.fillOval(x, y + 100, 40, 40);
                }
            }
        }
    }


}
