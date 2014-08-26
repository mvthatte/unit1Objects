import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL (
            "http://www.companycasuals.com/catalog/images/customer/JCheezyWear/309734_PC61_Black_Front_FS06.jpg");
        JOptionPane.showMessageDialog(null, "J.CHEEZY", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}