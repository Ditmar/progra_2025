package ui;

import java.awt.Color;
import java.awt.Dimension;

import ui.components.Label;
import ui.components.Panel;

import javax.swing.JFrame;

import ui.config.ColorConfig;
import ui.config.Config;

public class MainWindow extends JFrame{
    private String title;
    private Dimension dimension;
    private Panel leftPanel, rightPanel;
    public MainWindow(String title) {
        super(title);
        this.title = title;
        this.dimension = new Dimension(Config.WIDTH, Config.HEIGHT);
        this.initConfig();
        this.initUi();
    }
    public MainWindow(String title, Dimension dimension) {
        super(title);
        this.title = title;
        this.dimension = dimension;
        this.initConfig();
        this.initUi();
       
    }
    private void initConfig() {
        this.setSize(new Dimension(this.dimension));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initUi () {
        setPanels();
        setLabels();
    }

    private void setLabels() {
        Label label = new Label("Curso de Programacion 2 ");
        label.setSize(new Dimension(200, 20));
        label.setLocation(100, 20);
        leftPanel.add(label);
    }
    private void setPanels() {
        leftPanel = new Panel();
        leftPanel.setSize(new Dimension(700, 500));
        leftPanel.setLocation(0, 0);
        leftPanel.setBackground(ColorConfig.primary);
        //------------------------------
        this.add(leftPanel);
        rightPanel = new Panel();
        rightPanel.setSize(new Dimension(700, 500));
        rightPanel.setLocation(400, 0);
        rightPanel.setBackground(ColorConfig.secondary);
        this.add(rightPanel);
    }
    public String getTitle() {
        return title;
    }
}
