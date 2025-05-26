import javax.swing.SwingUtilities;

import ui.MainWindow;

public class App {
    public static void main(String[] args) { 

        //UiThread thread = new UiThread();
        SwingUtilities.invokeLater(() -> {
            new MainWindow("Hola Mundo");
        });
    }
}
