package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootpanel;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textAgama;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengabil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //Mengambil data dari textFakultas
                String fakultas = textFakultas.getText();
                //Mengambil data dari textJurusan
                String jurusan = textJurusan.getText();
                //Mengambil data dari textAgama
                String agama = textAgama.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                mhs.setFakultas(fakultas);
                mhs.setJurusan(jurusan);
                mhs.setAgama(agama);
                //Tampilkan output ke form
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
