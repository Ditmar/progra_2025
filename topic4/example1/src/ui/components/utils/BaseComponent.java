package ui.components.utils;

import java.awt.Component;

public interface BaseComponent {
    void setPosition(String horizonta);

    void setPosition(String horizontal, String vertical);

    void setPosition(String horizontal, Integer positionY);

    void relativeTo(Component parent);
}
