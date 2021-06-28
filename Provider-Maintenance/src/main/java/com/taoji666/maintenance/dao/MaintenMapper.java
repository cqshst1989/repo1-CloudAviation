package com.taoji666.maintenance.dao;

import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;

@Mapper
public interface MaintenMapper {
    public List<Maintenance> getMaintenanceByDate(Date date);
}
