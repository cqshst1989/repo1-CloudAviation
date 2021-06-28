package com.taoji666.controller;


import com.taoji666.service.AirSpareStockService;
import com.taoji666.service.MaintenJobService;
import com.taoji666.service.MaintenanceService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MaintenJobController {
    @Resource
    private MaintenJobService maintenJobService;
    @Resource
    private AirSpareStockService airSpareStockService;
    @Resource
    private MaintenanceService maintenanceService;





}

