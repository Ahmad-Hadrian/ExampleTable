package gui;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String fakultas;
    private String jurusan;
    private String agama;

    public Mahasiswa() {
    }


    public Mahasiswa(String nama, String nim, String fakultas, String jurusan, String agama) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.agama = agama;
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

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", fakultas='" + fakultas + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", agama='" + agama + '\'' +
                '}';
    }
}
