package gov.app2;

import javax.swing.*;
import java.awt.*;

public class Star extends JPanel {
    @Override
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        int[] x1={235, 275, 315, 225, 325}; //c-a-b-e-d
        int[] y1={325, 250, 325, 275, 275};
        g.drawPolygon(x1,y1,5);
    }
}
