package com.alvin.apipajak.model;

public class ResultPPH21 {
    private String status;
    private String nama;
    private Long penghasilan;
    private Boolean statusPernikahan;
    private Long PKP;
    private Long PPHTerhutang;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public Boolean getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(Boolean statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public Long getPKP() {
        return PKP;
    }

    public void setPKP(Long PKP) {
        this.PKP = PKP;
    }

    public Long getPPHTerhutang() {
        return PPHTerhutang;
    }

    public void setPPHTerhutang(Long PPHTerhutang) {
        this.PPHTerhutang = PPHTerhutang;
    }
}
