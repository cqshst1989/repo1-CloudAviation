package com.taoji666.maintenjob.controller;


import com.taoji666.maintenjob.dao.MaintenJobMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;



@RestController
public class MaintenJobController {
    @Resource
    private MaintenJobMapper maintenJobMapper;

    @GetMapping(value = "/getjob/nonroutione")
    public List<NonRoutineJob> getNonRoutineJobAll(){
        maintenJobMapper.getNonRoutineJobAll();
    }

    @GetMapping(value = "/getjob/routione")
    public List<RoutineJob> getRoutineJobAll(){
        maintenJobMapper.getRoutineJobAll();
    }

}
