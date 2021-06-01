package NIM.GUI;

import javax.swing.*;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(actionEvent -> {
            //Mengambil data dr textNama
            String nama = textNama.getText();
            //Mengambil data dr textNIM
            String nim = textNIM.getText();
            //Proses
            Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
            //Tampilkan output ke Form
            labelHasil.setText(
                "Nama\t\t: " + mhs.getNama()
                + "\nNIM\t\t: " + mhs.getNim()
                + "\nJenjang Pendidikan\t\t: " + mhs.jenjangPendidikan()
                + "\nAngkatan\t\t: " + mhs.tm()
                + "\nFakultas\t\t: " + mhs.fakultas()
                + "\nProdi\t\t: " + mhs.prodi()
                + "\nJenis Kelamin\t\t: " + mhs.jenisKelamin()
                +"\nNomor urut Mahasiswa\t\t: " + mhs.noUM() +"\n"
            );
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
