package com.taoji666.service;

import com.taoji666.service.fallback.GlobeFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(value = "MaintenJob-SERVICE",fallback = GlobeFallbackService.class) //相当于访问http：//MaintenJob-SERVICE/xx
public interface MaintenJobService {
    @GetMapping(value = "/getjob/nonroutione")
    public List<NonRoutineJob> getNonRoutineJobAll();

    @GetMapping(value = "/getjob/routione")
    public List<RoutineJob> getRoutineJobAll();

    public void RoutineJobUpdate(RoutineJob routineJob);
}
