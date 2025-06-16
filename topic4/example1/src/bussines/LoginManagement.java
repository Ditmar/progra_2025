package bussines;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import bussines.model.Credential;
import services.LoginServices;
import ui.DashBoard;
import ui.LoginWindow;

public class LoginManagement {
    private LoginWindow mainWindow;
    private LoginServices loginServices;

    public LoginManagement() {
        initServices();
        SwingUtilities.invokeLater(() -> {
            mainWindow = new LoginWindow("Hola Mundo");
            mainWindow.setOnLoginCallBack((credential) -> {
                validateFlowCredentials(credential);
            });
        });
    }

    private void validateFlowCredentials(Credential credential) {
        Boolean isValid = loginServices.isValidLogin(credential.getUserName(), credential.getPassword());
        if (isValid) {
            mainWindow.setVisible(false);
            new DashBoard("DashBoard");
        } else {
            JOptionPane.showMessageDialog(mainWindow, "Las credenciasles no son correctas", "Login Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initServices() {
        loginServices = new LoginServices();
    }
}
