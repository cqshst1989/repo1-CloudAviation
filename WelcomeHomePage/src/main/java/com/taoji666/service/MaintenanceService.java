package com.taoji666.service;

import com.taoji666.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@FeignClient(value = "Maintenance-Service",fallback = GlobeFallbackService.class) //相当于访问http：//Maintenance-Service-Service/
public interface MaintenanceService() {

    @GetMapping(value = "/getMaintenance/toDay")
    public List<Maintenance> getMaintenanceByDate(Date date);




}
