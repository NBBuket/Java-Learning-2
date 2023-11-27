package gov.app2;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        int[] x = {125, 175, 75};
        int[] y = {250, 350, 350};
        g.drawPolygon(x, y, 3); //triangle
    }
}
