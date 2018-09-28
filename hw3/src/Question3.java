import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Question 3 Prompt:
 * Write a program that shows a frame with three buttons labeled “Red”, “Green”, and “Blue”, and
 * a label containing an icon showing a circle that is initially red. As the user clicks the buttons, the
 * fill color of the circle should change. When you change the color, you need to invoke the repaint
 * method on the label. The call to repaint ensures that the paintIcon method is called so that
 * the icon can be repainted with the new color.
 */
public class Question3 {

    public static class CircleIcon {
        /**
         * Constructs a Circle icon of a given size.
         *
         * @param aSize the size of the icon
         */

        private int size;
        public CircleIcon(int aSize) {
            size = aSize;

        }


        public int getIconWidth() {
            return size;

        }


        public int getIconHeight() {
            return size;

        }


        public void paintIcon(Component c, Graphics g, int x, int y, String color) {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
                    size, size);
            if (color.equals("Red")){
                g2.setColor(Color.RED);
            }
            else if (color.equals("Blue")){
                g2.setColor(Color.BLUE);
            }
            else if (color.equals("Green")){
                g2.setColor(Color.GREEN);
            }

            g2.fill(circle);

        }

//        public void paintIcon(Component c, Graphics g, int x, int y) {
//            Graphics2D g2 = (Graphics2D) g;
//            Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
//                    size, size);
//            g2.setColor(Color.RED);
//
//            g2.fill(circle);
//
//        }
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame();


        MarsIcon circle = new MarsIcon(20,"red");



        final JLabel label = new JLabel(circle);

        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //Construct components
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");



        //Button listener
        blue.addActionListener(event -> {circle.changeClr("blue");label.repaint();});
        red.addActionListener(event -> {circle.changeClr("red");label.repaint();});
        green.addActionListener(event -> {circle.changeClr("green");label.repaint();});

        //Set frame layout
        frame.setLayout(new FlowLayout());

        //Add components to frame
        frame.add(red);
        frame.add(blue);
        frame.add(green);


        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
