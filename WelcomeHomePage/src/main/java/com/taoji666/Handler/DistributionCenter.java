package com.taoji666.Handler;

import com.taoji666.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.sql.Date;
import java.util.Map;

@RequestMapping("/DistributionCenter")
@Controller
public class DistributionCenter {
    private static final String FOC="focshow";  //航班信息管理
    private static final String Main="maintenanceshow";  //维修管理
    private static final String AIRSPARE="airspareshow";  //管理航材库存
    private static final String TG="tgshow";    //非例行（故障） 项目管理 AOG
    private static final String HR="hrshow";   //管理人员授权
    private static final String PPC="ppcshow"; //例行维修项目管理
    private Date toDay = new java.sql.Date(System.currentTimeMillis()); //从系统获取当前日期，格式刚好是yyyy-mm-dd
    @Resource
    private AirSpareStockService airSpareStockService;
    @Resource
    private FocService focService;
    @Resource
    private HrService hrService;
    @Resource
    private MaintenanceService maintenanceService;
    @Resource
    MaintenJobService maintenJobService;

    @RequestMapping(method = RequestMethod.POST)
    public String distributionCenter(@PathParam("Dept") String Dept, Map<String,Object> map{ //根据登录部门返回相应的登录界面
        switch (Dept){
            case "maintenance": {
                List<Maintenance> maintenanceList = maintenanceService.getMaintenanceByDate(toDay);
                map.put("maintain",maintenanceList);
                return Main;
            }
            case "foc": {
                List<FOC> focList = focService.getFocByDate(toDay); //根据当天的日期查找FOC表单
                map.put("foc",focList); //将查询到的FOC表单添加到http域
                return FOC;
            }

            case "airSpare": {    //读出所有航材，分页展示,先展示第一页
                List<Stock> airSpareList = airSpareStockService.getAirSpareAll();
                map.put("airSpareAll",airSpareList);
                return AIRSPARE;
            }

            case "hr": {    //返回员工名单
                List<Emp> empList = hrService.getEmpAll();
                map.put("empAll",empList);
                return HR;
            }

            case "tg": { //返回全机队故障页面,按故障状态排序
                List<NonRoutineJob> nonRoutineJobList = maintenJobService.getNonRoutineJobAll();
                map.put(nonRoutine,nonRoutineJobList);
                return TG;
            }

            case "ppc": {      //返回全机队维修计划管理页面（负责例行维修）
                List<RoutineJob> routineJobList = maintenJobService.getRoutineJobAll();
                map.put(routineJob,routineJobList);
                return PPC;
            }


            default:
                return "index";
        }

    }


}
