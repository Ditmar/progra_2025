package ui.components;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;

public class List<E> extends JPanel {
    private JList<E> list;
    private DefaultListModel modelList;

    public List() {
        super();
        setLayout(new BorderLayout());
        this.modelList = new DefaultListModel<E>();
        this.list = new JList<>(this.modelList);
        settings();
    }

    private void settings() {
        this.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrolPane = new JScrollPane(this.list);
        this.add(scrolPane, BorderLayout.CENTER);
    }

    public void addItem(E item) {
        this.modelList.addElement(item);
    }

    public void removeSelectItem() {
        Integer selectedIndex = this.list.getSelectedIndex();
        if (selectedIndex != -1) {
            this.modelList.remove(selectedIndex);
        }
    }

    public E getSelectItem() {
        return this.list.getSelectedValue();
    }

    public JList<E> getList() {
        return this.list;
    }
}
