package com.alvin.apipajak.model;

public class ResultPBB {
    private String status;
    private String nama;
    private Long NJOP;
    private Long NJKP;
    private Long PBB;

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

    public Long getNJOP() {
        return NJOP;
    }

    public void setNJOP(Long NJOP) {
        this.NJOP = NJOP;
    }

    public Long getNJKP() {
        return NJKP;
    }

    public void setNJKP(Long NJKP) {
        this.NJKP = NJKP;
    }

    public Long getPBB() {
        return PBB;
    }

    public void setPBB(Long PBB) {
        this.PBB = PBB;
    }
}
