package ui;

import java.awt.Dimension;

import javax.swing.JFrame;

import ui.config.Config;

public class DashBoard extends JFrame {
    private String title;
    private Dimension dimension;

    public DashBoard(String title) {
        super(title);
        this.title = title;
        this.dimension = new Dimension(Config.WIDTH, Config.HEIGHT);
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

    private void initUi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initUi'");
    }
}
