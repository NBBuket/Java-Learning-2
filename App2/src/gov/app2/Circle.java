package gov.app2;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawOval(50, 50, 150, 150); //circle
    }
}
