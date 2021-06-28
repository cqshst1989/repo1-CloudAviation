package com.taoji666.gataway.service;


import com.taoji666.gataway.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "HR-SERVICE",fallback = GlobeFallbackService.class)
public interface GetUserService {
    //获取FOC（运行控制部门）员工
    @GetMapping(value="/gethr/focuser")
    public List<Emp> getFocUser();

    //获取维修中心的员工
    @GetMapping(value="/gethr/maintenuser")
    public List<Emp> getMaintenUser();

    //获取技术组的（TG）的员工
    @GetMapping(value="/gethr/tguser")
    public List<Emp> getTgUser();

    //获取生产计划中心的（PPC）的员工
    @GetMapping(value="/gethr/ppcuser")
    public List<Emp> getPpcUser();

    //获取人力资源中心的（HR）的员工
    @GetMapping(value="/gethr/hruser")
    public List<Emp> getHrUser();

}
