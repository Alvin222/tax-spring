package com.alvin.apipajak.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeControl {

    @RequestMapping(value="/index")
    public String index(){
         JdbcTemplate jdbcTemplate = new JdbcTemplate();
         jdbcTemplate.update("INSERT INTO usrauth VALUES (?, ?, ?)","XYZ1234567","Bill", "Gates");
         return jdbcTemplate.queryForObject("SELECT * FROM usrauth",String.class) ;
    }
}
