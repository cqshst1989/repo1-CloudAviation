package com.taoji666.Hr.controller;


import com.taoji666.Hr.dao.HrMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.EmptyStackException;
import java.util.List;

@RestController
public class HrController {
    @Resource
    private HrMapper hrMapper;

    @GetMapping(value = "/gethr")
    public List<Emp> getEmpAll(){
        return hrMapper.getEmpAll();
    }

    @GetMapping(value="/gethr/focuser")
    public List<Emp> getFocUser(){
        return hrMapper.getFocUser();
    }

    //获取维修中心的员工
    @GetMapping(value="/gethr/maintenuser")
    public List<Emp> getMaintenUser(){
        return hrMapper.getMaintenUser();
    }

    //获取技术组的（TG）的员工
    @GetMapping(value="/gethr/tguser")
    public List<Emp> getTgUser(){
        return hrMapper.getTgUser();
    }

    //获取生产计划中心的（PPC）的员工
    @GetMapping(value="/gethr/ppcuser")
    public List<Emp> getPpcUser(){
        return hrMapper.getPpcUser();
    }

    //获取人力资源中心的（HR）的员工
    @GetMapping(value="/gethr/hruser")
    public List<Emp> getHrUser(){
        return hrMapper.getHrUser();
    };

}
