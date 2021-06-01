package NIM.GUI;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    // sample : 12050112257

    // 1
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "NOT FOUND";
    }

    // 18 19 20
    public String tm() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "NOT FOUND";
        }
    }

    // 5
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Tarbiyah dan Keguruan";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas Syari'ah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Ushuluddin";
        }else if (fac.equalsIgnoreCase("4")) {
            return "Fakultas Dakwah dan Komunikasi";
        }else if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Sains dan Teknologi";
        }else if (fac.equalsIgnoreCase("6")) {
            return "Psikologi";
        }else if (fac.equalsIgnoreCase("7")) {
            return "Fakultas Ekonomi dan Ilmu Sosial";
        }else if (fac.equalsIgnoreCase("8")) {
            return "Fakultas Pertanian dan Peternakan";
        }else {
            return "NOT FOUND";
        }
    }

    // 01
    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "NOT FOUND";
    }

    // 1
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "NOT FOUND";
    }

    // 2257
    public String noUM() {
        return this.nim.substring(7,11);
    }
}
