package com.alvin.apipajak.service;

import com.alvin.apipajak.model.FormPBB;
import com.alvin.apipajak.model.ResultPBB;
import org.springframework.stereotype.Service;

@Service
public class PBBService {

    public ResultPBB getPBBResult(FormPBB formPBB){
        ResultPBB res = new ResultPBB();
        res.setNama(formPBB.getNama());
        res.setStatus("OK");
        res.setNJOP(countNJOP(formPBB));
        res.setNJKP(countNJKP(res.getNJOP()));
        res.setPBB(countPBB(res.getNJKP(), res.getNJOP()));
        return res;
    }

    public Long countNJOP(FormPBB form){
        return ((form.getLuasTanah() * form.getHargaTanahPerMeter()) + (form.getLuasBangunan() * form.getHargaBangunanPerMeter())) - form.getNJOPTKP();
    }

    public Long countNJKP(Long NJOP){
        Float presentaseNJKP;
        if (NJOP < 1000000000L){
            presentaseNJKP = 0.2f;
        } else {
            presentaseNJKP = 0.4f;
        }
        return (long) (presentaseNJKP * NJOP);
    }

    public Long countPBB(Long NJKP , Long NJOP){
        float presentasePBB;
        if (NJOP < 200000000L){
            presentasePBB = 0.0001f;
        } else if (NJOP < 200000000){
            presentasePBB = 0.001f;
        } else if (NJOP < 10000000000L){
            presentasePBB = 0.002f;
        } else {
            presentasePBB = 0.003f;
        }
        return (long) presentasePBB * NJKP;
    }
}
