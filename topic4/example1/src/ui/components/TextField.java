package ui.components;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

import ui.components.utils.BaseComponent;
import ui.components.utils.Utils;
import ui.config.ColorConfig;

public class TextField extends JTextField implements BaseComponent {
    private String placeHolder;
    private Component parent;

    public TextField(String placeHolder) {
        super();
        this.setStyles();
        this.placeHolder = placeHolder;
        this.setText(placeHolder);
        this.initBasicEvents();

    }

    private void initBasicEvents() {
        this.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent event) {
                if (getText().equals(placeHolder)) {
                    setText("");
                }
            }

            public void focusLost(FocusEvent event) {
                if (getText().isEmpty()) {
                    setText(placeHolder);
                }
            }
        });
    }

    private void setStyles() {
        this.setForeground(ColorConfig.base);
        this.setBackground(ColorConfig.tColor);
        this.setCaretColor(ColorConfig.white);
        this.setSize(new Dimension(240, 40));
        this.setHorizontalAlignment(SwingConstants.CENTER);
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
