package table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

public class ExampleTable1 {
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textHp;
    private JTable tableBiodata;
    private JPanel rootPanel;
    private JButton buttonsave;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponents();
        buttonsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String email = textEmail.getText();
                String hp = textHp.getText();
                tableModel.addRow( new Object[]{nama, email, hp});
                textNama.setText("");
                textEmail.setText("");
                textHp.setText("");
                if(nama.isBlank() || email.isBlank() || hp.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Lengkapi data terlebih dahulu",
                            "warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColoum = {
                "Nama",
                "Email",
                "Hp",
        };
        Object[][] initData = {
                {"Ahmad Hadrian", "iyanhadrian46@gmail.com", "082297980504"},
                {"hadrian Ahmad", "hadrianiyan64@gmail.com", "082298970405"},
        };
        tableModel = new DefaultTableModel(initData, tableColoum);
        tableBiodata.setModel(tableModel);
        tableBiodata.setAutoCreateRowSorter(true);
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
