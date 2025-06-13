package ui.components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JComboBox;

import ui.components.utils.BaseComponent;
import ui.components.utils.Utils;
import ui.config.ColorConfig;

public class ComboBox<T> extends JComboBox<T> implements BaseComponent {
    Component parent;

    public ComboBox() {
        this.setStyles();
    }

    public void setStyles() {
        this.setForeground(ColorConfig.base);
        this.setBackground(ColorConfig.tColor);
        this.setSize(new Dimension(200, 50));

    }

    @Override
    public void setPosition(String horizontal) {
        if (horizontal.equals("center")) {
            this.setLocation(Utils.getCenterX(parent, this), Utils.getCenterY(parent, this));
        }
    }

    @Override
    public void setPosition(String horizontal, String vertical) {
        Point position = Utils.setPosition(parent, this, horizontal, vertical);
        this.setLocation((int) position.getX(), (int) position.getY());
    }

    @Override
    public void setPosition(String horizontal, Integer positionY) {
        Integer positionX = 0;
        if (horizontal.equals("center")) {
            positionX = Utils.getCenterX(parent, this);
        }
        this.setLocation(positionX, positionY);
    }

    @Override
    public void relativeTo(Component parent) {
        this.parent = parent;
    }
}
