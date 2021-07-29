package com.alvin.apipajak.model;

public class FormPPH21 {
    private String nama;
    private Long penghasilan;
    private Long tunjangan;
    private TunjanganBPJS tunjanganBPJS;
    private Boolean statusPernikahan;
    private Boolean pasanganBekerja;
    private Integer jumlahTanggungan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(Long penghasilan) {
        this.penghasilan = penghasilan;
    }

    public Long getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Long tunjangan) {
        this.tunjangan = tunjangan;
    }

    public TunjanganBPJS getTunjanganBPJS() {
        return tunjanganBPJS;
    }

    public void setTunjanganBPJS(TunjanganBPJS tunjanganBPJS) {
        this.tunjanganBPJS = tunjanganBPJS;
    }   

    public Boolean getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(Boolean statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public Boolean getPasanganBekerja() {
        return pasanganBekerja;
    }

    public void setPasanganBekerja(Boolean pasanganBekerja) {
        this.pasanganBekerja = pasanganBekerja;
    }

    public Integer getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    public void setJumlahTanggungan(Integer jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }
}
