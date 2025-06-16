package ui;

import java.awt.Dimension;

import ui.components.Button;
import ui.components.CheckBox;
import ui.components.ComboBox;
import ui.components.Image;
import ui.components.Label;
import ui.components.Panel;
import ui.components.PasswordField;
import ui.components.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import ui.config.ColorConfig;
import ui.config.Config;
import ui.config.ImagePath;
import ui.config.Pointer;
import ui.config.Typography;

import bussines.interfaces.HandlerLogin;
import bussines.model.Credential;

public class LoginWindow extends JFrame {
    private String title;
    private Dimension dimension;
    private Panel leftPanel, rightPanel;
    private HandlerLogin handlerLogin;
    private TextField username;
    private PasswordField password;

    public LoginWindow(String title) {
        super(title);
        this.title = title;
        this.dimension = new Dimension(Config.WIDTH, Config.HEIGHT);
        this.initConfig();
        this.initUi();
    }

    public LoginWindow(String title, Dimension dimension) {
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

    public void setOnLoginCallBack(HandlerLogin handlerLogin) {
        this.handlerLogin = handlerLogin;
    }

    private void initUi() {
        setPanels();
        setLabels();
        setTextFields();
        setCombo();
        setButtons();
        setCheckBox();
        setImages();

    }

    private void setLabels() {
        Label label = new Label("Curso de Programacion 2 ");
        label.setSize(new Dimension(500, 30));
        label.relativeTo(leftPanel);
        label.setFont(Typography.MontSerratBoldDisplay1);
        label.setPosition("center");

        Label registerLabel = new Label("Registro de usuarios ");
        registerLabel.setSize(new Dimension(200, 20));

        double centerLocation2 = 0.5 * ((double) rightPanel.getWidth() - (double) registerLabel.getWidth());
        registerLabel.setLocation((int) centerLocation2, 20);

        rightPanel.add(registerLabel);
        leftPanel.add(label);
    }

    private void setPanels() {
        leftPanel = new Panel();
        leftPanel.setSize(new Dimension(700, Config.HEIGHT));
        leftPanel.setLocation(0, 0);
        leftPanel.setBackground(ColorConfig.primary);
        // ------------------------------
        this.add(leftPanel);
        rightPanel = new Panel();
        rightPanel.setSize(new Dimension(500, Config.HEIGHT));
        rightPanel.setLocation(700, 0);
        rightPanel.setBackground(ColorConfig.secondary);
        this.add(rightPanel);
    }

    private void setTextFields() {
        username = new TextField("Nombre de usuario");
        username.relativeTo(rightPanel);
        username.setPosition("center", 100);
        password = new PasswordField("Password");
        password.relativeTo(rightPanel);
        password.setPosition("center", 150);
        rightPanel.add(username);
        rightPanel.add(password);

    }

    private void setCombo() {
        ComboBox<String> combo = new ComboBox<String>();
        combo.relativeTo(rightPanel);
        combo.setPosition("center", 200);
        combo.addItem("Administrador");
        combo.addItem("Cajero");
        combo.addItem("Usuario");
        rightPanel.add(combo);
    }

    private void setButtons() {
        Button button = new Button("Entrar");
        button.setSize(new Dimension(300, 50));
        button.relativeTo(rightPanel);
        button.setPosition("center", 260);
        button.setCursor(Pointer.HAND_CURSOR);
        button.addActionListener((event) -> {
            Credential credential = new Credential(this.username.getText(), this.password.getText());
            this.handlerLogin.clickLogin(credential);
        });
        rightPanel.add(button);
    }

    private void setCheckBox() {
        CheckBox checkbox = new CheckBox("Hombre");
        checkbox.relativeTo(rightPanel);
        checkbox.setPosition("center", 320);
        CheckBox checkboxNo = new CheckBox("Mujer");
        checkboxNo.relativeTo(rightPanel);
        checkboxNo.setPosition("center", 370);
        rightPanel.add(checkboxNo);
        rightPanel.add(checkbox);
        ButtonGroup group = new ButtonGroup();
        group.add(checkbox);
        group.add(checkboxNo);
    }

    private void setImages() {
        // ImageIcon icon = new ImageIcon(ImagePath.mainHero);
        Image image = new Image(ImagePath.mainHero);
        image.relativeTo(leftPanel);
        image.setLocation(0, 0);
        image.setSize(new Dimension(700, 600));
        leftPanel.add(image);
    }

    public String getTitle() {
        return title;
    }
}
