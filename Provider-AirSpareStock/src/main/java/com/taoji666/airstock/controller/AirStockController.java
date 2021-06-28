package com.taoji666.airstock.controller;


import com.taoji666.airstock.dao.AirStockMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AirStockController {
    @Resource
    private AirStockMapper airStockMapper;

    @GetMapping(value = "/getairspareall")
    public List<Stock> getAirSpareAll(){
        List<Stock> airSpareList = airStockMapper.getAirSpareAll();
        return airSpareList;
    }
}
