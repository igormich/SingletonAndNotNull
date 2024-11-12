import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SimpleDraw {

    public static void main(String[] args) throws IOException {
        BufferedImage image = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillOval(0,0, image.getWidth(), image.getHeight());
        g2d.translate(image.getWidth()/2, image.getHeight()/2);
        g2d.rotate(0.3);
        g2d.setColor(new Color(128,0,128));
        String text = "Sample Text";
        g2d.setFont(g2d.getFont().deriveFont(36f));
        int textWidth = g2d.getFontMetrics().stringWidth(text);
        g2d.drawString(text,-textWidth/2,0);
        g2d.dispose();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        ImageIO.write(image, "JPG", new File("1.jpg"));
    }

}
