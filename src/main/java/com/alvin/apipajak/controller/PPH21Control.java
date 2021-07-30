package com.alvin.apipajak.controller;

import com.alvin.apipajak.model.FormPPH21;
import com.alvin.apipajak.model.ResultPPH21;
import com.alvin.apipajak.model.TunjanganBPJS;
import com.alvin.apipajak.service.PPH21Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/pph21")
public class PPH21Control {

    public final PPH21Service pph21Service;

    @Autowired
    public PPH21Control(PPH21Service pph21Service){
        this.pph21Service = pph21Service;
    }

    @PostMapping
    public ResponseEntity<ResultPPH21> pph21Response(@RequestBody FormPPH21 formPPH21){

        return ResponseEntity.status(HttpStatus.OK).body(pph21Service.getResultPPH21(formPPH21));
    }


}
