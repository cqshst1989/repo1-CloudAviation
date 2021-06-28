package com.taoji666.foc.dao;

import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;


@Mapper
public interface FocMapper {
    public List<FOC> getFocByDate(Date date);
}
