package ui.components;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Label extends JLabel {
    private String content;
    private Component parent;
    public Label(String content) {
        super(content);
        this.setForeground(Color.white);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.content = content;
    }
    private Integer getCenterX() {
        if (this.parent == null) {
            throw new Error("The parent object was not defined parent is null, please use the relativeTo before the setPosition function to set the correct parent");
        }
        double centerLocation = 0.5 * ((double)this.parent.getWidth() - (double)this.getWidth()) ;
        return (int)centerLocation;
    }
    private Integer getCenterY() {
        double centerLocation = 0.5 * ((double)this.parent.getHeight() - (double)this.getHeight()) ;
        return (int)centerLocation;
    }
    public void setPosition(String horizontal) {
        if (horizontal.equals("center")) {
            this.setLocation(this.getCenterX(), this.getCenterY());
        }
    }
    public void setPosition(String horizontal, String vertical) {
        Integer positionX = 0;
        Integer positionY = 0;
        if (horizontal.equals("center")) {
            positionX = getCenterX();
        }
        if (vertical.equals("center")) {
            positionY = getCenterY();
        }
        if (vertical.equals("top")) {
            positionY = 0;
        }
        if (vertical.equals("bottom")) {
            positionY = this.parent.getHeight() - this.getHeight();
        }
        this.setLocation(positionX, positionY);
    }
    public void setPosition(String horizontal, Integer positionY) {
        Integer positionX = 0;
        if (horizontal.equals("center")) {
            positionX = getCenterX();
        }
        this.setLocation(positionX, positionY);
    }
    public void relativeTo(Component parent) {
        this.parent = parent;
    }
    public String getContent() {
        return this.content;
    }
}
