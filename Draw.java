import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    static int x = 50;

    public Draw() {
        JFrame jFrame = new JFrame("Coordinates X Y");
        jFrame.setLocation(150, 50);
        jFrame.setMinimumSize(new Dimension(800, 600));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JPanel jPanel = new JPanel();
        jFrame.getContentPane().add(this);

        jFrame.pack();
        jFrame.setVisible(true);
        repaint();
    }

    @Override
    public void paint(Graphics graphics) {

        super.paintComponent(graphics);

        graphics.setColor(Color.RED);
        //graphics.fillRect(25, 25, 50, 50);

        //graphics.setColor(Color.BLUE);
        //graphics.fillRect(100, 100, 100, 100);
        graphics.drawLine(0, 0 , 100, 100);
    }

}
