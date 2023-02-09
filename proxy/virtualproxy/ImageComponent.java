package headfirst.designpatterns.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {

        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (1280 - w)/2;
        int y = (1080 - h)/2;
        icon.paintIcon(this, g, x, y);
    }
}
