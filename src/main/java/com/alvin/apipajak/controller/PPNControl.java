package com.alvin.apipajak.controller;

import com.alvin.apipajak.model.FormPPN;
import com.alvin.apipajak.model.ResultPPN;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PPNControl {
    @RequestMapping(value="/ppn",method = RequestMethod.POST)
    public ResponseEntity<ResultPPN> ppnResponse(@RequestBody FormPPN formPPN){
        ResultPPN res = new ResultPPN();
        res.setStatus("OK");
        res.setNama(formPPN.getNama());
        res.setNamaItem(formPPN.getNamaItem());
        res.setHarga(formPPN.getHarga());
        res.setPpn(countPPN(formPPN.getHarga()));
        res.setHargaSetelahPPN(res.getHarga() + res.getPpn());
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    public Long countPPN(Long price){
        return (long) ((10f/100) * price);
    }
}
