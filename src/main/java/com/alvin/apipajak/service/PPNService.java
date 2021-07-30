package com.alvin.apipajak.service;

import com.alvin.apipajak.model.FormPPN;
import com.alvin.apipajak.model.ResultPPN;
import org.springframework.stereotype.Service;

@Service
public class PPNService {
    public ResultPPN getResultPPN(FormPPN formPPN){
        ResultPPN res = new ResultPPN();
        res.setStatus("OK");
        res.setNama(formPPN.getNama());
        res.setNamaItem(formPPN.getNamaItem());
        res.setHarga(formPPN.getHarga());
        res.setPpn((long) ((10f/100) * formPPN.getHarga()));
        res.setHargaSetelahPPN(res.getHarga() + res.getPpn());
        return res;
    }
}
