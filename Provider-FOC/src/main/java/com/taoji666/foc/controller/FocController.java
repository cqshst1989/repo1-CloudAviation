package com.taoji666.foc.controller;

import com.taoji666.foc.dao.FocMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;

@RestController
public class FocController {
    @Resource
    private FocMapper focMapper;
    @GetMapping(value = "/getfoc/today")
    public List<FOC> getFocByDate(Date date){
        List<FOC> focList = focMapper.getFocByDate(date);
        return focList;
    }

}
