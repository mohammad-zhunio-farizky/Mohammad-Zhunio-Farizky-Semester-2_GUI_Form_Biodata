package NIM.GUI.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableArray {
    private JPanel rootPanel;
    private JTextField textData;
    private JButton buttonSave;
    private JTable tableNilai;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public TableArray() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String data = textData.getText();
                if (data.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Belum Lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    tableModel.addRow(new Object[]{data});
                    //clear textField
                    textData.setText("");
                }
            }
        });
    }

    private void initComponents () {
        Object[] tableColom = {
                "Data"
        };
        Object[][] initData = {};
        tableModel = new DefaultTableModel(initData, tableColom);
        tableNilai.setModel(tableModel);
        tableNilai.setAutoCreateRowSorter(true);
        tableNilai.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
