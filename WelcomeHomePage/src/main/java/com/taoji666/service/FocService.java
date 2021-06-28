package com.taoji666.service;

import com.taoji666.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@FeignClient(value = "FOC-SERVICE",fallback = GlobeFallbackService.class) //相当于访问http：//Foc-Service/getFocToDay
public interface FocService {
    @GetMapping(value = "/getfoc/today")
    public List<FOC> getFocByDate(Date date);
}
