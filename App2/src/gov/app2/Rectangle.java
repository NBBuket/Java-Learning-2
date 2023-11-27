package gov.app2;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawRect(250, 50, 50, 150 ); //rectangle
    }
}
