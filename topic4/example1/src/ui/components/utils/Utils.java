package ui.components.utils;

import java.awt.Component;
import java.awt.Point;

public class Utils {
    public static Integer getCenterX(Component parent, Component child) {
        if (parent == null) {
            throw new Error(
                    "The parent object was not defined parent is null, please use the relativeTo before the setPosition function to set the correct parent");
        }
        double centerLocation = 0.5 * ((double) parent.getWidth() - (double) child.getWidth());
        return (int) centerLocation;
    }

    public static Integer getCenterY(Component parent, Component child) {
        double centerLocation = 0.5 * ((double) parent.getHeight() - (double) child.getHeight());
        return (int) centerLocation;
    }

    public static Point setPosition(Component parent, Component child, String horizontal, String vertical) {
        Integer positionX = 0;
        Integer positionY = 0;
        if (horizontal.equals("center")) {
            positionX = Utils.getCenterX(parent, child);
        }
        if (vertical.equals("center")) {
            positionY = Utils.getCenterY(parent, child);
        }
        if (vertical.equals("top")) {
            positionY = 0;
        }
        if (vertical.equals("bottom")) {
            positionY = parent.getHeight() - child.getHeight();
        }
        return new Point(positionX, positionY);
    }
}
