package ui.components;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Label extends JLabel {
    private String content;
    public Label(String content) {
        super(content);
        this.setForeground(Color.white);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}
