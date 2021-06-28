package com.taoji666.service;

import com.taoji666.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.List;

@FeignClient(value = "AIRSPARESTOCK-SERVICE",fallback = GlobeFallbackService.class)
public interface AirSpareStockService {
    @GetMapping(value = "/getairspareall")
    public List<Stock> getAirSpareAll();
}
