package com.alvin.apipajak.model;

public class ResultPPN {
    private String status;
    private String nama;
    private String namaItem;
    private Long harga;
    private Long ppn;
    private Long hargaSetelahPPN;

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

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Long getPpn() {
        return ppn;
    }

    public void setPpn(Long ppn) {
        this.ppn = ppn;
    }

    public Long getHargaSetelahPPN() {
        return hargaSetelahPPN;
    }

    public void setHargaSetelahPPN(Long hargaSetelahPPN) {
        this.hargaSetelahPPN = hargaSetelahPPN;
    }
}
