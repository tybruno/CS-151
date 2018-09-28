import javax.swing.*;
public class CarIconTester {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(
                null,
                "Hello, Car!",
                "Message",
                JOptionPane.INFORMATION_MESSAGE,
                new CarIcon(100));
        System.exit(0);
    }
}
