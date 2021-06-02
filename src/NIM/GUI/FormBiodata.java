package NIM.GUI;

import javax.swing.*;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelNama;
    private JLabel labelNIM;
    private JLabel labelJP;
    private JLabel labelAkt;
    private JLabel labelFk;
    private JLabel labelPr;
    private JLabel labelJK;
    private JLabel labelNoUM;

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
            labelNama.setText("Nama                                      :   " + mhs.getNama());
            labelNIM.setText ("NIM                                          :   " + mhs.getNim());
            labelJP.setText  ("Jenjang Pendidikan            :   " + mhs.jenjangPendidikan());
            labelAkt.setText ("Angkatan                               :   " + mhs.tm());
            labelFk.setText  ("Fakultas                                 :   " + mhs.fakultas());
            labelPr.setText  ("Prodi                                       :   " + mhs.prodi());
            labelJK.setText  ("Jenis Kelamin                      :   " + mhs.jenisKelamin());
            labelNoUM.setText("Nomor urut Mahasiswa     :   " + mhs.noUM());
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
