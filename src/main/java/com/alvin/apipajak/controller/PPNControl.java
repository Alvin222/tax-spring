package com.alvin.apipajak.controller;

import com.alvin.apipajak.model.FormPPN;
import com.alvin.apipajak.model.ResultPPN;
import com.alvin.apipajak.service.PPNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PPNControl {

    public final PPNService ppnService;

    @Autowired
    public PPNControl(PPNService ppnService){
        this.ppnService = ppnService;
    }

    @RequestMapping(value="/ppn",method = RequestMethod.POST)
    public ResponseEntity<ResultPPN> ppnResponse(@RequestBody FormPPN formPPN){
        return ResponseEntity.status(HttpStatus.OK).body(this.ppnService.getResultPPN(formPPN));
    }
}
