package com.taoji666.maintenjob.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaintenJobMapper {

    public List<NonRoutineJob> getNonRoutineJobAll();

    public List<RoutineJob> getRoutineJobAll();

    public void RoutineJobUpdate(RoutineJob routineJob);
}
