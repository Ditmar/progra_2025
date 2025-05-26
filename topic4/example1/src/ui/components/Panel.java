package ui.components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Panel extends JPanel{
    public Panel () {
        super();
        this.setSize(new Dimension(100, 100));
        this.setBackground(Color.PINK);
        this.setLayout(null);
    }
}
