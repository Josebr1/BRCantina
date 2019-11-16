package br.com.cruzeiro.ads.brcantina.components.jtable;

import br.com.cruzeiro.ads.brcantina.components.model.JTableModel;

import java.util.List;

public class JTable<T> extends javax.swing.JTable {

    private JTableModel model;

    public JTable(String[] columnNames, Class<?>[] columnTypes) throws IllegalAccessException {
        this.model = new JTableModel(columnNames);
        super.setModel(this.model);
    }

    public void load(List list) {
        this.model.load(list);
    }

    public T getSelected() {
        int index = getSelectedRow();
        return (T)this.model.getSelectedAt(index);
    }

}
