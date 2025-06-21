package ui.components;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SimpleTablePanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;

    public SimpleTablePanel(String[] columNames, Object[][] data) {
        setLayout(new BorderLayout());
        tableModel = new DefaultTableModel(data, columNames);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addRow(Object[] rowData) {
        tableModel.addRow(rowData);
    }

    public void removeRow(Integer rowIndex) {
        if (rowIndex >= 0 && rowIndex < this.tableModel.getRowCount()) {
            tableModel.removeRow(rowIndex);
        }
    }

    public JTable getTable() {
        return this.table;
    }

    public DefaultTableModel getModel() {
        return tableModel;
    }
}
