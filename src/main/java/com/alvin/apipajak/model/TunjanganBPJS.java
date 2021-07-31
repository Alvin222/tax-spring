package com.alvin.apipajak.model;

public class TunjanganBPJS {
    private Long id;
    private Boolean jaminanKecelakaanKerja;
    private Boolean jaminanHariTua;
    private Boolean jaminanKematian;
    private Boolean jaminanPensiun;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getJaminanKecelakaanKerja() {
        return jaminanKecelakaanKerja;
    }

    public void setJaminanKecelakaanKerja(Boolean jaminanKecelakaanKerja) {
        this.jaminanKecelakaanKerja = jaminanKecelakaanKerja;
    }

    public Boolean getJaminanHariTua() {
        return jaminanHariTua;
    }

    public void setJaminanHariTua(Boolean jaminanHariTua) {
        this.jaminanHariTua = jaminanHariTua;
    }

    public Boolean getJaminanKematian() {
        return jaminanKematian;
    }

    public void setJaminanKematian(Boolean jaminanKematian) {
        this.jaminanKematian = jaminanKematian;
    }

    public Boolean getJaminanPensiun() {
        return jaminanPensiun;
    }

    public void setJaminanPensiun(Boolean jaminanPensiun) {
        this.jaminanPensiun = jaminanPensiun;
    }
}
