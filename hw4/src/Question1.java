import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Question1
{
//    public static void frame1() {
//        JFrame frame = new JFrame();
//        frame.setLayout(new FormLayout());
//
//        final int FIELD_WIDTH = 5;
//        JTextField textField = new JTextField(FIELD_WIDTH);
//        JTextField textField2 = new JTextField(FIELD_WIDTH);
//        JTextField textField3 = new JTextField(FIELD_WIDTH);
//
//
//        frame.add(new JLabel("Number 1"));
//        frame.add(textField);
//        frame.add(new JLabel("Number 2"));
//        frame.add(textField2);
//        frame.add(new JLabel("Number 3"));
//        frame.add(textField3);
//        frame.pack();
//
//        ArrayList<Double> values = new ArrayList<>();
//
//        values.add((Double.parseDouble(textField.getText())));
//
//        textField.addActionListener(event -> {;});
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.pack();
//        frame.setVisible(true);
//
//
//    }

    public static void frame2(){
        JFrame frame = new JFrame();
        frame.setLayout(new FormLayout());



    }

    public static void paint(ArrayList<Double> values, Graphics g){

        int icon_height = 150;
        int icon_width = 150;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
        double maxValue = findMaxValueInArrayList(values);

        double barHeight = icon_height/ (double) values.size();

        int i = 0;

        for(Double value: values){
            double barLen = (icon_width * value / maxValue);
            Rectangle2D.Double rectangle = new Rectangle2D.Double(0,i++ * barHeight,barLen,barHeight);
            g2d.fill(rectangle);
        }

    }

    public static double findMaxValueInArrayList(ArrayList<Double> values){
        Double maxValue = values.get(0);
        for(Double value: values){
            if(maxValue < value)
            {
                maxValue = value;
            }
        }

        return maxValue;
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        ArrayList<Double> list = new ArrayList<>();
        list.add(0.0);
        list.add(0.0);
        list.add(0.0);
        BarFrame barFrame = new BarFrame(list);
        frame.setLayout(new FormLayout());

        final int FIELD_WIDTH = 5;

        JTextField textField = new JTextField(FIELD_WIDTH);
        JTextField textField2 = new JTextField(FIELD_WIDTH);
        JTextField textField3 = new JTextField(FIELD_WIDTH);


        frame.add(new JLabel("Number 1"));
        frame.add(textField);
        frame.add(new JLabel("Number 2"));
        frame.add(textField2);
        frame.add(new JLabel("Number 3"));
        frame.add(textField3);
        frame.pack();
        try {
            textField.addActionListener(event -> {
                barFrame.modifyData(0, Double.parseDouble(textField.getText()));
                barFrame.repaint();
            });
            textField2.addActionListener(event -> {
                barFrame.modifyData(1, Double.parseDouble(textField2.getText()));
                barFrame.repaint();
            });
            textField3.addActionListener(event -> {
                barFrame.modifyData(2, Double.parseDouble(textField3.getText()));
                barFrame.repaint();
            });
        }
        catch (java.lang.NumberFormatException e){
            System.out.println("Field is empty: " + e);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);




    }
}
