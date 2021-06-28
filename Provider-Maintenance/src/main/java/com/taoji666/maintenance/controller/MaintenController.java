package com.taoji666.maintenance.controller;


import com.taoji666.maintenance.dao.MaintenMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;


@RestController
public class MaintenController {
    @Resource
    private MaintenMapper maintenMapper;
    @GetMapping(value = "/getmaintenance/today")
    public List<Maintenance> getMaintenanceByDate(Date date){

        return maintenMapper.getMaintenanceByDate(date);
    }

}
