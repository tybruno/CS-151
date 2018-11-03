import javax.swing.*;
import java.awt.*;

/**
 * Tyler Bruno 010151570
 * CS 151
 * Exam 2
 * Question 2:
 * Implement a program that contains a slider and a car icon. The size of the car should
 * increase or decrease as the slider is moved.
 */

public class CarIconTester {

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;

    public static void main(String args[]) {
        //Create frame
        JFrame frame = new JFrame();

        //Create car shape
        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());

        //Construct components
        JSlider slider = new JSlider();
        slider.setValue(50);
        JLabel sliderLabel = new JLabel("Size");

        //Add components
        frame.add(label);
        frame.add(slider);
        frame.add(sliderLabel);

        //Width change listener
        slider.addChangeListener(event->{
            ((CarShape) shape).setWidth(slider.getValue());
            label.repaint();
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
