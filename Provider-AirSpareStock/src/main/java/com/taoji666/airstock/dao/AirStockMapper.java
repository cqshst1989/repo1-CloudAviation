package com.taoji666.airstock.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AirStockMapper {

    public List<Stock> getAirSpareAll();
}
