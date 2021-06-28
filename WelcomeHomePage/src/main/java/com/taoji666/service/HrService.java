package com.taoji666.service;

import com.taoji666.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(value = "HR-SERVICE",fallback = GlobeFallbackService.class) //相当于访问http：//HR-Service/gethr
public interface HrService {
    @GetMapping(value = "/gethr")
    public List<FOC> getEmpAll();
}
