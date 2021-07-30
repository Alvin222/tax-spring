package com.alvin.apipajak.controller;

import com.alvin.apipajak.model.FormPBB;
import com.alvin.apipajak.model.ResultPBB;
import com.alvin.apipajak.service.PBBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pbb")
public class PBBControl {
    private final PBBService pbbService;

    @Autowired
    public PBBControl(PBBService pbbService){
        this.pbbService = pbbService;
    }

    @PostMapping
    public ResponseEntity<ResultPBB> pbbResponse(@RequestBody FormPBB formPBB){
        return ResponseEntity.status(HttpStatus.OK).body(this.pbbService.getPBBResult(formPBB));
    }


}
