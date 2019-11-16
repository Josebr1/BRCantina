package br.com.cruzeiro.ads.brcantina.components.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class JTableModel<T> extends AbstractTableModel {

    private List<T> models = new ArrayList<>();
    private String[] columnNames;

    public JTableModel(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public void load(List<T> models) {
        this.models = models;
        fireTableDataChanged();
    }

    public T getSelectedAt(int index) {
        if (this.models.size() <= 0){
            return null;
        }
        return this.models.get(index);
    }

    @Override
    public int getRowCount() {
        return this.models.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (this.models.size() <= 0) {
            return null;
        }
        return this.models.get(columnIndex);
    }
}
