package ui;

import java.awt.Dimension;

public class UiThread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        new MainWindow("Hola Mundo", new Dimension(300, 300));
    }
    
}
