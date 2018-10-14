import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class BarFrame extends JFrame implements ChangeListener {
    private ArrayList<Double> data;

    public BarFrame(ArrayList<Double> data){
        final int ICON_WIDTH = 150;
        final int ICON_HEIGHT = 150;
        this.data = data;

        setLocation(0, 100);

        setLayout(new BorderLayout());
        Icon bar = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.blue);
                double barHeight = getIconHeight() / (double) data.size();

                double maxValue = findMaxValueInArrayList(data);

                int i = 0;
                for(Double value: data){
                    double barLen = (getIconWidth() * value / maxValue);
                    Rectangle2D.Double rectangle = new Rectangle2D.Double(0,i++ * barHeight,barLen,barHeight);
                    g2.fill(rectangle);
                }
            }

            public double findMaxValueInArrayList(ArrayList<Double> values){
                Double maxValue = values.get(0);
                for(Double value: values){
                    if(maxValue < value)
                    {
                        maxValue = value;
                    }
                }

                return maxValue;
            }

            @Override
            public int getIconWidth() {
                return ICON_WIDTH;
            }

            @Override
            public int getIconHeight() {
                return ICON_HEIGHT;
            }
        };
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel(bar));

        pack();
        setVisible(true);

    }
    public void stateChanged(ChangeEvent e){
        repaint();
    }
    public void modifyData(int index, double newData){

        data.set(index, newData);

    }


}
