package com.alvin.apipajak.service;

import com.alvin.apipajak.model.FormPPH21;
import com.alvin.apipajak.model.ResultPPH21;
import com.alvin.apipajak.model.TunjanganBPJS;
import org.springframework.stereotype.Service;

@Service
public class PPH21Service {

    public ResultPPH21 getResultPPH21(FormPPH21 formPPH21){
        ResultPPH21 res = new ResultPPH21();
        try {
            if (formPPH21.getPenghasilan() < 4500000){
                throw new Exception("Penghasilan Minimum Untuk PPH 21 adalah 4.500.000");
            }
            if (formPPH21.getJumlahTanggungan() > 3){
                throw new Exception("Maksimal Tanggungan Adalah 3 Orang");
            }
            res.setNama(formPPH21.getNama());
            res.setPenghasilan(formPPH21.getPenghasilan());
            res.setStatusPernikahan(formPPH21.getStatusPernikahan());
            Long PKP = countPKP(formPPH21);
            res.setPKP(PKP);
            res.setPPHTerhutang(countPPHTerutang(PKP));
            res.setStatus("OK");
        } catch (Exception e){
            res.setStatus(e.getMessage());
            res.setNama(null);
            res.setPenghasilan(null);
            res.setPKP(null);
            res.setStatusPernikahan(null);
            res.setPPHTerhutang(null);
        }
        return res;
    }

    public Long countPKP(FormPPH21 form){
        Long PTKP = 54000000L;
        Integer tanggungan = form.getJumlahTanggungan();
        if (form.getStatusPernikahan() && form.getPasanganBekerja()){
            PTKP *= 2;
        } else if (form.getStatusPernikahan() && !form.getPasanganBekerja()){
            tanggungan += 1;
        }
        PTKP += countPTKPTanggungan(tanggungan);
        Long penghasilanNettoTahunan = countPenghasilanBersih(form.getPenghasilan(), form.getTunjangan(),form.getTunjanganBPJS()) * 12;


        return penghasilanNettoTahunan - PTKP;
    }

    public Long countPTKPTanggungan(Integer jumlahTanggungan){
        return 4500000L * jumlahTanggungan;
    }

    public Long countPenghasilanBersih(Long penghasilan, Long tunjangan, TunjanganBPJS tunjanganBPJS){
        Long pengurangan = 0L;
        Long jaminanKecelakaanKerja = (long) ((0.24f / 100) * penghasilan);
        Long jaminanKematian = (long) ((0.3f / 100) * penghasilan);
        Long jaminanHariTua = (long) ((2f / 100) * penghasilan);
        Long jaminanPensiun = (long) (( 1f / 100) * penghasilan);
        if (tunjanganBPJS.getJaminanKecelakaanKerja()){ tunjangan += jaminanKecelakaanKerja; }
        else { pengurangan += jaminanKecelakaanKerja; }
        if (tunjanganBPJS.getJaminanKematian()){ tunjangan += jaminanKematian;}
        else {pengurangan += jaminanKematian;}
        if (tunjanganBPJS.getJaminanHariTua()) {tunjangan += jaminanHariTua;}
        else {pengurangan += jaminanHariTua;}
        if (tunjanganBPJS.getJaminanPensiun()){tunjangan += jaminanPensiun;}
        else {pengurangan += jaminanPensiun;}
        Long penghasilanBruto = penghasilan + tunjangan;
        pengurangan += (long) ((5f / 100) * penghasilanBruto); //Biaya Jabatan 5% dari penghasilan Bruto
        return penghasilanBruto - pengurangan;
    }

    public Long countPPHTerutang(Long PKP){
        Long PPHTerutang;
        if (PKP < 50000000) PPHTerutang = (long) ((5f / 100) * PKP);
        else if (PKP < 250000000) PPHTerutang = (long) ((15f / 100) * PKP);
        else if (PKP < 500000000) PPHTerutang = (long) ((25f / 100) * PKP);
        else PPHTerutang = (long) ((30f / 100) * PKP);
        return PPHTerutang;
    }
}
