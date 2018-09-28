import javax.swing.*;
import java.awt.*;

public class Question4 {
    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;

    public static void main(String args[]) {
        JFrame frame = new JFrame();


        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        //Construct components
        JButton zoomIn = new JButton("Zoom In");
        JButton zoomOut = new JButton("Zoom Out");


        frame.add(zoomIn);
        frame.add(zoomOut);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        zoomIn.addActionListener(event -> {((CarShape) shape).increaseWidth(20);label.repaint();});
        zoomOut.addActionListener(event -> {((CarShape) shape).decreaseWidth(20);label.repaint();});

    }
}
