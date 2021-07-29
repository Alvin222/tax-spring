package com.alvin.apipajak.model;

public class FormPBB {
    private String nama;
    private Integer luasTanah;
    private Integer luasBangunan;
    private Long hargaTanahPerMeter;
    private Long hargaBangunanPerMeter;
    private Long NJOPTKP;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(Integer luasTanah) {
        this.luasTanah = luasTanah;
    }

    public Integer getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(Integer luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public Long getHargaTanahPerMeter() {
        return hargaTanahPerMeter;
    }

    public void setHargaTanahPerMeter(Long hargaTanahPerMeter) {
        this.hargaTanahPerMeter = hargaTanahPerMeter;
    }

    public Long getHargaBangunanPerMeter() {
        return hargaBangunanPerMeter;
    }

    public void setHargaBangunanPerMeter(Long hargaBangunanPerMeter) {
        this.hargaBangunanPerMeter = hargaBangunanPerMeter;
    }

    public Long getNJOPTKP() {
        return NJOPTKP;
    }

    public void setNJOPTKP(Long NJOPTKP) {
        this.NJOPTKP = NJOPTKP;
    }
}
