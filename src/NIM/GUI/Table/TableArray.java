package NIM.GUI.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableArray {
    private JPanel rootPanel;
    private JTextField textBanyak;
    private JButton buttonSave;
    private JTable tableNilai;
    private JTextField textData;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public TableArray() {
        this.initComponents();
        buttonSave.addActionListener(actionEvent -> {
            DefaultTableModel model = (DefaultTableModel) tableNilai.getModel();

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


            int c = Integer.parseInt(textBanyak.getText());

            if (!added) {
                for (int i = 0; i < c; i++) {
                    model.addRow(new Object[]{});
                }
                added = true;
            }
            int a = 0;
            for (int i : Sorting.getA(data,c)) {
                model.setValueAt(i,a,0);
                a++;
            }
            int b = 0;
            for (int i : Sorting.getD(data,c)) {
                model.setValueAt(i,b,1);
                b++;
            }
        });
    }

    private void initComponents () {
        Object[] tableColom = {
                "Ascending", "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tableNilai.setModel(tableModel);
        tableNilai.setAutoCreateRowSorter(true);
        tableNilai.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
